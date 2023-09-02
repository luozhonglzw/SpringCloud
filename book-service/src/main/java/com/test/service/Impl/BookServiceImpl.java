package com.test.service.Impl;

import com.test.Mapper.BookMapper;
import com.test.entity.book;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;

    @Override
    public book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
