package com.warmfrog.star.service.impl;

import com.github.pagehelper.PageInfo;
import com.warmfrog.star.common.builder.BookBuilder;
import com.warmfrog.star.common.dto.BookDto;
import com.warmfrog.star.common.enums.DeleteFlagEnum;
import com.warmfrog.star.common.vo.BookVo;
import com.warmfrog.star.dao.BookDao;
import com.warmfrog.star.dao.mapper.entity.Book;
import com.warmfrog.star.dao.mapper.entity.BookCriteria;
import com.warmfrog.star.service.BookService;
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
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public void insert(BookDto bookDto) {
        bookDao.getMapper().insert(BookBuilder.newInstance().buildInsert(bookDto));
    }

    @Override
    public void update(BookDto bookDto) {
        bookDao.getMapper().updateByPrimaryKeySelective(BookBuilder.newInstance().buildUpdate(bookDto));
    }

    @Override
    public void delete(BookDto bookDto) {
        bookDao.getMapper().updateByPrimaryKeySelective(BookBuilder.newInstance().buildDelete(bookDto));
    }

    @Override
    public BookVo get(BookDto bookDto) {
        Book book = bookDao.getMapper().selectByPrimaryKey(bookDto.getUuid());
        BookVo bookVo = new BookVo();
        BeanUtils.copyProperties(book, bookVo);
        return bookVo;
    }

    @Override
    public List<BookVo> list(BookDto bookDto) {
        BookCriteria example = new BookCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());
        List<Book> books = bookDao.getMapper().selectByExample(example);
        List<BookVo> bookVos = new ArrayList<>();
        books.forEach(book -> {
            BookVo bookVo = new BookVo();
            BeanUtils.copyProperties(book, bookVo);
            bookVos.add(bookVo);
        });
        return bookVos;
    }

    @Override
    public PageInfo<BookVo> listByPage(BookDto bookDto) {
        BookCriteria example = new BookCriteria();
        example.createCriteria().andDeleteFlagEqualTo(DeleteFlagEnum.NODELETE.getValue());
        List<Book> books = bookDao.getMapper().selectByExample(example);
        List<BookVo> bookVos = new ArrayList<>();
        books.forEach(book -> {
            BookVo bookVo = new BookVo();
            BeanUtils.copyProperties(book, bookVo);
            bookVos.add(bookVo);
        });
        PageInfo<BookVo> pageInfo = new PageInfo<>();
        pageInfo.setPageSize(bookDto.getPageSize());
        pageInfo.setPageNum(bookDto.getCurrentPage());
        pageInfo.setList(bookVos);
        return pageInfo;
    }
}
