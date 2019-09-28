package com.annotation;

import com.annotation.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    @Test
    public void test01() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");
        //applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }
}
