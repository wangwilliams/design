package com.company.abstractfactory.farm;

public class SGFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("韶关新创建一头牛");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("韶关新创建一批蔬菜");
        return new Vegetable();
    }
}
