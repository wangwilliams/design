package com.company.state;

public class ThreadState2Test {
    public static void main(String[] args) throws Exception {
        ThreadContext2 context = new ThreadContext2();
        context.setState(new New());
        System.out.println(context.getState().getClass().getSimpleName());
        context.start();
        System.out.println(context.getState().getClass().getSimpleName());
        context.running();
        System.out.println(context.getState().getClass().getSimpleName());
        context.Block();
        System.out.println(context.getState().getClass().getSimpleName());
        context.reRunning();
        System.out.println(context.getState().getClass().getSimpleName());
        context.running();
        System.out.println(context.getState().getClass().getSimpleName());
        context.finished();
        System.out.println(context.getState().getClass().getSimpleName());
    }
}

class ThreadContext2 {
    ThreadState2 state;

    public ThreadState2 getState() {
        return state;
    }

    public void setState(ThreadState2 state) {
        this.state = state;
    }

    public void start() throws Exception {
        ((New) state).start(this);
    }

    public void running() throws Exception {
        ((Runnable2) state).running(this);
    }

    public void Block() throws Exception {
        ((Running) state).Block(this);
    }

    public void reRunning() throws Exception {
        ((Blocked) state).reRunning(this);
    }

    public void finished() throws Exception {
        ((Running) state).finished(this);
    }
}

abstract class ThreadState2 {
    protected String stateName;
}

class New extends ThreadState2 {
    public New() {
        stateName = "new";
    }

    public void start(ThreadContext2 context) throws Exception {
        if (stateName.equals("new")) {
            context.setState(new Runnable2());
        } else {
            throw new Exception("该状态不能调用这个方法");
        }
    }
}

class Runnable2 extends ThreadState2 {
    public Runnable2() {
        stateName = "Runnable2";
    }

    public void running(ThreadContext2 context) throws Exception {
        if (stateName.equals("Runnable2")) {
            context.setState(new Running());
        } else {
            throw new Exception("该状态不能调用这个方法");
        }
    }
}

class Running extends ThreadState2 {
    public Running() {
        stateName = "Running";
    }

    public void Block(ThreadContext2 context) throws Exception {
        if (stateName.equals("Running")) {
            context.setState(new Blocked());
        } else {
            throw new Exception("该状态不能调用这个方法");
        }
    }

    public void finished(ThreadContext2 context) throws Exception {
        if (stateName.equals("Running")) {
            context.setState(new Dead());
        } else {
            throw new Exception("该状态不能调用这个方法");
        }
    }
}

class Blocked extends ThreadState2 {
    public Blocked() {
        stateName = "Blocked";
    }

    public void reRunning(ThreadContext2 context) throws Exception {
        if (stateName.equals("Blocked")) {
            context.setState(new Runnable2());
        } else {
            throw new Exception("该状态不能调用这个方法");
        }
    }
}

class Dead extends ThreadState2 {
    public Dead() {
        stateName = "Dead";
    }
}