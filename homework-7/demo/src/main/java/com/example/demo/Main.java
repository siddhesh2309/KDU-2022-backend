package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle obj = (Vehicle) context.getBean("vehicle");
//        obj.drive();
        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);
    }
}