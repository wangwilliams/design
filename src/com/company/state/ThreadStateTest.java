package com.company.state;

interface ThreadState {
    void stateName(ThreadContext context);

    void work();
}

public class ThreadStateTest {
    public static void main(String[] args) {
        ThreadContext threadContext = new ThreadContext();
        ThreadState newState = new NewState();
        newState.stateName(threadContext);
        threadContext.getState().work();
        ThreadState runnableState = new RunnableState();
        runnableState.stateName(threadContext);
        threadContext.getState().work();
        ThreadState runningState = new RunningState();
        runningState.stateName(threadContext);
        threadContext.getState().work();
        ThreadState blockState = new BlockState();
        blockState.stateName(threadContext);
        threadContext.getState().work();
        ThreadState deadState = new DeadState();
        deadState.stateName(threadContext);
        threadContext.getState().work();

    }
}

class ThreadContext {
    ThreadState state;

    public ThreadContext() {
        state = null;
    }

    public ThreadState getState() {
        return state;
    }

    public void setState(ThreadState state) {
        this.state = state;
    }
}

class NewState implements ThreadState {

    @Override
    public void stateName(ThreadContext context) {
        System.out.println("set thread state new create state.");
        context.setState(this);
    }

    @Override
    public void work() {
        System.out.println("create new thread.");
    }
}


class RunnableState implements ThreadState {

    @Override
    public void stateName(ThreadContext context) {
        System.out.println("set thread at runnable state.");
        context.setState(this);
    }

    @Override
    public void work() {
        System.out.println("thread is runnable");
    }
}


class RunningState implements ThreadState {

    @Override
    public void stateName(ThreadContext context) {
        System.out.println("set thread at running state.");
        context.setState(this);
    }

    @Override
    public void work() {
        System.out.println("thread is running.");
    }
}


class BlockState implements ThreadState {

    @Override
    public void stateName(ThreadContext context) {
        System.out.println("set thread at block state.");
        context.setState(this);
    }

    @Override
    public void work() {
        System.out.println("Block thread.");
    }
}

class DeadState implements ThreadState {

    @Override
    public void stateName(ThreadContext context) {
        System.out.println("set thread at dead state.");
        context.setState(this);
    }

    @Override
    public void work() {
        System.out.println("thread died.");
    }
}
