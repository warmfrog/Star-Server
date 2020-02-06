package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.MovieDto;
import com.warmfrog.star.dao.mapper.entity.Menu;
import com.warmfrog.star.dao.mapper.entity.Movie;
import org.springframework.beans.BeanUtils;

/**
 * @author libo
 * @date 2020/2/6
 */
public class MovieBuilder implements BaseBuilder<Movie, MovieDto> {
    static MovieBuilder instance;

    private MovieBuilder() {
    }

    public static MovieBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new MovieBuilder();
        }
        return instance;
    }

    @Override
    public Movie buildInsert(MovieDto movieDto) {
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieDto, movie);
        return movie;
    }

    @Override
    public Movie buildUpdate(MovieDto movieDto) {
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieDto, movie);
        return movie;
    }

    @Override
    public Movie buildDelete(MovieDto movieDto) {
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieDto, movie);
        return movie;
    }
}
