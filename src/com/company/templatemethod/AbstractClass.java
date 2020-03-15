package com.company.templatemethod;

/**
 * 模板设计模式，主要是定义抽象类，抽象类分两个部分，一个是外部可直接调用的方法
 * 便于外部直接调用，另一个是具体方法，需要子类继承复写
 */
public class AbstractClass {
    public static void main(String[] args) {
        AbstractClassFormal abstractClassFormal = new ConcreteClassA();
        abstractClassFormal.TemplateMethod();
        abstractClassFormal = new ConcreteClassB();
        abstractClassFormal.TemplateMethod();
    }
}

abstract class AbstractClassFormal {
    public void TemplateMethod() {
        abstractMethod1();
        abstractMethod2();
    }

    protected abstract void abstractMethod1();

    protected abstract void abstractMethod2();
}

class ConcreteClassA extends AbstractClassFormal {
    @Override
    protected void abstractMethod1() {
        System.out.println("Concrete Class A abstract method 1");
    }

    @Override
    protected void abstractMethod2() {
        System.out.println("Concrete Class A abstract method 2");
    }
}


class ConcreteClassB extends AbstractClassFormal {
    @Override
    protected void abstractMethod1() {
        System.out.println("Concrete Class B abstract method 1");
    }

    @Override
    protected void abstractMethod2() {
        System.out.println("Concrete Class B abstract method 2");
    }
}