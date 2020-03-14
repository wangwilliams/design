package com.company.adapter;

interface TargetObject {
    public void Request();
}

/**
 * 对象聚合的写法
 */
public class AdapterObjectTest {
    public static void main(String[] args) {
        TargetObject adapter = new AdapterObject();
        adapter.Request();
    }
}

class Adapee {
    public void specificRequest() {
        System.out.println("对象适配器，被适配代码得到调用");
    }
}

class AdapterObject implements TargetObject {
    Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        adaptee.specialRequest();
    }
}
