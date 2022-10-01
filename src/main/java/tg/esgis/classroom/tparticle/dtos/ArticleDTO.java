package tg.esgis.classroom.tparticle.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ArticleDTO {

    private Integer idArt;
    private String libelle;
    private double prixUnitaire;
    private int quantite;
    private CategorieDTO categorie;
}
