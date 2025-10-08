package com.xxs.creationalPatterns.singleton;

/**
 * 饿汉式（静态代码块）
 */
public class Singleton2 {
    private static final Singleton2 INSTANCE;

    static {
        INSTANCE = new Singleton2();
    }

    private Singleton2(){
        if (INSTANCE!=null){
            throw new RuntimeException("实例已存在");
        }
    }
    public Singleton2 getInstance(){
        return INSTANCE;
    }
}
