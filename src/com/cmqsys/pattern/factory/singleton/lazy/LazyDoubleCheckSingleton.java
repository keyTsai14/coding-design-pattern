package com.cmqsys.pattern.factory.singleton.lazy;

public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance==null) {
            // 是否需要阻塞
            synchronized(LazyDoubleCheckSingleton.class) {
                if (instance==null) {
                    // 是否需要重新创建实例
                    instance = new LazyDoubleCheckSingleton();
                    // 指令重排序的问题 --》 volatile 关键处理
                }
            }
        }
        return instance;
    }

}
