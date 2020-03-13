package com.company.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("ConcreteFactory1 创建具体产品 product 11");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("ConcreteFactory1 创建具体产品 product 12");
        return new ConcreteProduct12();
    }
}
