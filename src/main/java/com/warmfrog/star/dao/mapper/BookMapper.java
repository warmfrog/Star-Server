package com.warmfrog.star.dao.mapper;

import com.warmfrog.star.dao.mapper.entity.Book;
import com.warmfrog.star.dao.mapper.entity.BookCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BookMapper {
    long countByExample(BookCriteria example);

    int deleteByExample(BookCriteria example);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExampleWithRowbounds(BookCriteria example, RowBounds rowBounds);

    List<Book> selectByExample(BookCriteria example);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookCriteria example);

    int updateByExample(@Param("record") Book record, @Param("example") BookCriteria example);
}