package com.test.controller;

import com.test.entity.book;
import com.test.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BookController {
    @Resource
    BookService service;
    @RequestMapping("/book/{bid}")
    public book findUserById(@PathVariable("bid") int bid){//这里是一种风格 通过路径去改变bid的值
        return service.getBookById(bid);
    }
}
