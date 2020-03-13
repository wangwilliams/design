package com.company.builder;

public class BuilderTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.show());
    }
}
