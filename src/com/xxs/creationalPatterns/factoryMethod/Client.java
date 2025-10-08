package com.xxs.creationalPatterns.factoryMethod;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        product.operation();
    }
}
