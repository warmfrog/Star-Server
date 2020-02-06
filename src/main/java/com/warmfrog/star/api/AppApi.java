package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.AppDto;
import com.warmfrog.star.common.vo.AppVo;
import com.warmfrog.star.service.AppService;
import com.warmfrog.star.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author libo
 * @date 2020/2/5
 */
@RestController
@RequestMapping(value = "/api/app")
@CrossOrigin
public class AppApi {
    private static final Logger logger = LoggerFactory.getLogger(AppApi.class);

    @Autowired
    AppService appServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated AppDto appDto) {
        logger.info("AppApi add begin, params: {}", JSON.toJSONString(appDto));

        appServiceImpl.insert(appDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated AppDto appDto) {
        logger.info("AppApi delete begin, params: {}", JSON.toJSONString(appDto));

        appServiceImpl.delete(appDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated AppDto appDto) {
        logger.info("AppApi update begin, params: {}", JSON.toJSONString(appDto));

        appServiceImpl.update(appDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated AppDto appDto) {
        logger.info("AppApi get begin, params: {}", JSON.toJSONString(appDto));

        AppVo appVo = appServiceImpl.get(appDto);
        return Response.successResponse(appVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated AppDto appDto) {
        logger.info("AppApi list begin, params: {}", JSON.toJSONString(appDto));

        List<AppVo> list = appServiceImpl.list(appDto);

        logger.info("AppApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated AppDto appDto) {
        logger.info("AppApi listByPage begin, params: {}", JSON.toJSONString(appDto));

        PageInfo<AppVo> postVoPageInfo = appServiceImpl.listByPage(appDto);

        logger.info("AppApi listByPage end, result: {}", JSON.toJSONString(postVoPageInfo));
        return Response.successResponse(postVoPageInfo);
    }

}
