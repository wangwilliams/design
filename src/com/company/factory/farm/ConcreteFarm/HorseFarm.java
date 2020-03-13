package com.company.factory.farm.ConcreteFarm;

import com.company.factory.farm.impl.Animal;
import com.company.factory.farm.impl.AnimalFarm;
import com.company.factory.farm.pojo.Horse;

public class HorseFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("HorseFarm-->horse");
        return new Horse();
    }
}
