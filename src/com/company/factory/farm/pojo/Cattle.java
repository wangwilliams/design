package com.company.factory.farm.pojo;

import com.company.factory.farm.impl.Animal;

public class Cattle implements Animal {
    @Override
    public void show() {
        System.out.println("create a cattle");
    }
}
