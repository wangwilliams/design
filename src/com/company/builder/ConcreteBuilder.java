package com.company.builder;

public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildPartA(String partA) {
        System.out.println("ConcreteBuilder build part A");
        super.buildPartA(partA);
    }

    @Override
    public void buildPartB(String partB) {
        System.out.println("ConcreteBuilder build part B");
        super.buildPartB(partB);
    }

    @Override
    public void buildPartC(String partC) {
        System.out.println("ConcreteBuilder build part C");
        super.buildPartC(partC);
    }
}
