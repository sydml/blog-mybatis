package cn.yml.blog.dao;

import cn.yml.blog.entity.ArticleContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleContent record);

    int insertSelective(ArticleContent record);

    ArticleContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleContent record);

    int updateByPrimaryKey(ArticleContent record);

    List<ArticleContent> selectByArticleId(@Param(value="articleId") Long articleId);
}