package com.company.builder;

public abstract class AbstractBuilder {
    protected Product product = new Product();

    public void buildPartA() {

    }

    public void buildPartB() {

    }

    public void buildPartC() {

    }

    public Product getResult() {
        return product;
    }
}
