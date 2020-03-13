package com.company.abstractfactory.farm;

public class Fruit implements Plant {
    @Override
    public void show() {
        System.out.println("我是水果。");
    }
}
