package com.cmqsys.pattern.proxy.staticproxy;

public class Son implements IPerson {
    @Override
    public void findLove() {
        System.out.println("request:白富美");
    }
}
