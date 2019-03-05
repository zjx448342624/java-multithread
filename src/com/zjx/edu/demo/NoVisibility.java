package com.zjx.edu.demo;

public class NoVisibility {

    private static boolean READ;

    private static int number;

    private static Object lock;

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (lock){
                while (READ) {
                    //释放当前线程的锁，然后重新获取
                    //但是由于read不是线程内可见所以一直执行该方法
                    Thread.yield();
                }
                System.out.println(number);
            }
        }).start();

        number = 42;
        READ = true;
        System.out.println("main OK" );

    }


}
