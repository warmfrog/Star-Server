package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.SiteDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.util.UUIDUtil;
import com.warmfrog.star.dao.mapper.entity.Site;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author libo
 * @date 2020/2/6
 */
public class SiteBuilder implements BaseBuilder<Site, SiteDto> {
    static SiteBuilder instance;

    private SiteBuilder() {
    }

    public static SiteBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new SiteBuilder();
        }
        return instance;
    }

    @Override
    public Site buildInsert(SiteDto siteDto) {
        Site site = new Site();
        BeanUtils.copyProperties(siteDto, site);
        site.setUuid(UUIDUtil.getUUID());
        Date now = new Date();
        site.setCreateTime(now);
        site.setUpdateTime(now);
        site.setCreateUser("admin");
        site.setUpdateUser("admin");
        site.setDeleteFlag(DeleteFlagEnum.NODELETE.getValue());
        return site;
    }

    @Override
    public Site buildUpdate(SiteDto siteDto) {
        Site site = new Site();
        BeanUtils.copyProperties(siteDto, site);
        Date now = new Date();
        site.setUpdateTime(now);
        site.setUpdateUser("test");
        return site;
    }

    @Override
    public Site buildDelete(SiteDto siteDto) {
        Site site = new Site();
        site.setUuid(siteDto.getUuid());
        site.setDeleteFlag(DeleteFlagEnum.DELETED.getValue());
        Date now = new Date();
        site.setUpdateTime(now);
        site.setUpdateUser("test");
        return site;
    }
}
