package com.company.adapter;

/**
 * 类继承的写法
 */
public class AdapteeTest {
    public static void main(String[] args) {
        System.out.println("适配器模拟测试。");
        Target target = new ClassAdapter();
        target.Request();
    }
}

interface Target {
    public void Request();
}

class Adaptee {
    public void specialRequest() {
        System.out.println("适配器中的代码被调用！");
    }
}

class ClassAdapter extends Adaptee implements Target {
    public void Request() {
        super.specialRequest();
    }
}
