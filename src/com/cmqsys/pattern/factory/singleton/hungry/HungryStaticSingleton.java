package com.cmqsys.pattern.factory.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
