package com.company.bridge;

interface Implementor {
    public void OperationImpl();
}

/**
 * 桥接模式基本构型
 */
public class BridgeTest {
    public static void main(String[] args) {
        Abstraction abstractionA = new RefinedAbstraction(new ConcreteImplementorA());
        abstractionA.Operation();
        Abstraction abstractionB = new RefinedAbstraction(new ConcreteImplementorB());
        abstractionB.Operation();
    }
}

abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void Operation();
}

class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("Refined abstraction");
        implementor.OperationImpl();
    }
}

class ConcreteImplementorA implements Implementor {

    @Override
    public void OperationImpl() {
        System.out.println("Concrete Implementor A");
    }
}

class ConcreteImplementorB implements Implementor {

    @Override
    public void OperationImpl() {
        System.out.println("Concrete Implementor B");
    }
}
