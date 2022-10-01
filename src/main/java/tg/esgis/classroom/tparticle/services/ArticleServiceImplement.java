package tg.esgis.classroom.tparticle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.esgis.classroom.tparticle.entities.Article;
import tg.esgis.classroom.tparticle.entities.Categorie;
import tg.esgis.classroom.tparticle.repositories.ArticleRepository;

import java.util.List;

@Service
public class ArticleServiceImplement implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAll(){
        return articleRepository.findAll();
    }

    @Override
    public Article getOne(Integer id) {
        return articleRepository.findByIdArt(id);
    }

    @Override
    public Article createArticle(Article article){
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Integer id){
        articleRepository.deleteByIdArt(id);
    }
}
