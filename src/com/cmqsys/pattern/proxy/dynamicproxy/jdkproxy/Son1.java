package com.cmqsys.pattern.proxy.dynamicproxy.jdkproxy;

public class Son1 implements IPerson {
    @Override
    public void findLove() {
        System.out.println("son1 request:黑穷丑");
    }

    @Override
    public void buyInsure() {
        System.out.println("保险2000w");
    }
}
