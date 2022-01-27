package com.example.demo;

public class Tyre {
    private String brand;

    public void initialize() {
        this.brand = "MRF";
    }

    public Tyre(String brand) {
        super();
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Tyre brand is " + brand;
    }
}
