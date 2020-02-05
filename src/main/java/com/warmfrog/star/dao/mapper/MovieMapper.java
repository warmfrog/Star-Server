package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.Movie;
import com.warmfrog.star.dao.mapper.entity.MovieCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MovieMapper {
    long countByExample(MovieCriteria example);

    int deleteByExample(MovieCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(Movie record);

    int insertSelective(Movie record);

    List<Movie> selectByExampleWithRowbounds(MovieCriteria example, RowBounds rowBounds);

    List<Movie> selectByExample(MovieCriteria example);

    Movie selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Movie record, @Param("example") MovieCriteria example);

    int updateByExample(@Param("record") Movie record, @Param("example") MovieCriteria example);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}