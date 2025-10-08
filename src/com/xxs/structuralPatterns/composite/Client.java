package com.xxs.structuralPatterns.composite;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Composite leaf3 = new Composite();
        leaf3.add(leaf1);
        leaf3.add(leaf2);

        root.add(leaf1);
        root.add(leaf2);
        root.add(leaf3);

        root.operation();  // 统一调用
    }
}
