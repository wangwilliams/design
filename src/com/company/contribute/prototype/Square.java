package com.company.contribute.prototype;

import java.util.Scanner;

public class Square implements Shape {

    @Override
    public Object clone() throws CloneNotSupportedException {
        Square b = null;
        b = (Square) super.clone();
        return b;
    }

    @Override
    public void countArea() {
        int d = 0;
        System.out.println("这是一个正方形，请输入边长： ");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        System.out.println(d*d);
    }
}
