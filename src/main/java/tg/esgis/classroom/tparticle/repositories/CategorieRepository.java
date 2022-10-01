package tg.esgis.classroom.tparticle.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tg.esgis.classroom.tparticle.entities.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, String> {
    public Categorie findByIdCateg(Integer idCateg);

    public void deleteByIdCateg(Integer idCateg);

    public Categorie findByIdCategAndLibelle(Integer idCateg, String libelle);
}
