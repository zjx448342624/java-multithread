package com.zjx.edu.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args) {

        AtomicInteger integer = new AtomicInteger(0);
        System.out.println(integer.getAndAdd(3));
        System.out.println(integer.intValue());

    }


}
