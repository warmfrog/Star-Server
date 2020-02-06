package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.BookDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.dao.mapper.entity.App;
import com.warmfrog.star.dao.mapper.entity.Book;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author libo
 * @date 2020/2/6
 */
public class BookBuilder implements BaseBuilder<Book, BookDto> {
    static BookBuilder instance;

    private BookBuilder() {
    }


    public static BookBuilder newInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new BookBuilder();
        }
        return instance;
    }

    @Override
    public Book buildInsert(BookDto bookDto) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDto, book);
        Date now = new Date();
        book.setCreateTime(now);
        book.setUpdateTime(now);
        book.setCreateUser("admin");
        book.setUpdateUser("admin");
        return book;
    }

    @Override
    public Book buildUpdate(BookDto bookDto) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDto, book);
        Date now = new Date();
        book.setUpdateTime(now);
        book.setUpdateUser("test");
        return book;
    }

    @Override
    public Book buildDelete(BookDto bookDto) {
        Book book = new Book();
        book.setUuid(bookDto.getUuid());
        book.setDeleteFlag(DeleteFlagEnum.DELETED.getValue());
        Date now = new Date();
        book.setUpdateTime(now);
        book.setUpdateUser("test");
        return book;
    }
}
