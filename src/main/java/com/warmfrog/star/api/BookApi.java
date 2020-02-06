package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.BookDto;
import com.warmfrog.star.common.vo.BookVo;
import com.warmfrog.star.service.BookService;
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
@RequestMapping(value = "/api/book")
@CrossOrigin
public class BookApi {
    private static final Logger logger = LoggerFactory.getLogger(BookApi.class);

    @Autowired
    BookService bookServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated BookDto bookDto) {
        logger.info("BookApi add begin, params: {}", JSON.toJSONString(bookDto));

        bookServiceImpl.insert(bookDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated BookDto bookDto) {
        logger.info("BookApi delete begin, params: {}", JSON.toJSONString(bookDto));

        bookServiceImpl.delete(bookDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated BookDto bookDto) {
        logger.info("BookApi update begin, params: {}", JSON.toJSONString(bookDto));

        bookServiceImpl.update(bookDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated BookDto bookDto) {
        logger.info("BookApi get begin, params: {}", JSON.toJSONString(bookDto));

        BookVo bookVo = bookServiceImpl.get(bookDto);
        return Response.successResponse(bookVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated BookDto bookDto) {
        logger.info("BookApi list begin, params: {}", JSON.toJSONString(bookDto));

        List<BookVo> list = bookServiceImpl.list(bookDto);

        logger.info("BookApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated BookDto bookDto) {
        logger.info("BookApi listByPage begin, params: {}", JSON.toJSONString(bookDto));

        PageInfo<BookVo> bookVoPageInfo = bookServiceImpl.listByPage(bookDto);

        logger.info("BookApi listByPage end, result: {}", JSON.toJSONString(bookVoPageInfo));
        return Response.successResponse(bookVoPageInfo);
    }

}
