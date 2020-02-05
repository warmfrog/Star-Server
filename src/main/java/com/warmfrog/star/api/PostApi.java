package com.warmfrog.star.api;


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
public class PostApi {
    @Autowired
    PostService postServiceImpl;
    private Logger logger = LoggerFactory.getLogger(PostApi.class);

    @PostMapping
    Response add(@RequestBody @Validated PostDto postDto) {
        postServiceImpl.insert(postDto);
        return Response.successResponse(null);
    }

    @DeleteMapping
    Response delete(@RequestBody @Validated PostDto postDto) {
        postServiceImpl.delete(postDto);
        return Response.successResponse(null);
    }

    @PutMapping
    Response update(@RequestBody @Validated PostDto postDto) {
        postServiceImpl.update(postDto);
        return Response.successResponse(null);
    }

    @GetMapping
    Response get(@RequestBody @Validated PostDto postDto) {
        PostVo postVo = postServiceImpl.get(postDto);
        return Response.successResponse(postVo);
    }

    @GetMapping("/list")
    Response list(@RequestBody @Validated PostDto postDto) {
        List<PostVo> list = postServiceImpl.list(postDto);
        return Response.successResponse(list);
    }

    @GetMapping("/listByPage")
    Response listByPage(@RequestBody @Validated PostDto postDto) {
        PageInfo<PostVo> postVoPageInfo = postServiceImpl.listByPage(postDto);
        return Response.successResponse(postVoPageInfo);
    }

}
