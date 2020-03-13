package com.company.contribute.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        President president = President.getInstance();
        President president1 = President.getInstance();
        System.out.println(president.equals(president1));
        System.out.println(president.getName());
    }
}
