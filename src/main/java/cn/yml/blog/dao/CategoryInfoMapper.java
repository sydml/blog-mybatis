package cn.yml.blog.dao;

import cn.yml.blog.entity.CategoryInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CategoryInfo record);

    int insertSelective(CategoryInfo record);

    CategoryInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategoryInfo record);

    int updateByPrimaryKey(CategoryInfo record);

    List<CategoryInfo> selectAll();

    void deductNumber(@Param("id") Long id);
}