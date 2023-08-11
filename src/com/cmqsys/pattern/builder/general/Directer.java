package com.cmqsys.pattern.builder.general;

public class Directer {

    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        System.out.println(builder.build());

    }
}
