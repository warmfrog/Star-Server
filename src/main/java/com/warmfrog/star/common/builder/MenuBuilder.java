package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.MenuDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.util.UUIDUtil;
import com.warmfrog.star.dao.mapper.entity.Menu;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author libo
 * @date 2020/2/6
 */
public class MenuBuilder implements BaseBuilder<Menu, MenuDto> {
    static MenuBuilder instance;

    private MenuBuilder() {
    }

    public static MenuBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new MenuBuilder();
        }
        return instance;
    }

    @Override
    public Menu buildInsert(MenuDto menuDto) {
        Menu menu = new Menu();
        BeanUtils.copyProperties(menuDto, menu);
        menu.setUuid(UUIDUtil.getUUID());
        Date now = new Date();
        menu.setCreateTime(now);
        menu.setUpdateTime(now);
        menu.setCreateUser("admin");
        menu.setUpdateUser("admin");
        menu.setDeleteFlag(DeleteFlagEnum.NODELETE.getValue());
        return menu;
    }

    @Override
    public Menu buildUpdate(MenuDto menuDto) {
        Menu menu = new Menu();
        BeanUtils.copyProperties(menuDto, menu);
        Date now = new Date();
        menu.setUpdateTime(now);
        menu.setUpdateUser("test");
        return menu;
    }

    @Override
    public Menu buildDelete(MenuDto menuDto) {
        Menu menu = new Menu();
        menu.setUuid(menuDto.getUuid());
        menu.setDeleteFlag(DeleteFlagEnum.DELETED.getValue());
        Date now = new Date();
        menu.setUpdateTime(now);
        menu.setUpdateUser("test");
        return menu;
    }
}
