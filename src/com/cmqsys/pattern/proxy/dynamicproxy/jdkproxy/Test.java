package com.cmqsys.pattern.proxy.dynamicproxy.jdkproxy;

import com.cmqsys.pattern.proxy.dynamicproxy.jdkproxy.IPerson;

public class Test {

    public static void main(String[] args) {
        JdkRedMother jdkRedMother = new JdkRedMother();
        IPerson son = jdkRedMother.getInstance(new Son());
        son.findLove();

        IPerson son1 = jdkRedMother.getInstance(new Son1());
        son1.findLove();
        son1.buyInsure();
    }
}
