package tg.esgis.classroom.tparticle.controllers;

import com.google.common.reflect.TypeToken;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tg.esgis.classroom.tparticle.dtos.ArticleDTO;
import tg.esgis.classroom.tparticle.dtos.CategorieDTO;
import tg.esgis.classroom.tparticle.entities.Article;
import tg.esgis.classroom.tparticle.entities.Categorie;
import tg.esgis.classroom.tparticle.services.ArticleService;
import tg.esgis.classroom.tparticle.services.CategorieService;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CategorieService categorieService;

    @GetMapping(value = "/list")
    public List<ArticleDTO> getAll() {
        List<Article> articles = articleService.getAll();
        TypeToken<List<ArticleDTO>> typeToken = new TypeToken<List<ArticleDTO>>(ArticleDTO.class) {
        };
        return modelMapper.map(articles, typeToken.getType());
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createArticle(@RequestBody ArticleDTO articleDTO) {
        articleService.createArticle(modelMapper.map(articleDTO, Article.class));
        //Mettre ajour la catégorie en rajoutant l'article à la liste des articles de cette catégorie
        System.out.println("COEIRU");
        Categorie categorie = modelMapper.map(articleDTO, Article.class).getCategorie();
        categorie = categorieService.findCateg(categorie.getIdCateg(), categorie.getLibelle());
        System.out.println(categorie.toString());
        categorie.getArticles().add(modelMapper.map(articleDTO, Article.class));
        categorieService.createCategorie(categorie);
        return new ResponseEntity("Entegistrement effectué avec succès", HttpStatus.OK);
    }

    @GetMapping(value = "/by_id/{idart}")
    public ArticleDTO getOne(@PathVariable("idart") Integer id) {
        Article article = articleService.getOne(id);
        return modelMapper.map(article, ArticleDTO.class);
    }

    @DeleteMapping(value = "/by_id/{idart}")
    public ResponseEntity<?> deleteArticle(@PathVariable("idart") Integer id) {
        articleService.deleteArticle(id);
        return new ResponseEntity("Suppression effectuée avec succès", HttpStatus.OK);
    }
}
