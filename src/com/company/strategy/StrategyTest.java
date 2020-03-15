package com.company.strategy;

interface Strategy {
    public void strategyMethod();
}

public class StrategyTest {
    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        strategyA.strategyMethod();
        strategyA = new ConcreteStrategyB();
        strategyA.strategyMethod();
    }
}

class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("Concrete Strategy A");
    }
}

class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("Concrete Strategy B");
    }
}