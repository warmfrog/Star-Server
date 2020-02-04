package com.warmfrog.star.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.sql.Connection;

/**
 * 基础Dao类
 * 
 * @param <M> Mapper 类型
 * @param <M1> ExtMapper 类型
 * @param <E> Entity 类型
 */
public abstract class BaseDao<M, M1, E> extends SqlSessionDaoSupport {
  protected Class<M> mapperClass;
  protected Class<M1> extMapperClass;
  protected Class<E> entityClass;

  @Resource
  protected SqlSessionFactory sqlSessionFactory;

  protected BaseDao() {
    this.setMapperClass();
    this.setEntityClass();
  }

  protected abstract void setMapperClass();

  protected abstract void setEntityClass();

  protected void setMapperClass(Class<M> mapperClass) {
    this.mapperClass = mapperClass;
  }

  protected void setExtMapperClass(Class<M1> extMapperClass) {
    this.extMapperClass = extMapperClass;
  }

  protected void setEntityClass(Class<E> entityClass) {
    this.entityClass = entityClass;
  }

  public M getMapper() {
    return this.getSqlSession().getMapper(mapperClass);
  }

  public M1 getExtMapper() {
    return this.getSqlSession().getMapper(extMapperClass);
  }

  public Connection getJDBCConnection() {
    return this.getSqlSession().getConnection();
  }

  @Override
  @Resource
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    super.setSqlSessionFactory(sqlSessionFactory);
  }
}
