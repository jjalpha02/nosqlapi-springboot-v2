package tg.esgis.classroom.tparticle.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "article")
public class Article {

    private Integer idArt;
    private String libelle;
    private double prixUnitaire;
    private int quantite;
    private Categorie categorie;

    public Article() {
    }

    public Article(Integer idArt, String libelle, double prixUnitaire, int quantite) {
        this.idArt = idArt;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    public Article(Integer idArt, String libelle, double prixUnitaire, int quantite, Categorie categorie) {
        this.idArt = idArt;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Integer getIdArt() {
        return idArt;
    }

    public void setIdArt(Integer idArt) {
        this.idArt = idArt;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
