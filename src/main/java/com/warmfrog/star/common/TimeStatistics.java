package com.warmfrog.star.common;

/**
 * 统计方法耗时标记
 *
 * @author libo
 * @date 2020/7/10
 * @see LoggingAspect
 */
public @interface TimeStatistics {
    /**
     * 是否打印方法参数
     *
     * @return
     */
    boolean logRequestArgs() default false;

    /**
     * 是否打印方法返回值
     *
     * @return
     */
    boolean logResponseBody() default false;
}
