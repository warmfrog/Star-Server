package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.util.UUIDUtil;
import com.warmfrog.star.dao.mapper.entity.Post;
import com.warmfrog.star.common.dto.PostDto;
import org.springframework.beans.BeanUtils;

/**
 * @author libo
 * @date 2020/2/5
 */
public class PostBuilder {
    public static Post buildInsert(PostDto postDto){
        Post post = new Post();
        BeanUtils.copyProperties(postDto, post, "references");
        post.setUuid(UUIDUtil.getUUID());
        return post;
    }

    public static  Post buildUpdate(PostDto postDto){
        Post post = new Post();
        BeanUtils.copyProperties(postDto, post);
        return post;
    }

    public static Post buildDelete(PostDto postDto){
        Post post = new Post();
        post.setUuid(postDto.getUuid());
        return post;
    }
}
