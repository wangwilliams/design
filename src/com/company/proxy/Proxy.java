package com.company.proxy;

public class Proxy implements Subject {
    private Subject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
