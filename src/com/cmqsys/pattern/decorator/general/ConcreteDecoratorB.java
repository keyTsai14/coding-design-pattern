package com.cmqsys.pattern.decorator.general;

public class ConcreteDecoratorB extends Decorator {
    /**
     * 构造方法，传入组件对象
     */
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void operationFirst(){}
    private void operationLast(){}

    @Override
    public void operation() {
        operationFirst();// 添加新功能
        super.operation();// 这里可以选择性的调用父类的方法，如果不调用相当于完全重写了方法
        operationLast();// 添加新功能
    }
}
