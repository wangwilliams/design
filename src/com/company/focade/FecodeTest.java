package com.company.focade;

interface Shape {
    void draw();
}

public class FecodeTest {
    public static void main(String[] args) {
        Focade focade = new Focade();
        focade.draw();
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a circle");
    }
}


class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }
}

class Trangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a trangle");
    }
}

class Focade implements Shape {
    private Circle circle = new Circle();
    private Rectangle rectangle = new Rectangle();
    private Trangle trangle = new Trangle();

    @Override
    public void draw() {
        circle.draw();
        rectangle.draw();
        trangle.draw();
    }
}