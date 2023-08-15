package com.cmqsys.pattern.proxy.dynamicproxy.cglibproxy;

public class Test {

    public static void main(String[] args) {
        Son son = (Son) new CglibRedMother().getInstance(Son.class);
        son.findLove();
        son.buyInsure();
    }
}
