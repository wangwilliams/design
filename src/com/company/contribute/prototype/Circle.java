package com.company.contribute.prototype;

import java.util.Scanner;

public class Circle implements Shape {
    @Override
    public Object clone() throws CloneNotSupportedException {
        Circle w = null;
        w = (Circle) super.clone();
        return w;
    }

    @Override
    public void countArea() {
        int d = 0;
        System.out.println("这是一个圆，请输入直径： ");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        System.out.println(d * d * Math.PI / 4);
    }
}
