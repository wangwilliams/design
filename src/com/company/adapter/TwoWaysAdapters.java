package com.company.adapter;

interface TwoWayAdaptee {
    public void specificRequest();
}

interface TwoWayTarget {
    public void request();
}

/**
 * 双向适配器，满足互相作为对方的适配器
 * 不是很好用，而且容易出问题
 */
public class TwoWaysAdapters {
    public static void main(String[] args) {
        TwoWayAdapter AToO = new TwoWayAdapter(new AdapteeRealize());
        AToO.request();
        TwoWayAdapter OToA = new TwoWayAdapter(new TargetRealize());
        OToA.specificRequest();
    }
}

class AdapteeRealize implements TwoWayAdaptee {

    @Override
    public void specificRequest() {
        System.out.println("AdapteeRealize concrete");
    }
}

class TargetRealize implements TwoWayTarget {

    @Override
    public void request() {
        System.out.println("TargetRealize concrete");
    }
}

class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {
    private TwoWayAdaptee twoWayAdaptee;
    private TwoWayTarget twoWayTarget;

    public TwoWayAdapter(TwoWayAdaptee twoWayAdaptee) {
        this.twoWayAdaptee = twoWayAdaptee;
    }

    public TwoWayAdapter(TwoWayTarget twoWayTarget) {
        this.twoWayTarget = twoWayTarget;
    }

    @Override
    public void specificRequest() {
        twoWayTarget.request();
    }

    @Override
    public void request() {
        twoWayAdaptee.specificRequest();
    }
}
