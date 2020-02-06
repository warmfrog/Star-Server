package com.warmfrog.star.common.builder;

/**
 * @author libo
 * @date 2020/2/6
 */
public interface BaseBuilder<E, Dto> {

    E buildInsert(Dto dto);

    E buildUpdate(Dto dto);

    E buildDelete(Dto dto);
}
