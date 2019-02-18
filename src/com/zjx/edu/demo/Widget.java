package com.zjx.edu.demo;

/**
 * @author Think
 */
public class Widget {

    protected synchronized void doSomething(){

        System.out.println("Widget" +  Thread.currentThread().getName());
        System.out.println("Widget" +  Thread.currentThread());

    }


}
