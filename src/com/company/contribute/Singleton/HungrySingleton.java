package com.company.contribute.Singleton;

/**
 * 饿汉写法，因为每个饿汉单例都是final的，都是静态的，不存在线程安全的问题
 */

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public HungrySingleton getInstance() {
        return instance;
    }
}
