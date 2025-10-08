package com.xxs.creationalPatterns.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.operationA();
        productB.operationB();
    }
}
