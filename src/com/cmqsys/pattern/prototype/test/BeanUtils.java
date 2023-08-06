package com.cmqsys.pattern.prototype.test;

import java.lang.reflect.Field;

public class BeanUtils {
    /**
     * 利用反射机制
     * */
    public static Object copy(Object prototype) {
        Class clazz = prototype.getClass();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(returnValue,field.get(prototype));
            }

        } catch (Exception e) {

        }


        return returnValue;
    }
}
