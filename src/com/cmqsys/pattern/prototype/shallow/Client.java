package com.cmqsys.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<>();
        prototype.setHobbies(hobbies);
        hobbies.add("reading");
        hobbies.add("writing");

        ConcretePrototype cloneType = prototype.clone();
        cloneType.getHobbies().add("tech");

        System.out.println(prototype);
        System.out.println(cloneType);
        // false -> 地址不一样
        System.out.println(cloneType==prototype);


        System.out.println(prototype.getHobbies());
        System.out.println(cloneType.getHobbies());
        System.out.println(cloneType.getHobbies()==prototype.getHobbies());


    }
}
