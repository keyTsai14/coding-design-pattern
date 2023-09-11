package com.cmqsys.pattern.decorator.general;

public class Client {
    public static void main(String[] args) {
        // 1 创建需要被修饰的原始对象（即为被修饰的对象）
        ConcreteComponent component = new ConcreteComponent();
        // 给对象透明的增加功能A并调用
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();
        // 给对象透明的增加功能B并调用
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operation();
        // 修饰器也可以修饰具体的修饰器
        ConcreteDecoratorB decoratorB1 = new ConcreteDecoratorB(decoratorA);
        decoratorB1.operation();
    }
}
