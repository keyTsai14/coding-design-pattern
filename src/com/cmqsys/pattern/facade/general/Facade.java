package com.cmqsys.pattern.facade.general;

public class Facade {

    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();


    // 对外接口
    public void doA() {
        this.a.doA();
    }
    public void doB(){
        this.b.doB();
    }
    public void doC(){
        this.c.doC();
    }
}
