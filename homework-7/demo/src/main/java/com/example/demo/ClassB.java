package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassB {
    private ClassA a;

    @Autowired
    public ClassB(ClassA a) {
        super();
        this.a = a;
    }
}
