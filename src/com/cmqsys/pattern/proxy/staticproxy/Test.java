package com.cmqsys.pattern.proxy.staticproxy;

public class Test {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
