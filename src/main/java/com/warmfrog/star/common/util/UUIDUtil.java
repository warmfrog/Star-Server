/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.warmfrog.star.common.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * uuid 生成器.
 *
 * @author zhuxiuhong
 * @since 2018年2月11日
 */
public class UUIDUtil {
  protected  static final Logger logger = LoggerFactory.getLogger(UUIDUtil.class);
  private UUIDUtil() {}

  public static String getUUID() {
    return StringUtils.replace(UUID.randomUUID().toString(), "-", "");
  }
}
