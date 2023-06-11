package com.cmqsys.pattern.factory.singleton.serial;

import java.io.Serializable;

public class SerialSingleton implements Serializable {


    /**
     * 序列化
     * 把内存中对象的状态转换为字节码的形式
     * 把字节码通过IO输出流，写到磁盘上
     * 永久保存下来，持久化
     *
     * 反序列化的
     * 将持久化的字节码内容，通过IO输入流读到内存中来
     * 转化成一个Java对象
     * */
    private static final SerialSingleton INSTANCE = new SerialSingleton();

    private SerialSingleton() {}

    public static SerialSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        // 桥接设计模式
        return INSTANCE;
    }
}
