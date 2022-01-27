package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassA {
    private ClassB b;

    @Autowired
    public ClassA(ClassB b) {
        super();
        this.b = b;
    }
}
