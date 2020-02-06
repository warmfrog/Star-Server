package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.SoftwareExtMapper;
import com.warmfrog.star.dao.mapper.SoftwareMapper;
import com.warmfrog.star.dao.mapper.entity.Software;

/**
 * @author libo
 * @date 2020/2/6
 */
public class SoftwareDao extends BaseDao<SoftwareMapper, SoftwareExtMapper, Software> {
    @Override
    protected void setMapperClass() {
        this.setMapperClass(SoftwareMapper.class);
        this.setExtMapperClass(SoftwareExtMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(Software.class);
    }
}
