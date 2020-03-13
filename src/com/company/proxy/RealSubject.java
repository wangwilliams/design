package com.company.proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实工作类，想做什么做什么，比如可以访问数据，加载数据");
    }
}
