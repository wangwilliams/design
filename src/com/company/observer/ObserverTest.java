package com.company.observer;

import java.util.ArrayList;

interface Observer {
    public void response();
}

/**
 * 观察者设计模式，被观察者subject创建数组
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver1(subject);
        Observer observer2 = new ConcreteObserver2(subject);
        subject.notifyAllObserver();
    }
}

class ConcreteObserver1 implements Observer {
    private Subject subject = null;

    public ConcreteObserver1(Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void response() {
        System.out.println("ConcreteObserver1 收到信息");
    }
}

class ConcreteObserver2 implements Observer {
    private Subject subject = null;

    public ConcreteObserver2(Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void response() {
        System.out.println("ConcreteObserver2 收到信息");
    }
}

class Subject {
    ArrayList<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
