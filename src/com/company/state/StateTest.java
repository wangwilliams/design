package com.company.state;

interface State {
    public void doAction(Context context);
}

/**
 * 状态类，实现一个公共的接口，然后在公共的接口中将自身状态添加到一个Context上下文里面。这样就能从中读取状态
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        State state = new StartState();
        state.doAction(context);
        System.out.println(context.getState().toString());
        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is at starting state . ");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "context is start state";
    }
}

class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is at stopping state . ");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "context is stop state";
    }
}

