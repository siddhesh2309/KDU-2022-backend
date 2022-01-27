package com.kd.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status) {
        System.out.println("Checkout Method from Amazon Shopping Cart called");
    }

    public int quantity() {
        return 2;
    }
}
