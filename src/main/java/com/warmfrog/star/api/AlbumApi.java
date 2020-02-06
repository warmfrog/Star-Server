package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.AlbumDto;
import com.warmfrog.star.common.vo.AlbumVo;
import com.warmfrog.star.service.AlbumService;
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
@RequestMapping(value = "/api/album")
@CrossOrigin
public class AlbumApi {
    private static final Logger logger = LoggerFactory.getLogger(AlbumApi.class);

    @Autowired
    AlbumService albumServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated AlbumDto albumDto) {
        logger.info("AlbumApi add begin, params: {}", JSON.toJSONString(albumDto));

        albumServiceImpl.insert(albumDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated AlbumDto albumDto) {
        logger.info("AlbumApi delete begin, params: {}", JSON.toJSONString(albumDto));

        albumServiceImpl.delete(albumDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated AlbumDto albumDto) {
        logger.info("AlbumApi update begin, params: {}", JSON.toJSONString(albumDto));

        albumServiceImpl.update(albumDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated AlbumDto albumDto) {
        logger.info("AlbumApi get begin, params: {}", JSON.toJSONString(albumDto));

        AlbumVo albumVo = albumServiceImpl.get(albumDto);
        return Response.successResponse(albumVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated AlbumDto albumDto) {
        logger.info("AlbumApi list begin, params: {}", JSON.toJSONString(albumDto));

        List<AlbumVo> list = albumServiceImpl.list(albumDto);

        logger.info("AlbumApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated AlbumDto albumDto) {
        logger.info("AlbumApi listByPage begin, params: {}", JSON.toJSONString(albumDto));

        PageInfo<AlbumVo> albumVoPageInfo = albumServiceImpl.listByPage(albumDto);

        logger.info("AlbumApi listByPage end, result: {}", JSON.toJSONString(albumVoPageInfo));
        return Response.successResponse(albumVoPageInfo);
    }

}
