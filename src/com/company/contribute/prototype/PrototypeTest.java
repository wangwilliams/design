package com.company.contribute.prototype;

import java.util.Optional;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
       Citation obj1 = new Citation("张三","同学:在2019学年第一学期中表现优秀，被评为三好学生。","湖南大学");
        Optional.of(obj1.toString()).ifPresent(System.out::println);
        Citation obj2 = (Citation) obj1.clone();
        obj2.setName("李四");
        Optional.of(obj2.toString()).ifPresent(System.out::println);

        RealizeType realizeType = (RealizeType) PrototypeManager.get("RealizeType");
    }
}
