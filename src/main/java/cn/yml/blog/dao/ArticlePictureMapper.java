package cn.yml.blog.dao;

import cn.yml.blog.entity.ArticlePicture;

import java.util.List;

public interface ArticlePictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticlePicture record);

    int insertSelective(ArticlePicture record);

    ArticlePicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticlePicture record);

    int updateByPrimaryKey(ArticlePicture record);

    List<ArticlePicture> selectByArticleId(Long articleId);
}