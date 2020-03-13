package com.company.builder.saloon;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildWall() {
        saloon.setWall("蓝色墙面");
    }

    @Override
    public void buildSofa() {
        saloon.setSofa("皮质沙发");
    }

    @Override
    public void buildTV() {
        saloon.setTV("100英寸彩电");
    }
}
