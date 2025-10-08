package com.xxs.creationalPatterns.builder;
// 客户端代码
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product result = builder.getResult();
        System.out.println("result = " + result);
    }
}
