package tg.esgis.classroom.tparticle.dtos;

import lombok.*;

import java.util.List;

//Get & set
@Data
// constructor arg
@AllArgsConstructor
//constructor no arg
@NoArgsConstructor
//string object
@ToString
public class CategorieDTO {
    private Integer idCateg;
    private String libelle;
    private List<ArticleDTO> articles;
    /*public Integer getIdCateg() {
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

    public CategorieDTO(Integer idCateg, String libelle) {
        this.idCateg = idCateg;
        this.libelle = libelle;
    }

    public CategorieDTO() {
    }

    @Override
    public String toString() {
        return "CategorieDTO{" +
                "idCateg=" + idCateg +
                ", libelle='" + libelle + '\'' +
                '}';
    }*/
}
