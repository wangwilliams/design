package com.company.builder;

public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product construct() {
        return builder.getResult();
    }
}
