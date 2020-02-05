/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.warmfrog.star.dao.handler;

import com.alibaba.fastjson.JSON;
import com.warmfrog.star.common.util.JsonUtil;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.postgresql.util.PGobject;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes({Object.class})
public class JsonTypeHandler extends BaseTypeHandler <Object> {

    private static final PGobject JSON_OBJECT = new PGobject();
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        JSON_OBJECT.setType("json");
        JSON_OBJECT.setValue(JSON.toJSONString(o));
        preparedStatement.setObject(i,JSON_OBJECT);

    }

    @Override
    public Object getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return JsonUtil.fromJson(resultSet.getString(s), Object.class);
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return JsonUtil.fromJson(resultSet.getString(i), Object.class);
    }

    @Override
    public Object getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return JsonUtil.fromJson(callableStatement.getString(i), Object.class);
    }
}
