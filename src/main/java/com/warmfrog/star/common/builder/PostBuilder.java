package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.PostDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.util.UUIDUtil;
import com.warmfrog.star.dao.mapper.entity.Post;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author libo
 * @date 2020/2/5
 */
public class PostBuilder implements BaseBuilder<Post, PostDto> {
    static PostBuilder instance;

    private PostBuilder() {
    }

    public static PostBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new PostBuilder();
        }
        return instance;
    }

    @Override
    public Post buildInsert(PostDto postDto) {
        Post post = new Post();
        BeanUtils.copyProperties(postDto, post, "references");
        post.setUuid(UUIDUtil.getUUID());
        post.setKeyWords(postDto.getKeyWords());
        post.setAuthors(postDto.getAuthors());
        post.setImages(postDto.getImages());
        post.setReleasedPlatforms(postDto.getReleasedPlatforms());
        post.setTags(postDto.getTags());
        post.setClassifications(postDto.getClassifications());
        post.setCites(postDto.getCites());
        Date now = new Date();
        post.setCreateTime(now);
        post.setUpdateTime(now);
        post.setCreateUser("admin");
        post.setUpdateUser("admin");
        return post;
    }

    @Override
    public Post buildUpdate(PostDto postDto) {
        Post post = new Post();
        BeanUtils.copyProperties(postDto, post);
        post.setKeyWords(postDto.getKeyWords());
        post.setAuthors(postDto.getAuthors());
        post.setImages(postDto.getImages());
        post.setReleasedPlatforms(postDto.getReleasedPlatforms());
        post.setTags(postDto.getTags());
        post.setClassifications(postDto.getClassifications());
        post.setCites(postDto.getCites());
        Date now = new Date();
        post.setUpdateTime(now);
        post.setUpdateUser("test");
        return post;
    }

    @Override
    public Post buildDelete(PostDto postDto) {
        Post post = new Post();
        post.setUuid(postDto.getUuid());
        post.setDeleteFlag(DeleteFlagEnum.DELETED.getValue());
        Date now = new Date();
        post.setUpdateTime(now);
        post.setUpdateUser("test");
        return post;
    }
}
