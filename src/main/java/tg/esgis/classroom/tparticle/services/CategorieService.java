package tg.esgis.classroom.tparticle.services;

import tg.esgis.classroom.tparticle.entities.Categorie;

import java.util.List;

public interface CategorieService {
    public List<Categorie> getAll();

    public Categorie getOne(Integer id);

    public void deleteCategorie(Integer id);

    //public Categorie updateCategorie(Categorie categorie)
    public Categorie createCategorie(Categorie categorie);

    public Categorie findCateg(Integer idCateg, String libelle);
}
