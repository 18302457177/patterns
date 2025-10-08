package com.xxs.creationalPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Prototype Data");
        ConcretePrototype prototype1 = (ConcretePrototype) prototype.clone();
        System.out.println("prototype1 = " + prototype1.getData());
        prototype1.setData("Modified Data");
        System.out.println("prototype = " + prototype.getData());
        System.out.println("prototype1 = " + prototype1.getData());
        /**
         * 示例中的 String 是不可变类型，修改字符串时实际上是创建了新对象，
         * 因此不会影响原对象。但如果字段是可变对象（如集合、数组、自定义类），
         * 浅拷贝可能会导致引用共享，带来潜在副作用，此时应考虑使用深拷贝。
         */
    }
}
