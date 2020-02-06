package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.AlbumDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.util.UUIDUtil;
import com.warmfrog.star.dao.mapper.entity.Album;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author libo
 * @date 2020/2/6
 */
public class AlbumBuilder implements BaseBuilder<Album, AlbumDto> {
    static AlbumBuilder instance;

    private AlbumBuilder() {
    }

    public static AlbumBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new AlbumBuilder();
        }
        return instance;
    }

    @Override
    public Album buildInsert(AlbumDto albumDto) {
        Album album = new Album();
        BeanUtils.copyProperties(albumDto, album);
        album.setUuid(UUIDUtil.getUUID());
        Date now = new Date();
        album.setCreateTime(now);
        album.setUpdateTime(now);
        album.setCreateUser("admin");
        album.setUpdateUser("admin");
        album.setDeleteFlag(DeleteFlagEnum.NODELETE.getValue());
        return album;
    }

    @Override
    public Album buildUpdate(AlbumDto albumDto) {
        Album album = new Album();
        BeanUtils.copyProperties(albumDto, album);
        Date now = new Date();
        album.setUpdateTime(now);
        album.setUpdateUser("test");
        return album;
    }

    @Override
    public Album buildDelete(AlbumDto albumDto) {
        Album album = new Album();
        album.setUuid(albumDto.getUuid());
        album.setDeleteFlag(DeleteFlagEnum.DELETED.getValue());
        Date now = new Date();
        album.setUpdateTime(now);
        album.setUpdateUser("test");
        return album;
    }
}
