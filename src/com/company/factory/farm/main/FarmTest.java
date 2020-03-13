package com.company.factory.farm.main;


import com.company.factory.ReadXML;
import com.company.factory.farm.ConcreteFarm.CattleFarm;
import com.company.factory.farm.ConcreteFarm.HorseFarm;
import com.company.factory.farm.impl.Animal;
import com.company.factory.farm.impl.AnimalFarm;
import com.company.factory.farm.pojo.Cattle;
import com.company.factory.farm.pojo.Horse;

public class FarmTest {
    public static void main(String[] args) {
        AnimalFarm animalFarm = new HorseFarm();
        Horse horse = (Horse) animalFarm.newAnimal();
        AnimalFarm animalFarm1 = (AnimalFarm) ReadXML.getObject();
        Cattle cattle = (Cattle) animalFarm1.newAnimal();
        horse.show();
        cattle.show();
    }
}
