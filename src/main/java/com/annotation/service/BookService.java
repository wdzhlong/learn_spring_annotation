package com.annotation.service;

import javax.inject.Inject;

import com.annotation.dao.BookDao;
import org.springframework.stereotype.Service;

/**
 * @author zhl
 */
@Service
public class BookService {

    //@Qualifier("bookDao")
    //@Autowired(required=false)
    //@Resource(name="bookDao2")
    @Inject
    private BookDao bookDao;

    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }
}
