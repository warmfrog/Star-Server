package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.PostExtMapper;
import com.warmfrog.star.dao.mapper.PostMapper;
import com.warmfrog.star.dao.mapper.entity.Post;
import org.springframework.stereotype.Repository;

/**
 * @author libo
 * @date 2020/2/4
 */
@Repository
public class PostDao extends BaseDao<PostMapper, PostExtMapper, Post> {
    protected void setMapperClass() {
        this.setMapperClass(PostMapper.class);
        this.setExtMapperClass(PostExtMapper.class);
    }

    protected void setEntityClass() {
        this.setEntityClass(Post.class);
    }
}
