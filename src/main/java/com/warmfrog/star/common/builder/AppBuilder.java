package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.AppDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.util.UUIDUtil;
import com.warmfrog.star.dao.mapper.entity.Album;
import com.warmfrog.star.dao.mapper.entity.App;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author libo
 * @date 2020/2/6
 */
public class AppBuilder implements BaseBuilder<App, AppDto> {
    static AppBuilder instance;

    private AppBuilder() {
    }

    public static AppBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new AppBuilder();
        }
        return instance;
    }

    @Override
    public App buildInsert(AppDto appDto) {
        App app = new App();
        BeanUtils.copyProperties(appDto, app);
        app.setUuid(UUIDUtil.getUUID());
        Date now = new Date();
        app.setCreateTime(now);
        app.setUpdateTime(now);
        app.setCreateUser("admin");
        app.setUpdateUser("admin");
        app.setDeleteFlag(DeleteFlagEnum.NODELETE.getValue());
        return app;
    }

    @Override
    public App buildUpdate(AppDto appDto) {
        App app = new App();
        BeanUtils.copyProperties(appDto, app);
        Date now = new Date();
        app.setUpdateTime(now);
        app.setUpdateUser("test");
        return app;
    }

    @Override
    public App buildDelete(AppDto appDto) {
        App app = new App();
        app.setUuid(appDto.getUuid());
        app.setDeleteFlag(DeleteFlagEnum.DELETED.getValue());
        Date now = new Date();
        app.setUpdateTime(now);
        app.setUpdateUser("test");
        return app;
    }
}
