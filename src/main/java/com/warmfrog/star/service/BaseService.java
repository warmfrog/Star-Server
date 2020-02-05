package com.warmfrog.star.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author libo
 * @date 2020/2/4
 */
public interface BaseService<Dto, Vo> {
    void insert(Dto dto);
    void update(Dto dto);
    void delete(Dto dto);
    Vo get(Dto dto);
    List<Vo> list(Dto dto);
    PageInfo<Vo> listByPage(Dto dto);
}
