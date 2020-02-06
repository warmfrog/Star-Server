package com.warmfrog.star.service.impl;

import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.AlbumBuilder;
import com.warmfrog.star.common.dto.AlbumDto;
import com.warmfrog.star.common.vo.AlbumVo;
import com.warmfrog.star.dao.AlbumDao;
import com.warmfrog.star.dao.mapper.entity.Album;
import com.warmfrog.star.dao.mapper.entity.AlbumCriteria;
import com.warmfrog.star.service.AlbumService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/6
 */
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    AlbumDao albumDao;

    @Override
    public void insert(AlbumDto albumDto) {
        albumDao.getMapper().insert(AlbumBuilder.newInstance().buildInsert(albumDto));
    }

    @Override
    public void update(AlbumDto albumDto) {
        albumDao.getMapper().updateByPrimaryKeySelective(AlbumBuilder.newInstance().buildUpdate(albumDto));
    }

    @Override
    public void delete(AlbumDto albumDto) {
        albumDao.getMapper().updateByPrimaryKeySelective(AlbumBuilder.newInstance().buildDelete(albumDto));
    }

    @Override
    public AlbumVo get(AlbumDto albumDto) {
        Album album = albumDao.getMapper().selectByPrimaryKey(albumDto.getUuid());
        AlbumVo albumVo = new AlbumVo();
        BeanUtils.copyProperties(album, albumVo);
        return albumVo;
    }

    @Override
    public List<AlbumVo> list(AlbumDto albumDto) {
        AlbumCriteria example = new AlbumCriteria();
        example.createCriteria();
        List<Album> albums = albumDao.getMapper().selectByExample(example);
        List<AlbumVo> albumVos = new ArrayList<>();
        albums.forEach(album -> {
            AlbumVo albumVo = new AlbumVo();
            BeanUtils.copyProperties(album, albumVo);
            albumVos.add(albumVo);
        });
        return albumVos;
    }

    @Override
    public PageInfo<AlbumVo> listByPage(AlbumDto albumDto) {
        AlbumCriteria example = new AlbumCriteria();
        example.createCriteria();
        List<Album> albums = albumDao.getMapper().selectByExample(example);
        List<AlbumVo> albumVos = new ArrayList<>();
        albums.forEach(album -> {
            AlbumVo albumVo = new AlbumVo();
            BeanUtils.copyProperties(album, albumVo);
            albumVos.add(albumVo);
        });
        PageInfo<AlbumVo> pageInfo = new PageInfo<>();
        pageInfo.setPageSize(albumDto.getPageSize());
        pageInfo.setPageNum(albumDto.getCurrentPage());
        pageInfo.setList(albumVos);
        return pageInfo;
    }
}
