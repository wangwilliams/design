package com.company.builder;

public class BuilderTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        builder.buildPartA("I");
        builder.buildPartB("love");
        builder.buildPartC("you");
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
