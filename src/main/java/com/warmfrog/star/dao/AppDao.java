package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.AppExtMapper;
import com.warmfrog.star.dao.mapper.AppMapper;
import com.warmfrog.star.dao.mapper.entity.App;
import org.springframework.stereotype.Repository;

/**
 * @author libo
 * @date 2020/2/6
 */
@Repository
public class AppDao extends BaseDao<AppMapper, AppExtMapper, App> {
    @Override
    protected void setMapperClass() {
        this.setMapperClass(AppMapper.class);
        this.setExtMapperClass(AppExtMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(App.class);
    }
}
