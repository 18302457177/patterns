package com.xxs.creationalPatterns.singleton;

/**
 * 双重检查锁定
 */
public class Singleton5 {
    private static volatile Singleton5 Instance;
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        if (Instance == null){
            synchronized (Singleton5.class){
                if(Instance == null){
                    Instance = new Singleton5();
                }
            }
        }
        return Instance;
    }
}
