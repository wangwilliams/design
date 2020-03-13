package com.company.contribute.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeManager {
    static Map<String,Shape> map = new ConcurrentHashMap<>();
    static {
        map.put("circle", new Circle());
        map.put("square",new Square());
    }
    public static Shape get(String id){
        return map.get(id);
    }
}
