package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.Post;
import com.warmfrog.star.dao.mapper.entity.PostCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PostMapper {
    long countByExample(PostCriteria example);

    int deleteByExample(PostCriteria example);

    int insert(Post record);

    int insertSelective(Post record);

    List<Post> selectByExampleWithRowbounds(PostCriteria example, RowBounds rowBounds);

    List<Post> selectByExample(PostCriteria example);

    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostCriteria example);

    int updateByExample(@Param("record") Post record, @Param("example") PostCriteria example);
}