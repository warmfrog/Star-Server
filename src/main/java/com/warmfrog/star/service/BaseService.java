package com.warmfrog.star.service;

import java.util.List;

/**
 * @author libo
 * @date 2020/2/4
 */
public interface BaseService<Dto, Vo> {
    void add(Dto dto);
    void update(Dto dto);
    void delete(String uuid);
    Vo get(String uuid);
    List<Vo> list(Dto dto);
    List<Vo> listByPage(Dto dto);
}
