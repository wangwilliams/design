package com.company.contribute.prototype;

public class ShapeManagerTest {
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeManager.get("circle");
        circle.countArea();
        Square square = (Square) ShapeManager.get("square");
        square.countArea();
    }
}
