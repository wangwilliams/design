package com.company.Flyweight;

import java.util.concurrent.ConcurrentHashMap;

interface FlyWeight {
    public void operation(UnsharedConcreteFlyweight state);
}

/**
 * 享元模式 就是利用map数据结构，将一些信息缓存在map里面，然后没有就创建，有的话就直接读取
 */
public class FlyweightTest {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight f01 = factory.getFlyWeight("a");
        FlyWeight f02 = factory.getFlyWeight("a");
        FlyWeight f03 = factory.getFlyWeight("a");
        FlyWeight f11 = factory.getFlyWeight("b");
        FlyWeight f12 = factory.getFlyWeight("b");
        f01.operation(new UnsharedConcreteFlyweight("第一次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第二次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第三次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第一次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第二次调用b。"));
    }
}

class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

class ConcreteFlyWeight implements FlyWeight {
    private String key;

    public ConcreteFlyWeight(String key) {
        this.key = key;
        System.out.println("具体享元：" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息：" + state.getInfo());
    }
}

class FlyWeightFactory {
    private ConcurrentHashMap<String, FlyWeight> flyweights = new ConcurrentHashMap<>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = flyweights.get(key);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight(key);
            flyweights.put(key, flyWeight);
        } else {
            System.out.println("具体享元" + key + "已经存在，被成功捕获");
        }
        return flyWeight;
    }

}