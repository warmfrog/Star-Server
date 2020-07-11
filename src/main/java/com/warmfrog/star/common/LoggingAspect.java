package com.warmfrog.star.common;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author libo
 * @date 2020/3/11
 */
@Aspect
@Component
public class LoggingAspect implements Ordered {
    private static final Logger loggingAspectLogger = LoggerFactory.getLogger("LoggingAspect");

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void anyRequest() {
    }

    @Pointcut("@annotation(io.swagger.annotations.ApiOperation)")
    private void anySwaggerApiOperation() {
    }

    @Pointcut("@annotation(com.eg.egsc.ordermgmtcomponent.supercell.common.TimeStatistics)")
    private void anyTimeStatistics() {

    }

    /**
     * 打印日志，请求参数，返回结果，接口耗时
     */
    @Around("anyRequest() || anySwaggerApiOperation() || anyTimeStatistics()")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Class clazz = signature.getDeclaringType();
        Logger logger = getLogger(clazz);
        Method method = signature.getMethod();
        String methodName = method.getName();

        TimeStatistics timeStatistics = method.getAnnotation(TimeStatistics.class);
        if (null != timeStatistics && timeStatistics.logRequestArgs() || null == timeStatistics && args.length > 0) {
            logger.info("{}() begin, params : {}", methodName, JSON.toJSONString(args));
        }

        long beginTicks = System.currentTimeMillis();
        Object responseDto = joinPoint.proceed();
        long timeCost = System.currentTimeMillis() - beginTicks;

        ApiOperation apiOperation = method.getAnnotation(ApiOperation.class);
        String operation = "";
        if (null != apiOperation) {
            operation = apiOperation.value();
        }

        if (null == timeStatistics || timeStatistics.logResponseBody()) {
            logger.info("{}() end, result: {}", methodName, JSON.toJSONString(responseDto));
        }

        if (null == timeStatistics) {
            logger.info("{} {}() end, Time Cost: {} ms", operation, methodName, timeCost);
        }

        return responseDto;
    }

    /**
     * 获取 Logger 实体域
     *
     * @param clazz
     * @return
     */
    private Logger getLogger(Class clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();
        Logger logger = null;

        for (Field field : declaredFields) {
            if (field.getType() == Logger.class) {
                field.setAccessible(true);
                try {
                    logger = (Logger) field.get(field.getName());
                } catch (IllegalAccessException e) {
                    loggingAspectLogger.error(e.getMessage());
                }
            }
        }
        if (logger == null) {
            logger = LoggerFactory.getLogger(clazz);
        }
        return logger;
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
