package com.company.builder;

public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
        System.out.println("ConcreteBuilder build part A");
        super.product.setPartA("I");
    }

    @Override
    public void buildPartB() {
        System.out.println("ConcreteBuilder build part B");
        super.product.setPartB("love");
    }

    @Override
    public void buildPartC() {
        System.out.println("ConcreteBuilder build part C");
        super.product.setPartC("you");
    }
}
