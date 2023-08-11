package com.cmqsys.pattern.prototype.shallow;

import lombok.Data;

import java.util.List;
@Data
public class ConcretePrototype implements Cloneable {


    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
