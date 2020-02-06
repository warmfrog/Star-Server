package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.SiteDto;
import com.warmfrog.star.dao.mapper.entity.Site;
import org.springframework.beans.BeanUtils;

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
        return site;
    }

    @Override
    public Site buildUpdate(SiteDto siteDto) {
        Site site = new Site();
        BeanUtils.copyProperties(siteDto, site);
        return site;
    }

    @Override
    public Site buildDelete(SiteDto siteDto) {
        Site site = new Site();
        BeanUtils.copyProperties(siteDto, site);
        return site;
    }
}
