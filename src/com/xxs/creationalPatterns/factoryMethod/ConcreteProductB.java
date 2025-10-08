package com.xxs.creationalPatterns.factoryMethod;
// 具体产品B
public class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductB operation");
    }
}
