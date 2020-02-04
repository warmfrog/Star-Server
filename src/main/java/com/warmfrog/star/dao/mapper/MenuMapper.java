package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.Menu;
import com.warmfrog.star.dao.mapper.entity.MenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MenuMapper {
    long countByExample(MenuCriteria example);

    int deleteByExample(MenuCriteria example);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExampleWithRowbounds(MenuCriteria example, RowBounds rowBounds);

    List<Menu> selectByExample(MenuCriteria example);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuCriteria example);
}