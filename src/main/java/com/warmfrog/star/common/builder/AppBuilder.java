package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.AppDto;
import com.warmfrog.star.dao.mapper.entity.App;
import org.springframework.beans.BeanUtils;

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
        return app;
    }

    @Override
    public App buildUpdate(AppDto appDto) {
        App app = new App();
        BeanUtils.copyProperties(appDto, app);
        return app;
    }

    @Override
    public App buildDelete(AppDto appDto) {
        App app = new App();
        app.setUuid(appDto.getUuid());
        return app;
    }
}
