package com.warmfrog.star.service.impl;

import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.AppBuilder;
import com.warmfrog.star.common.dto.AppDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.vo.AppVo;
import com.warmfrog.star.dao.AppDao;
import com.warmfrog.star.dao.mapper.entity.App;
import com.warmfrog.star.dao.mapper.entity.AppCriteria;
import com.warmfrog.star.service.AppService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/6
 */
@Service
public class AppServiceImpl implements AppService {
    @Autowired
    AppDao appDao;

    @Override
    public void insert(AppDto appDto) {
        appDao.getMapper().insert(AppBuilder.newInstance().buildInsert(appDto));
    }

    @Override
    public void update(AppDto appDto) {
        appDao.getMapper().updateByPrimaryKeySelective(AppBuilder.newInstance().buildUpdate(appDto));
    }

    @Override
    public void delete(AppDto appDto) {
        appDao.getMapper().updateByPrimaryKeySelective(AppBuilder.newInstance().buildDelete(appDto));
    }

    @Override
    public AppVo get(AppDto appDto) {
        App app = appDao.getMapper().selectByPrimaryKey(appDto.getUuid());
        AppVo appVo = new AppVo();
        BeanUtils.copyProperties(app, appVo);
        return appVo;
    }

    @Override
    public List<AppVo> list(AppDto appDto) {
        AppCriteria example = new AppCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());
        List<App> apps = appDao.getMapper().selectByExample(example);
        List<AppVo> appVos = new ArrayList<>();
        apps.forEach(app -> {
            AppVo appVo = new AppVo();
            BeanUtils.copyProperties(app, appVo);
            appVos.add(appVo);
        });
        return appVos;
    }

    @Override
    public PageInfo<AppVo> listByPage(AppDto appDto) {
        AppCriteria example = new AppCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());
        List<App> apps = appDao.getMapper().selectByExample(example);
        List<AppVo> appVos = new ArrayList<>();
        apps.forEach(app -> {
            AppVo appVo = new AppVo();
            BeanUtils.copyProperties(app, appVo);
            appVos.add(appVo);
        });
        PageInfo<AppVo> pageInfo = new PageInfo<>();
        pageInfo.setPageNum(appDto.getCurrentPage());
        pageInfo.setPageSize(appDto.getPageSize());
        pageInfo.setList(appVos);
        return pageInfo;
    }
}
