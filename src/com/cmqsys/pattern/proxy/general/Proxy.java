package com.cmqsys.pattern.proxy.general;

public class Proxy implements ISubject{

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    public void before() {
        System.out.println("called before request()");
    }

    public void after() {
        System.out.println("called after request()");
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }
}
