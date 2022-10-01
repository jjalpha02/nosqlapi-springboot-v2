package tg.esgis.classroom.tparticle.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tg.esgis.classroom.tparticle.entities.Article;

public interface ArticleRepository extends MongoRepository<Article, String> {

    public Article findByIdArt(Integer idArt);

    public void deleteByIdArt(Integer idArt);
}
