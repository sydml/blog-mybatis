package cn.yml.blog.dao;

import cn.yml.blog.entity.ArticleComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleComment record);

    int insertSelective(ArticleComment record);

    ArticleComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleComment record);

    int updateByPrimaryKey(ArticleComment record);

    List<ArticleComment> selectByArticleId(@Param(value="articleId") Long articleId);
}