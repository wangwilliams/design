package com.company.decorate;

import javax.xml.stream.events.Comment;

interface Component {
    public void Operation();
}

public class DecorateTest {
    public static void main(String[] args) {
        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1(new ConcreteComponentA());
        concreteDecorator1.Operation();
        ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2(new ConcreteComponentB());
        concreteDecorator2.Operation();
    }
}

abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        component.Operation();
    }
}

class ConcreteComponentA implements Component {

    @Override
    public void Operation() {
        System.out.println("Concrete Component A");
    }
}

class ConcreteComponentB implements Component {

    @Override
    public void Operation() {
        System.out.println("Concrete Component B");
    }
}

class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void Operation() {
        super.Operation();
    }
}

class ConcreteDecorator2 extends ConcreteDecorator1 {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void Operation() {
        super.Operation();
    }
}

