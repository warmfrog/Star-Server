package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.AlbumExtMapper;
import com.warmfrog.star.dao.mapper.AlbumMapper;
import com.warmfrog.star.dao.mapper.entity.Album;

/**
 * @author libo
 * @date 2020/2/6
 */
public class AlbumDao extends BaseDao<AlbumMapper, AlbumExtMapper, Album> {
    @Override
    protected void setMapperClass() {
        this.setMapperClass(AlbumMapper.class);
        this.setExtMapperClass(AlbumExtMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(Album.class);
    }
}
