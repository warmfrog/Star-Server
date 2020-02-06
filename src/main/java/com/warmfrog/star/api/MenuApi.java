package com.warmfrog.star.api;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.Response;
import com.warmfrog.star.common.dto.MenuDto;
import com.warmfrog.star.common.vo.MenuVo;
import com.warmfrog.star.dao.mapper.entity.Menu;
import com.warmfrog.star.service.MenuService;
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
@RequestMapping(value = "/api/menu")
@CrossOrigin
public class MenuApi {
    private static final Logger logger = LoggerFactory.getLogger(MenuApi.class);

    @Autowired
    MenuService menuServiceImpl;

    @PostMapping(value = "/add")
    Response add(@RequestBody @Validated MenuDto menuDto) {
        logger.info("MenuApi add begin, params: {}", JSON.toJSONString(menuDto));

        menuServiceImpl.insert(menuDto);
        return Response.successResponse(null);
    }

    @PostMapping("/delete")
    Response delete(@RequestBody @Validated MenuDto menuDto) {
        logger.info("MenuApi delete begin, params: {}", JSON.toJSONString(menuDto));

        menuServiceImpl.delete(menuDto);
        return Response.successResponse(null);
    }

    @PostMapping("/update")
    Response update(@RequestBody @Validated MenuDto menuDto) {
        logger.info("MenuApi update begin, params: {}", JSON.toJSONString(menuDto));

        menuServiceImpl.update(menuDto);
        return Response.successResponse(null);
    }

    @PostMapping("/get")
    Response get(@RequestBody @Validated MenuDto menuDto) {
        logger.info("MenuApi get begin, params: {}", JSON.toJSONString(menuDto));

        MenuVo menuVo = menuServiceImpl.get(menuDto);
        return Response.successResponse(menuVo);
    }

    @PostMapping("/list")
    Response list(@RequestBody @Validated MenuDto menuDto) {
        logger.info("MenuApi list begin, params: {}", JSON.toJSONString(menuDto));

        List<MenuVo> list = menuServiceImpl.list(menuDto);

        logger.info("MenuApi list end, result: {}", JSON.toJSONString(list));
        return Response.successResponse(list);
    }

    @PostMapping("/listByPage")
    Response listByPage(@RequestBody @Validated MenuDto menuDto) {
        logger.info("MenuApi listByPage begin, params: {}", JSON.toJSONString(menuDto));

        PageInfo<MenuVo> menuVoPageInfo = menuServiceImpl.listByPage(menuDto);

        logger.info("MenuApi listByPage end, result: {}", JSON.toJSONString(menuVoPageInfo));
        return Response.successResponse(menuVoPageInfo);
    }

}
