package com.warmfrog.star.service.impl;

import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.SiteBuilder;
import com.warmfrog.star.common.dto.SiteDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.vo.SiteVo;
import com.warmfrog.star.dao.SiteDao;
import com.warmfrog.star.dao.mapper.entity.Site;
import com.warmfrog.star.dao.mapper.entity.SiteCriteria;
import com.warmfrog.star.service.SiteService;
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
public class SiteServiceImpl implements SiteService {
    @Autowired
    SiteDao siteDao;

    @Override
    public void insert(SiteDto siteDto) {
        siteDao.getMapper().insert(SiteBuilder.newInstance().buildInsert(siteDto));
    }

    @Override
    public void update(SiteDto siteDto) {
        siteDao.getMapper().updateByPrimaryKeySelective(SiteBuilder.newInstance().buildUpdate(siteDto));
    }

    @Override
    public void delete(SiteDto siteDto) {
        siteDao.getMapper().updateByPrimaryKeySelective(SiteBuilder.newInstance().buildDelete(siteDto));
    }

    @Override
    public SiteVo get(SiteDto siteDto) {
        Site site = siteDao.getMapper().selectByPrimaryKey(siteDto.getUuid());
        return getSiteVo(site);
    }

    private SiteVo getSiteVo(Site site) {
        SiteVo siteVo = new SiteVo();
        BeanUtils.copyProperties(site, siteVo);
        return siteVo;
    }

    @Override
    public List<SiteVo> list(SiteDto siteDto) {
        SiteCriteria example = new SiteCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());
        List<Site> sites = siteDao.getMapper().selectByExample(example);
        ArrayList<SiteVo> siteVos = new ArrayList<>();
        sites.forEach(site -> {
            SiteVo siteVo = getSiteVo(site);
            siteVos.add(siteVo);
        });
        return siteVos;
    }

    @Override
    public PageInfo<SiteVo> listByPage(SiteDto siteDto) {
        SiteCriteria example = new SiteCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());
        List<Site> sites = siteDao.getMapper().selectByExample(example);
        ArrayList<SiteVo> siteVos = new ArrayList<>();
        sites.forEach(site -> {
            SiteVo siteVo = getSiteVo(site);
            siteVos.add(siteVo);
        });
        PageInfo<SiteVo> pageInfo = new PageInfo<>();
        pageInfo.setList(siteVos);
        pageInfo.setPageNum(siteDto.getCurrentPage());
        pageInfo.setPageSize(siteDto.getPageSize());
        return pageInfo;
    }
}
