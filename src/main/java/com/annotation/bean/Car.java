package com.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @author zhl
 */
@Component
public class Car {

    public Car() {
        System.out.println("car constructor...");
    }

    public void init() {
        System.out.println("car ... init...");
    }

    public void detory() {
        System.out.println("car ... detory...");
    }
}
