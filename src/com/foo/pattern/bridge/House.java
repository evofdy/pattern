package com.foo.pattern.bridge;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("product house ...");
    }

    @Override
    public void beSelled() {
        System.out.println("sell house ...");
    }
}
