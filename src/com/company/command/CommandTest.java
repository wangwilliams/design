package com.company.command;
/**
 * 实现命令模式
 */

import java.util.ArrayList;

// 公共接口，用来统一命令接口
interface Order {
    public void execute();
}

public class CommandTest {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Order buyOrder = new BuyOrder(stock);
        Order sellOrder = new SellOrder(stock);
        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        broker.executeOrder();
    }
}

/**
 * 原方法类，等待被拆分，真正的执行单元
 */
class Stock {
    private String name = "王云鹏";
    private String key = "123456";

    public void buy() {
        System.out.println("name : " + name + " key : " + key + "  buy");
    }

    public void sell() {
        System.out.println("name : " + name + " key : " + key + "  sell");
    }
}

// 具体命令，使用order接口然后在order的execute方法里面分别调用stock的具体方法
class BuyOrder implements Order {
    private Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

class SellOrder implements Order {
    private Stock stock;

    public SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}

// 组合器，将命令组合在一起
class Broker {
    private ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void executeOrder() {
        for (Order order : orders) {
            order.execute();
        }
    }
}