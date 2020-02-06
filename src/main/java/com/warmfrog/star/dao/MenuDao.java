package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.MenuExtMapper;
import com.warmfrog.star.dao.mapper.MenuMapper;
import com.warmfrog.star.dao.mapper.entity.Menu;

/**
 * @author libo
 * @date 2020/2/6
 */
public class MenuDao extends BaseDao<MenuMapper, MenuExtMapper, Menu> {
    @Override
    protected void setMapperClass() {
        this.setMapperClass(MenuMapper.class);
        this.setExtMapperClass(MenuExtMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(Menu.class);
    }
}
