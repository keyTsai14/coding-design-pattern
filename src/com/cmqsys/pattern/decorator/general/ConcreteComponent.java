package com.cmqsys.pattern.decorator.general;

public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("处理业务逻辑");
    }
}
