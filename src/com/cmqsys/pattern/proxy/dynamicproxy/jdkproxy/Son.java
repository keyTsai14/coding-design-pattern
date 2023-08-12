package com.cmqsys.pattern.proxy.dynamicproxy.jdkproxy;

public class Son implements IPerson {
    @Override
    public void findLove() {
        System.out.println("son request:白富美");
    }

    @Override
    public void buyInsure() {
        System.out.println("保险1000w");
    }
}
