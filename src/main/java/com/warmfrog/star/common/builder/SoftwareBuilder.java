package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.SoftwareDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.dao.mapper.entity.Software;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author libo
 * @date 2020/2/6
 */
public class SoftwareBuilder implements BaseBuilder<Software, SoftwareDto> {
    static SoftwareBuilder instance;

    private SoftwareBuilder() {
    }

    public static SoftwareBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new SoftwareBuilder();
        }
        return instance;
    }

    @Override
    public Software buildInsert(SoftwareDto softwareDto) {
        Software software = new Software();
        BeanUtils.copyProperties(softwareDto, software);
        Date now = new Date();
        software.setCreateTime(now);
        software.setUpdateTime(now);
        software.setCreateUser("admin");
        software.setUpdateUser("admin");
        return software;
    }

    @Override
    public Software buildUpdate(SoftwareDto softwareDto) {
        Software software = new Software();
        BeanUtils.copyProperties(softwareDto, software);
        Date now = new Date();
        software.setUpdateTime(now);
        software.setUpdateUser("test");
        return software;
    }

    @Override
    public Software buildDelete(SoftwareDto softwareDto) {
        Software software = new Software();
        software.setUuid(softwareDto.getUuid());
        software.setDeleteFlag(DeleteFlagEnum.DELETED.getValue());
        Date now = new Date();
        software.setUpdateTime(now);
        software.setUpdateUser("test");
        return software;
    }
}
