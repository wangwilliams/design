package com.company.abstractfactory.farm;

public class SRFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("上饶新创建一批马");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("上饶新创建一批水果");
        return new Fruit();
    }
}
