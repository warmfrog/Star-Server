package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.MenuDto;
import com.warmfrog.star.dao.mapper.entity.Menu;
import org.springframework.beans.BeanUtils;

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
        return menu;
    }

    @Override
    public Menu buildUpdate(MenuDto menuDto) {
        Menu menu = new Menu();
        BeanUtils.copyProperties(menuDto, menu);
        return menu;
    }

    @Override
    public Menu buildDelete(MenuDto menuDto) {
        Menu menu = new Menu();
        BeanUtils.copyProperties(menuDto, menu);
        return menu;
    }
}
