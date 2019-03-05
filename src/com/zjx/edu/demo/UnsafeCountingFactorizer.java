package com.zjx.edu.demo;


public class UnsafeCountingFactorizer {
    private long count = 0;
    //私有内部类，外部创建
    private UnsafeCountingFactorizer(){ }

    public long getCount(){ return count; }

    public void incrCount(){
        count++;
    }
    /*
     * 使用静态内部类实现单例，这样就会操作同一个count产生静态条件
     */
    private static class SimpleClassFactory{
        private static final UnsafeCountingFactorizer INSTANCE = new UnsafeCountingFactorizer();
    }
    public static UnsafeCountingFactorizer getInstance(){
        return SimpleClassFactory.INSTANCE;
    }
}
