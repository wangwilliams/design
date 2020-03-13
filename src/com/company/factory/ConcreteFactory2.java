package com.company.factory;

import com.company.factory.impl.AbstractFactory;
import com.company.factory.impl.Product;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2-->具体产品2...");
        return new Product2();
    }
}
