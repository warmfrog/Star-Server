package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.App;
import com.warmfrog.star.dao.mapper.entity.AppCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppMapper {
    long countByExample(AppCriteria example);

    int deleteByExample(AppCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(App record);

    int insertSelective(App record);

    List<App> selectByExampleWithRowbounds(AppCriteria example, RowBounds rowBounds);

    List<App> selectByExample(AppCriteria example);

    App selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") App record, @Param("example") AppCriteria example);

    int updateByExample(@Param("record") App record, @Param("example") AppCriteria example);

    int updateByPrimaryKeySelective(App record);

    int updateByPrimaryKey(App record);
}