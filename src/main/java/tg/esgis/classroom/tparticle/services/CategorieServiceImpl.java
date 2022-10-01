package tg.esgis.classroom.tparticle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.esgis.classroom.tparticle.entities.Categorie;
import tg.esgis.classroom.tparticle.repositories.CategorieRepository;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public List<Categorie> getAll(){
        return categorieRepository.findAll();
    }

    @Override
    public Categorie getOne(Integer id) {
        return categorieRepository.findByIdCateg(id);
    }

    @Override
    public Categorie createCategorie(Categorie categorie){
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorie(Integer id){
        categorieRepository.deleteByIdCateg(id);
    }

    @Override
    public Categorie findCateg(Integer idCateg, String libelle) { return categorieRepository.findByIdCategAndLibelle(idCateg, libelle); }
}
