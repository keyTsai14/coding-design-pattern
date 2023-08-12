package com.cmqsys.pattern.proxy.staticproxy;

public class Father implements IPerson {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("help son to find his lover");
        son.findLove();
        System.out.println("son and daughter in law in love");
    }
}
