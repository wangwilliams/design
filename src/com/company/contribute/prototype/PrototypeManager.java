package com.company.contribute.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrototypeManager {
    private static Map<String,Object> map = new ConcurrentHashMap<>();
    static {
        map.put("RealizeType",new RealizeType());
    }
    public static Object get(String  id){
        return map.get(id);
    }

    public static void set(String id, Object obj) {
        map.put(id, obj);
    }


}
