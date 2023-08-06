package com.cmqsys.pattern.prototype.general;

import com.cmqsys.pattern.prototype.general.ConcretePrototype;

public class Client {

    public static void main(String[] args) {

        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        System.out.println(prototype);

        ConcretePrototype cloneType = prototype.clone();
        System.out.println(cloneType);


    }
}
