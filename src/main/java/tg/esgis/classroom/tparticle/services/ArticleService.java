package tg.esgis.classroom.tparticle.services;

import tg.esgis.classroom.tparticle.entities.Article;

import java.util.List;

public interface ArticleService {

    public List<Article> getAll();

    public Article getOne(Integer id);

    public void deleteArticle(Integer id);

    public Article createArticle(Article article);
}
