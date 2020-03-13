package com.company.builder.saloon;

public class Test {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager(new ConcreteBuilder());
        Saloon saloon = pm.decorate();
        saloon.show();
    }
}
