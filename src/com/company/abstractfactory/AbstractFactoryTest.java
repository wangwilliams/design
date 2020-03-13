package com.company.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        factory1.newProduct1();
        factory1.newProduct2();
        factory2.newProduct1();
        factory2.newProduct2();
    }
}
