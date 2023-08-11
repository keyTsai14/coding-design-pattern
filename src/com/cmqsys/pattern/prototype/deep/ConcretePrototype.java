package com.cmqsys.pattern.prototype.deep;

import lombok.Data;

import java.io.*;
import java.util.List;
@Data
public class ConcretePrototype implements Cloneable,Serializable {

    // 让其属性每个对象都重新创建 -》 克隆list的时候不是单单复制其地址 -》 list内容的各个属性都将会被克隆
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public ConcretePrototype deepClone() {
        // 通过序列化跟反序列化进行克隆和复制
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (ConcretePrototype) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
