package com.company.builder;

public abstract class AbstractBuilder {
    protected Product product = null;

    public void buildPartA(String partA) {
        product.setPartA(partA);
    }

    public void buildPartB(String partB) {
        product.setPartA(partB);
    }

    public void buildPartC(String partC) {
        product.setPartA(partC);
    }

    public Product getResult() {
        return product;
    }
}
