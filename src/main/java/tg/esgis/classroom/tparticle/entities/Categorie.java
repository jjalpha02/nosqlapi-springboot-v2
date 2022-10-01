package tg.esgis.classroom.tparticle.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "categorie")
public class Categorie implements Serializable {
    private Integer idCateg;
    private String libelle;
    private List<Article> articles = new ArrayList<>();

    public Categorie() {
    }

    public Categorie(Integer idCateg, String libelle, List<Article> articles) {
        this.idCateg = idCateg;
        this.libelle = libelle;
        this.articles = articles == null ? new ArrayList<>() : articles;
    }

    public Integer getIdCateg() {
        return idCateg;
    }

    public void setIdCateg(Integer idCateg) {
        this.idCateg = idCateg;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
