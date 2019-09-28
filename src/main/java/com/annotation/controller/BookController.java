package com.annotation.controller;

import com.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhl
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
