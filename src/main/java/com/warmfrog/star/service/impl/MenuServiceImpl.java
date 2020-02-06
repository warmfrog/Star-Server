package com.warmfrog.star.service.impl;

import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.MenuBuilder;
import com.warmfrog.star.common.dto.MenuDto;
import com.warmfrog.star.common.vo.MenuVo;
import com.warmfrog.star.dao.MenuDao;
import com.warmfrog.star.dao.mapper.entity.Menu;
import com.warmfrog.star.dao.mapper.entity.MenuCriteria;
import com.warmfrog.star.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/6
 */
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Override
    public void insert(MenuDto menuDto) {
        menuDao.getMapper().insert(MenuBuilder.newInstance().buildInsert(menuDto));
    }

    @Override
    public void update(MenuDto menuDto) {
        menuDao.getMapper().updateByPrimaryKeySelective(MenuBuilder.newInstance().buildUpdate(menuDto));
    }

    @Override
    public void delete(MenuDto menuDto) {
        menuDao.getMapper().updateByPrimaryKeySelective(MenuBuilder.newInstance().buildDelete(menuDto));
    }

    @Override
    public MenuVo get(MenuDto menuDto) {
        Menu menu = menuDao.getMapper().selectByPrimaryKey(menuDto.getUuid());
        return getMenuVo(menu);
    }

    private MenuVo getMenuVo(Menu menu) {
        MenuVo menuVo = new MenuVo();
        BeanUtils.copyProperties(menu, menuVo);
        return menuVo;
    }

    @Override
    public List<MenuVo> list(MenuDto menuDto) {
        MenuCriteria example = new MenuCriteria();
        example.createCriteria();
        List<Menu> menus = menuDao.getMapper().selectByExample(example);
        List<MenuVo> menuVos = new ArrayList<>();
        menus.forEach(menu -> {
            MenuVo menuVo = getMenuVo(menu);
            menuVos.add(menuVo);
        });

        return menuVos;
    }

    @Override
    public PageInfo<MenuVo> listByPage(MenuDto menuDto) {
        MenuCriteria example = new MenuCriteria();
        example.createCriteria();
        List<Menu> menus = menuDao.getMapper().selectByExample(example);
        List<MenuVo> menuVos = new ArrayList<>();
        menus.forEach(menu -> {
            MenuVo menuVo = getMenuVo(menu);
            menuVos.add(menuVo);
        });
        PageInfo<MenuVo> pageInfo = new PageInfo<>();
        pageInfo.setPageNum(menuDto.getCurrentPage());
        pageInfo.setPageSize(menuDto.getPageSize());
        pageInfo.setList(menuVos);

        return pageInfo;
    }
}
