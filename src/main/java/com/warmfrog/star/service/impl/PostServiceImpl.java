package com.warmfrog.star.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.PostBuilder;
import com.warmfrog.star.common.dto.Author;
import com.warmfrog.star.common.dto.PostDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.vo.PostVo;
import com.warmfrog.star.dao.PostDao;
import com.warmfrog.star.dao.mapper.entity.Post;
import com.warmfrog.star.dao.mapper.entity.PostCriteria;
import com.warmfrog.star.service.PostService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/4
 */
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostDao postDao;

    public void insert(PostDto postDto) {
        postDao.getMapper().insert(PostBuilder.newInstance().buildInsert(postDto));
    }

    public void update(PostDto postDto) {
        postDao.getMapper().updateByPrimaryKeySelective(PostBuilder.newInstance().buildUpdate(postDto));
    }

    public void delete(PostDto postDto) {
        postDao.getMapper().updateByPrimaryKeySelective(PostBuilder.newInstance().buildDelete(postDto));
    }

    public PostVo get(PostDto postDto) {
        Post post = postDao.getMapper().selectByPrimaryKey(postDto.getUuid());
        PostVo postVo = new PostVo();
        BeanUtils.copyProperties(post, postVo);
        return postVo;
    }

    public List<PostVo> list(PostDto postDto) {
        PostCriteria example = new PostCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());
        List<Post> posts = postDao.getMapper().selectByExample(example);

        List<PostVo> postVoList = getPostVos(posts);
        return postVoList;
    }

    private List<PostVo> getPostVos(List<Post> posts) {
        List<PostVo> postVoList = new ArrayList<PostVo>();
        posts.forEach(post -> {
            PostVo postVo = new PostVo();
            BeanUtils.copyProperties(post, postVo);
//            postVo.setKeyWords(JSON.parseArray(JSON.toJSONString(post.getKeyWords()), String.class));
//            postVo.setAuthor(JSON.parseObject(JSON.toJSONString(post.getAuthor()), Author.class));
//            postVo.setAuthors(JSON.parseArray(JSON.toJSONString(post.getAuthors()), Author.class));
//            postVo.setImages(JSON.parseArray(JSON.toJSONString(post.getImages()), String.class));
//            postVo.setReleasedPlatforms(JSON.parseArray(JSON.toJSONString(post.getReleasedPlatforms()), PostDto.ReleasedPlatform.class));
//            postVo.setTags(JSON.parseArray(JSON.toJSONString(post.getTags()), String.class));
//            postVo.setClassifications(JSON.parseArray(JSON.toJSONString(post.getClassifications()), String.class));
//            postVo.setCites(JSON.parseArray(JSON.toJSONString(post.getCites()), PostDto.Cite.class));
            postVoList.add(postVo);
        });
        return postVoList;
    }

    public PageInfo<PostVo> listByPage(PostDto postDto) {
        PageInfo<PostVo> postVos = new PageInfo<>();
        RowBounds rowBounds = new RowBounds((postDto.getCurrentPage() - 1) * postDto.getPageSize(), postDto.getPageSize());
        PostCriteria example = new PostCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());

        long count = postDao.getMapper().countByExample(example);
        List<Post> posts = postDao.getMapper().selectByExampleWithRowbounds(example, rowBounds);
        postVos.setList(getPostVos(posts));
        postVos.setTotal(count);
        postVos.setPageNum(postDto.getCurrentPage());
        postVos.setPageSize(postDto.getPageSize());
        return postVos;
    }

}
