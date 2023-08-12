package com.cmqsys.pattern.proxy.dynamicproxy.jdkproxy;

import com.cmqsys.pattern.proxy.dynamicproxy.jdkproxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkRedMother implements InvocationHandler {

    private IPerson target;
    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("jdk RedMother called before request()");
    }

    public void after() {
        System.out.println("called after request()");
    }
}
