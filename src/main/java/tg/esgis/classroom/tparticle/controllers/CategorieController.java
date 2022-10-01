package tg.esgis.classroom.tparticle.controllers;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.google.common.reflect.TypeToken;

import tg.esgis.classroom.tparticle.dtos.CategorieDTO;
import tg.esgis.classroom.tparticle.entities.Categorie;
import tg.esgis.classroom.tparticle.services.CategorieService;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;
    @Autowired
    private ModelMapper modelMapper;

    /*
    @GetMapping
    public List<CategorieDTO> getAll(){
        List<Categorie> categories = categorieService.getAll();
        TypeToken<List<CategorieDTO>> typeToken = new TypeToken<List<CategorieDTO>>(CategorieDTO.class){};
        return modelMapper.map(categories,typeToken.getType());
    }*/
    @GetMapping
    public List<Categorie> getAll(){
        List<Categorie> categories = categorieService.getAll();
        return categories;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createCategorie(@RequestBody CategorieDTO categorieDTO){
        categorieService.createCategorie(modelMapper.map(categorieDTO, Categorie.class));
        System.out.println(categorieDTO);
        return new ResponseEntity("Entegistrement effectué avec succès", HttpStatus.OK);
    }

    @GetMapping(value = "/by_id/{idcateg}")
    public CategorieDTO getOne(@PathVariable("idcateg") Integer id){
        Categorie categorie = categorieService.getOne(id);
        return modelMapper.map(categorie,CategorieDTO.class);
    }

    @DeleteMapping(value = "/by_id/{idcateg}")
    public ResponseEntity<?> deleteCategorie(@PathVariable("idcateg") Integer id){
        categorieService.deleteCategorie(id);
        return new ResponseEntity("Suppression effectuée avec succès", HttpStatus.OK);
    }

}
