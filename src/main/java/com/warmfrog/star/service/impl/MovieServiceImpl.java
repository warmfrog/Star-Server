package com.warmfrog.star.service.impl;

import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.MovieBuilder;
import com.warmfrog.star.common.dto.MovieDto;
import com.warmfrog.star.common.vo.MovieVo;
import com.warmfrog.star.dao.MovieDao;
import com.warmfrog.star.dao.mapper.entity.Movie;
import com.warmfrog.star.dao.mapper.entity.MovieCriteria;
import com.warmfrog.star.service.MovieService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/6
 */
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieDao movieDao;

    @Override
    public void insert(MovieDto movieDto) {
        movieDao.getMapper().insert(MovieBuilder.newInstance().buildInsert(movieDto));
    }

    @Override
    public void update(MovieDto movieDto) {
        movieDao.getMapper().updateByPrimaryKeySelective(MovieBuilder.newInstance().buildUpdate(movieDto));
    }

    @Override
    public void delete(MovieDto movieDto) {
        movieDao.getMapper().updateByPrimaryKeySelective(MovieBuilder.newInstance().buildDelete(movieDto));
    }

    @Override
    public MovieVo get(MovieDto movieDto) {
        Movie movie = movieDao.getMapper().selectByPrimaryKey(movieDto.getUuid());
        return getMovieVo(movie);
    }

    private MovieVo getMovieVo(Movie movie) {
        MovieVo movieVo = new MovieVo();
        BeanUtils.copyProperties(movie, movieVo);
        return movieVo;
    }

    @Override
    public List<MovieVo> list(MovieDto movieDto) {
        MovieCriteria example = new MovieCriteria();
        example.createCriteria();
        List<Movie> movies = movieDao.getMapper().selectByExample(example);
        List<MovieVo> movieVos = new ArrayList<>();
        movies.forEach(movie -> {
            MovieVo movieVo = getMovieVo(movie);
            movieVos.add(movieVo);
        });
        return movieVos;
    }

    @Override
    public PageInfo<MovieVo> listByPage(MovieDto movieDto) {
        MovieCriteria example = new MovieCriteria();
        example.createCriteria();
        List<Movie> movies = movieDao.getMapper().selectByExample(example);
        List<MovieVo> movieVos = new ArrayList<>();
        movies.forEach(movie -> {
            MovieVo movieVo = getMovieVo(movie);
            movieVos.add(movieVo);
        });
        PageInfo<MovieVo> pageInfo = new PageInfo<>();
        pageInfo.setList(movieVos);
        pageInfo.setPageSize(movieDto.getPageSize());
        pageInfo.setPageNum(movieDto.getCurrentPage());
        return pageInfo;
    }
}
