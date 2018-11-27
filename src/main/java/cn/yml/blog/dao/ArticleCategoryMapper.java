package cn.yml.blog.dao;

import cn.yml.blog.entity.ArticleCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    ArticleCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);

    List<ArticleCategory> selectByCategoryId(@Param(value="categoryId")Long categoryId);

    void deleteByCategoryId(@Param(value="categoryId") Long categoryId);

    List<ArticleCategory> selectByArticleId(@Param(value="articleId") Long articleId);
}