package com.cmqsys.pattern.factory.abstractfactory;

public abstract class CourseFactory {

    public void init() {
        System.out.println("初始化");
    }

    protected abstract INote createNote();
    protected abstract IVideo createVideo();
}
