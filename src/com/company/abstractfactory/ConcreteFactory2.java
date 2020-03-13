package com.company.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("ConcreteFactory2 创建具体产品 product 21");
        return new ConcreteProduct21();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("ConcreteFactory2 创建具体产品 product 22");
        return new ConcreteProduct22();
    }
}
