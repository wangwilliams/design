package com.company.contribute.Singleton;

import java.util.Optional;

/**
 *  单例创建方法：懒汉写法
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton(){
    }

    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
            Optional.of("单例类第一次生成").ifPresent(System.out::println);
        }else {
            Optional.of("单例类已经被创建").ifPresent(System.out::println);
        }
        return instance;
    }
}
