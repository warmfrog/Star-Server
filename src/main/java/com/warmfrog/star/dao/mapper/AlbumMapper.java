package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.Album;
import com.warmfrog.star.dao.mapper.entity.AlbumCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AlbumMapper {
    long countByExample(AlbumCriteria example);

    int deleteByExample(AlbumCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(Album record);

    int insertSelective(Album record);

    List<Album> selectByExampleWithRowbounds(AlbumCriteria example, RowBounds rowBounds);

    List<Album> selectByExample(AlbumCriteria example);

    Album selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Album record, @Param("example") AlbumCriteria example);

    int updateByExample(@Param("record") Album record, @Param("example") AlbumCriteria example);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);
}