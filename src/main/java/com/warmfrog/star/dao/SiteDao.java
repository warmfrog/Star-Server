package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.SiteExtMapper;
import com.warmfrog.star.dao.mapper.SiteMapper;
import com.warmfrog.star.dao.mapper.entity.Site;
import org.springframework.stereotype.Repository;

/**
 * @author libo
 * @date 2020/2/6
 */
@Repository
public class SiteDao extends BaseDao<SiteMapper, SiteExtMapper, Site> {
    @Override
    protected void setMapperClass() {
        this.setMapperClass(SiteMapper.class);
        this.setExtMapperClass(SiteExtMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(Site.class);
    }
}
