package com.example.demo;
public interface Vehicle {
    public default void drive() {
        System.out.println("Vehicle");
    }

}
