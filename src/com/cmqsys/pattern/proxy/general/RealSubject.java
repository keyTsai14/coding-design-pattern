package com.cmqsys.pattern.proxy.general;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
