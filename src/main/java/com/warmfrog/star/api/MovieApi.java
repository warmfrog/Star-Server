package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.MovieDto;
import com.warmfrog.star.common.vo.MovieVo;
import com.warmfrog.star.service.MovieService;
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
@RequestMapping(value = "/api/movie")
@CrossOrigin
public class MovieApi {
    private static final Logger logger = LoggerFactory.getLogger(MovieApi.class);

    @Autowired
    MovieService movieServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated MovieDto movieDto) {
        logger.info("MovieApi add begin, params: {}", JSON.toJSONString(movieDto));

        movieServiceImpl.insert(movieDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated MovieDto movieDto) {
        logger.info("MovieApi delete begin, params: {}", JSON.toJSONString(movieDto));

        movieServiceImpl.delete(movieDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated MovieDto movieDto) {
        logger.info("MovieApi update begin, params: {}", JSON.toJSONString(movieDto));

        movieServiceImpl.update(movieDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated MovieDto movieDto) {
        logger.info("MovieApi get begin, params: {}", JSON.toJSONString(movieDto));

        MovieVo movieVo = movieServiceImpl.get(movieDto);
        return Response.successResponse(movieVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated MovieDto movieDto) {
        logger.info("MovieApi list begin, params: {}", JSON.toJSONString(movieDto));

        List<MovieVo> list = movieServiceImpl.list(movieDto);

        logger.info("MovieApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated MovieDto movieDto) {
        logger.info("MovieApi listByPage begin, params: {}", JSON.toJSONString(movieDto));

        PageInfo<MovieVo> movieVoPageInfo = movieServiceImpl.listByPage(movieDto);

        logger.info("MovieApi listByPage end, result: {}", JSON.toJSONString(movieVoPageInfo));
        return Response.successResponse(movieVoPageInfo);
    }

}
