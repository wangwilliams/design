package com.company.factory;

import com.company.factory.impl.Product;

public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
