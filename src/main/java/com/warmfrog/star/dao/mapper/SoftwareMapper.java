package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.Software;
import com.warmfrog.star.dao.mapper.entity.SoftwareCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SoftwareMapper {
    long countByExample(SoftwareCriteria example);

    int deleteByExample(SoftwareCriteria example);

    int insert(Software record);

    int insertSelective(Software record);

    List<Software> selectByExampleWithRowbounds(SoftwareCriteria example, RowBounds rowBounds);

    List<Software> selectByExample(SoftwareCriteria example);

    int updateByExampleSelective(@Param("record") Software record, @Param("example") SoftwareCriteria example);

    int updateByExample(@Param("record") Software record, @Param("example") SoftwareCriteria example);
}