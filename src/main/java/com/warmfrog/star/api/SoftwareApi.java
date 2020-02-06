package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.SoftwareDto;
import com.warmfrog.star.common.vo.SoftwareVo;
import com.warmfrog.star.dao.mapper.entity.Software;
import com.warmfrog.star.service.PostService;
import com.warmfrog.star.service.SoftwareService;
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
@RequestMapping(value = "/api/software")
@CrossOrigin
public class SoftwareApi {
    private static final Logger logger = LoggerFactory.getLogger(SoftwareApi.class);

    @Autowired
    SoftwareService softwareServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated SoftwareDto softwareDto) {
        logger.info("SoftwareApi add begin, params: {}", JSON.toJSONString(softwareDto));

        softwareServiceImpl.insert(softwareDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated SoftwareDto softwareDto) {
        logger.info("SoftwareApi delete begin, params: {}", JSON.toJSONString(softwareDto));

        softwareServiceImpl.delete(softwareDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated SoftwareDto softwareDto) {
        logger.info("SoftwareApi update begin, params: {}", JSON.toJSONString(softwareDto));

        softwareServiceImpl.update(softwareDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated SoftwareDto softwareDto) {
        logger.info("SoftwareApi get begin, params: {}", JSON.toJSONString(softwareDto));

        SoftwareVo softwareVo = softwareServiceImpl.get(softwareDto);
        return Response.successResponse(softwareVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated SoftwareDto softwareDto) {
        logger.info("SoftwareApi list begin, params: {}", JSON.toJSONString(softwareDto));

        List<SoftwareVo> list = softwareServiceImpl.list(softwareDto);

        logger.info("SoftwareApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated SoftwareDto softwareDto) {
        logger.info("SoftwareApi listByPage begin, params: {}", JSON.toJSONString(softwareDto));

        PageInfo<SoftwareVo> softwareVoPageInfo = softwareServiceImpl.listByPage(softwareDto);

        logger.info("SoftwareApi listByPage end, result: {}", JSON.toJSONString(softwareVoPageInfo));
        return Response.successResponse(softwareVoPageInfo);
    }

}
