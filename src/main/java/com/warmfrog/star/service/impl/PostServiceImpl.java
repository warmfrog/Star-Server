package com.warmfrog.star.service.impl;

import com.warmfrog.star.dao.PostDao;
import com.warmfrog.star.dto.PostDto;
import com.warmfrog.star.service.PostService;
import com.warmfrog.star.vo.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author libo
 * @date 2020/2/4
 */
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostDao postDao;

    public void add(PostDto postDto) {

    }

    public void update(PostDto postDto) {

    }

    public void delete(String uuid) {

    }

    public PostVo get(String uuid) {
        return null;
    }

    public List<PostVo> list(PostDto postDto) {
        return null;
    }

    public List<PostVo> listByPage(PostDto postDto) {
        return null;
    }
}
