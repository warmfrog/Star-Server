package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.PostDto;
import com.warmfrog.star.common.vo.PostVo;
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
@RequestMapping(value = "/api/post")
@CrossOrigin
public class PostApi {
    private static final Logger logger = LoggerFactory.getLogger(PostApi.class);

    @Autowired
    PostService postServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated PostDto postDto) {
        logger.info("PostApi add begin, params: {}", JSON.toJSONString(postDto));

        postServiceImpl.insert(postDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated PostDto postDto) {
        logger.info("PostApi delete begin, params: {}", JSON.toJSONString(postDto));

        postServiceImpl.delete(postDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated PostDto postDto) {
        logger.info("PostApi update begin, params: {}", JSON.toJSONString(postDto));

        postServiceImpl.update(postDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated PostDto postDto) {
        logger.info("PostApi get begin, params: {}", JSON.toJSONString(postDto));

        PostVo postVo = postServiceImpl.get(postDto);
        return Response.successResponse(postVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated PostDto postDto) {
        logger.info("PostApi list begin, params: {}", JSON.toJSONString(postDto));

        List<PostVo> list = postServiceImpl.list(postDto);

        logger.info("PostApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated PostDto postDto) {
        logger.info("PostApi listByPage begin, params: {}", JSON.toJSONString(postDto));

        PageInfo<PostVo> postVoPageInfo = postServiceImpl.listByPage(postDto);

        logger.info("PostApi listByPage end, result: {}", JSON.toJSONString(postVoPageInfo));
        return Response.successResponse(postVoPageInfo);
    }

}
