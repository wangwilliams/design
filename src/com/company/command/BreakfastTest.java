package com.company.command;

import java.util.ArrayList;

interface Breakfast {
    public void cooking();
}

public class BreakfastTest {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Cooker cooker = new Cooker();
        Breakfast chanfen = new Changfen(cooker);
        Breakfast hundun = new Hundun(cooker);
        Breakfast hefen = new Hefen(cooker);
        waiter.addBreakfast(chanfen);
        waiter.addBreakfast(hundun);
        waiter.addBreakfast(hefen);
        waiter.operation();
    }
}

class Cooker {
    public void doChangfen() {
        System.out.println("做肠粉");
    }

    public void doHundun() {
        System.out.println("做馄饨");
    }

    public void doHefen() {
        System.out.println("做河粉");
    }
}

class Changfen implements Breakfast {
    private Cooker cooker;

    public Changfen(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void cooking() {
        cooker.doChangfen();
    }
}

class Hundun implements Breakfast {
    private Cooker cooker;

    public Hundun(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void cooking() {
        cooker.doHundun();
    }
}

class Hefen implements Breakfast {
    private Cooker cooker;

    public Hefen(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void cooking() {
        cooker.doHefen();
    }
}

class Waiter {
    ArrayList<Breakfast> breakfasts = new ArrayList<>();

    public void addBreakfast(Breakfast breakfast) {
        breakfasts.add(breakfast);
    }

    public void operation() {
        for (Breakfast breakfast : breakfasts) {
            breakfast.cooking();
        }
    }
}
