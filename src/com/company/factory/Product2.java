package com.company.factory;

import com.company.factory.impl.Product;

public class Product2 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
