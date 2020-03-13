package com.company.factory.farm.pojo;

import com.company.factory.farm.impl.Animal;

public class Horse implements Animal {
    @Override
    public void show() {
        System.out.println("create a horse");
    }
}
