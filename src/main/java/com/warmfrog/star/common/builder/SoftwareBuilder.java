package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.SoftwareDto;
import com.warmfrog.star.dao.mapper.entity.Software;
import org.springframework.beans.BeanUtils;

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
        return software;
    }

    @Override
    public Software buildUpdate(SoftwareDto softwareDto) {
        Software software = new Software();
        BeanUtils.copyProperties(softwareDto, software);
        return software;
    }

    @Override
    public Software buildDelete(SoftwareDto softwareDto) {
        Software software = new Software();
        BeanUtils.copyProperties(softwareDto, software);
        return software;
    }
}
