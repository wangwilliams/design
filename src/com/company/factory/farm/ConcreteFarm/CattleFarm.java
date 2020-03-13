package com.company.factory.farm.ConcreteFarm;

import com.company.factory.farm.impl.Animal;
import com.company.factory.farm.impl.AnimalFarm;
import com.company.factory.farm.pojo.Cattle;

public class CattleFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("CattleFarm-->cattle");
        return new Cattle();
    }
}
