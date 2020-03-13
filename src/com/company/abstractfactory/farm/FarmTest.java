package com.company.abstractfactory.farm;

public class FarmTest {
    public static void main(String[] args) {
        Farm SRfarm = new SRFarm();
        Animal cattle = SRfarm.newAnimal();
        Plant vegetable = SRfarm.newPlant();
        cattle.show();
        vegetable.show();
        Farm SGfarm = new SGFarm();
        Animal horse = SGfarm.newAnimal();
        Plant fruit = SGfarm.newPlant();
        horse.show();
        fruit.show();
    }
}
