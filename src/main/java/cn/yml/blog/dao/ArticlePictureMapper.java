package cn.yml.blog.dao;

import cn.yml.blog.entity.ArticlePicture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticlePictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticlePicture record);

    int insertSelective(ArticlePicture record);

    ArticlePicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticlePicture record);

    int updateByPrimaryKey(ArticlePicture record);

    List<ArticlePicture> selectByArticleId(@Param(value="articleId") Long articleId);
}