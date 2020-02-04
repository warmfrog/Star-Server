package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.Site;
import com.warmfrog.star.dao.mapper.entity.SiteCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SiteMapper {
    long countByExample(SiteCriteria example);

    int deleteByExample(SiteCriteria example);

    int insert(Site record);

    int insertSelective(Site record);

    List<Site> selectByExampleWithRowbounds(SiteCriteria example, RowBounds rowBounds);

    List<Site> selectByExample(SiteCriteria example);

    int updateByExampleSelective(@Param("record") Site record, @Param("example") SiteCriteria example);

    int updateByExample(@Param("record") Site record, @Param("example") SiteCriteria example);
}