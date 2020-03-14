package com.company.bridge;

interface Color {
    String getColor();
}

public class BridgeBagTest {
    public static void main(String[] args) {
        Bag redWallet = new Wallet(new Red());
        Bag yellowWallet = new Wallet(new Yellow());
        Bag redHandBag = new HandBag(new Red());
        Bag yellowHandBag = new HandBag(new Yellow());

        System.out.println("red wallet: " + redWallet.getName());
        System.out.println("yellow wallet: " + yellowWallet.getName());
        System.out.println("red handBag: " + redHandBag.getName());
        System.out.println("yellow HandBag: " + yellowHandBag.getName());
    }

}

abstract class Bag {
    protected Color color;
    protected String name;

    public Bag(Color color) {
        this.color = color;
        name = getClass().getSimpleName();
    }

    protected abstract String getName();
}

class HandBag extends Bag {

    public HandBag(Color color) {
        super(color);
    }

    @Override
    protected String getName() {
        return color.getColor() + " " + name;
    }
}

class Wallet extends Bag {

    public Wallet(Color color) {
        super(color);
    }

    @Override
    protected String getName() {
        return color.getColor() + " " + name;
    }
}

class Yellow implements Color {

    @Override
    public String getColor() {
        return "yellow";
    }
}

class Red implements Color {

    @Override
    public String getColor() {
        return "red";
    }
}