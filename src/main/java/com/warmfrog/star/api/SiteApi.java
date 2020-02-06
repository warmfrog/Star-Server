package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.SiteDto;
import com.warmfrog.star.common.vo.SiteVo;
import com.warmfrog.star.service.PostService;
import com.warmfrog.star.service.SiteService;
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
@RequestMapping(value = "/api/site")
@CrossOrigin
public class SiteApi {
    private static final Logger logger = LoggerFactory.getLogger(SiteApi.class);

    @Autowired
    SiteService siteServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated SiteDto siteDto) {
        logger.info("SiteApi add begin, params: {}", JSON.toJSONString(siteDto));

        siteServiceImpl.insert(siteDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated SiteDto siteDto) {
        logger.info("SiteApi delete begin, params: {}", JSON.toJSONString(siteDto));

        siteServiceImpl.delete(siteDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated SiteDto siteDto) {
        logger.info("SiteApi update begin, params: {}", JSON.toJSONString(siteDto));

        siteServiceImpl.update(siteDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated SiteDto siteDto) {
        logger.info("SiteApi get begin, params: {}", JSON.toJSONString(siteDto));

        SiteVo siteVo = siteServiceImpl.get(siteDto);
        return Response.successResponse(siteVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated SiteDto siteDto) {
        logger.info("SiteApi list begin, params: {}", JSON.toJSONString(siteDto));

        List<SiteVo> list = siteServiceImpl.list(siteDto);

        logger.info("SiteApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated SiteDto siteDto) {
        logger.info("SiteApi listByPage begin, params: {}", JSON.toJSONString(siteDto));

        PageInfo<SiteVo> siteVoPageInfo = siteServiceImpl.listByPage(siteDto);

        logger.info("SiteApi listByPage end, result: {}", JSON.toJSONString(siteVoPageInfo));
        return Response.successResponse(siteVoPageInfo);
    }

}
