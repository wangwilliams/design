package com.company.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者类似于服务器，把中介者看作成服务器，c端将s端注册，并把自己注册到s端
 * 然后c端调用s端的方法，将信息发送个其他的c端
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ColleagueA();
        colleagueA.setMediator(mediator);
        Colleague colleagueB = new ColleagueB();
        colleagueB.setMediator(mediator);
        Colleague colleagueC = new ColleagueC();
        colleagueC.setMediator(mediator);
        colleagueA.send(colleagueB);
        colleagueB.send(colleagueC);
        colleagueC.send(colleagueB);
    }
}

abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl);
}

class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague colleague : colleagues) {
            if (colleague.equals(cl)) {
                colleague.receive();
            }
        }
    }
}

abstract class Colleague {
    protected Mediator mediator;

    public abstract void setMediator(Mediator mediator);

    public abstract void receive();

    public abstract void send(Colleague colleague);
}

class ColleagueA extends Colleague {

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    @Override
    public void receive() {
        System.out.println("colleague A receive!");
    }

    @Override
    public void send(Colleague colleague) {
        System.out.println("Colleague A send.");
        mediator.relay(colleague);
    }
}

class ColleagueB extends Colleague {

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    @Override
    public void receive() {
        System.out.println("colleague B receive!");
    }

    @Override
    public void send(Colleague colleague) {
        System.out.println("Colleague A send.");
        mediator.relay(colleague);
    }
}

class ColleagueC extends Colleague {

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    @Override
    public void receive() {
        System.out.println("colleague C receive!");
    }

    @Override
    public void send(Colleague colleague) {
        System.out.println("Colleague A send.");
        mediator.relay(colleague);
    }
}