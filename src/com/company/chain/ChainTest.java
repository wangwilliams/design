package com.company.chain;

public class ChainTest {
    public static void main(String[] args) {
        Handler log = new LogHandler(Handler.LOG);
        Handler waring = new LogHandler(Handler.WARNING);
        Handler error = new LogHandler(Handler.ERROR);
        log.setNext(waring);
        waring.setNext(error);
        log.handleRequest(Handler.LOG, "我是log 级别的");
        log.handleRequest(Handler.WARNING, "我是WARNING 级别的");
        log.handleRequest(Handler.ERROR, "我是ERROR 级别的");
        log.handleRequest(4, "我是ERROR 级别的");
    }
}

abstract class Handler {
    public final static int LOG = 1;
    public final static int WARNING = 2;
    public final static int ERROR = 3;
    public final static String[] level_str = {"LOG", "WARNING", "ERROR"};
    private Handler next;
    private int level;

    public Handler(int level) {
        this.level = level;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handleRequest(int level, String request) {
        if (level <= this.level) {
            System.out.println("" + level_str[this.level - 1] + " level " + request);
            return;
        } else if (next != null) {
            next.handleRequest(level, request);
        } else {
            System.out.println("级别超出");
        }
    }
}

class LogHandler extends Handler {

    public LogHandler(int level) {
        super(level);
    }
}

class WarningHandler extends Handler {

    public WarningHandler(int level) {
        super(level);
    }
}

class ErrorHandler extends Handler {

    public ErrorHandler(int level) {
        super(level);
    }
}

