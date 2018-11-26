package cn.yml.blog.dao;

import cn.yml.blog.entity.ArticleCategory;

import java.util.List;

public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    ArticleCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);

    List<ArticleCategory> selectByCategoryId(Long categoryId);

    void deleteByCategoryId(Long categoryId);

    List<ArticleCategory> selectByArticleId(Long articleId);
}