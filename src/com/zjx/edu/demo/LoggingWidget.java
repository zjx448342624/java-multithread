package com.zjx.edu.demo;

/**
 * @author Think
 */
public class LoggingWidget extends Widget{

    @Override
    protected synchronized void doSomething(){

        System.out.println("LoggingWidget" +  Thread.currentThread().getName());
        System.out.println("LoggingWidget" +  Thread.currentThread());
        super.doSomething();
    }

    public static void main(String[] args) {
        LoggingWidget loggingWidget = new LoggingWidget();

        loggingWidget.doSomething();
    }

}
