package com.cmqsys.pattern.prototype.singleton;

import lombok.Data;

import java.util.List;
@Data
public class ConcretePrototype implements Cloneable {


    /**
    * 原型跟单例相互冲突，是原型模式就不能单例
    * */
    private int age;
    private String name;
    private List<String> hobbies;

    private static ConcretePrototype instance = new ConcretePrototype();

    private ConcretePrototype() {

    }

    public static ConcretePrototype getInstance() {
        return instance;
    }


    @Override
    public ConcretePrototype clone() {
        return instance;
    }
}
