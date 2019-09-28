package com.annotation;

import com.annotation.bean.Boss;
import com.annotation.bean.Car;
import com.annotation.bean.Color;
import com.annotation.config.MainConifgOfAutowired;
import com.annotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        //BookDao bean = applicationContext.getBean(BookDao.class);
        //System.out.println(bean);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
        System.out.println(applicationContext);
        applicationContext.close();
    }

}
