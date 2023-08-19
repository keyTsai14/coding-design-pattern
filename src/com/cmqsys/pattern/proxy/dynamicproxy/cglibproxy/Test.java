package com.cmqsys.pattern.proxy.dynamicproxy.cglibproxy;

public class Test {

    public static void main(String[] args) {

        /**
         * Cglib 继承的方式，覆盖父类的方法
         * JDK 采用的实现的方式，必须要求代理的目标对象一定要实现一个接口
         * 思想： 都是通过生成字节码，重组成一个新的类
         *
         * JDK Proxy 对于用户而言，依赖性更强，调佣更加复杂
         * Cglib 对目标类没有任何的要求
         *
         * Cglib 效率高，性能更高，底层没有用到反射
         * JDK 逻辑相对简单，但是执行效率低，每次都要用的反射
         *
         * Cglib 有个坑，目标代理类不能用final的方法，final修饰的方法会被忽略
         *
         * */

        Son son = (Son) new CglibRedMother().getInstance(Son.class);
        son.findLove();
        son.buyInsure();
    }
}
