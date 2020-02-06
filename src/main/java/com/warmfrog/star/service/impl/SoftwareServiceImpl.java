package com.warmfrog.star.service.impl;

import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.SoftwareBuilder;
import com.warmfrog.star.common.dto.SoftwareDto;
import com.warmfrog.star.common.vo.SoftwareVo;
import com.warmfrog.star.dao.SoftwareDao;
import com.warmfrog.star.dao.mapper.entity.Software;
import com.warmfrog.star.dao.mapper.entity.SoftwareCriteria;
import com.warmfrog.star.service.SoftwareService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/6
 */
public class SoftwareServiceImpl implements SoftwareService {
    @Autowired
    SoftwareDao softwareDao;

    @Override
    public void insert(SoftwareDto softwareDto) {
        softwareDao.getMapper().insert(SoftwareBuilder.newInstance().buildInsert(softwareDto));
    }

    @Override
    public void update(SoftwareDto softwareDto) {
        softwareDao.getMapper().updateByPrimaryKeySelective(SoftwareBuilder.newInstance().buildUpdate(softwareDto));
    }

    @Override
    public void delete(SoftwareDto softwareDto) {
        softwareDao.getMapper().updateByPrimaryKeySelective(SoftwareBuilder.newInstance().buildDelete(softwareDto));
    }

    @Override
    public SoftwareVo get(SoftwareDto softwareDto) {
        Software software = softwareDao.getMapper().selectByPrimaryKey(softwareDto.getUuid());
        return getSoftwareVo(software);
    }

    private SoftwareVo getSoftwareVo(Software software) {
        SoftwareVo softwareVo = new SoftwareVo();
        BeanUtils.copyProperties(software, softwareVo);
        return softwareVo;
    }

    @Override
    public List<SoftwareVo> list(SoftwareDto softwareDto) {
        SoftwareCriteria example = new SoftwareCriteria();
        example.createCriteria();
        List<Software> softwares = softwareDao.getMapper().selectByExample(example);
        List<SoftwareVo> softwareVos = new ArrayList<>();
        softwares.forEach(software -> {
            SoftwareVo softwareVo = getSoftwareVo(software);
            softwareVos.add(softwareVo);
        });
        return softwareVos;
    }

    @Override
    public PageInfo<SoftwareVo> listByPage(SoftwareDto softwareDto) {
        SoftwareCriteria example = new SoftwareCriteria();
        example.createCriteria();
        List<Software> softwares = softwareDao.getMapper().selectByExample(example);
        List<SoftwareVo> softwareVos = new ArrayList<>();
        softwares.forEach(software -> {
            SoftwareVo softwareVo = getSoftwareVo(software);
            softwareVos.add(softwareVo);
        });
        PageInfo<SoftwareVo> pageInfo = new PageInfo<>();
        pageInfo.setPageSize(softwareDto.getPageSize());
        pageInfo.setPageNum(softwareDto.getCurrentPage());
        pageInfo.setList(softwareVos);
        return pageInfo;
    }
}
