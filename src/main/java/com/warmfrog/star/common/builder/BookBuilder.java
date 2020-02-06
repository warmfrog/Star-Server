package com.warmfrog.star.common.builder;

import com.warmfrog.star.common.dto.BookDto;
import com.warmfrog.star.dao.mapper.entity.Book;
import org.springframework.beans.BeanUtils;

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
        return book;
    }

    @Override
    public Book buildUpdate(BookDto bookDto) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDto, book);
        return book;
    }

    @Override
    public Book buildDelete(BookDto bookDto) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDto, book);
        return book;
    }
}
