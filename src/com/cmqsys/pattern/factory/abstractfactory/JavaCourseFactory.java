package com.cmqsys.pattern.factory.abstractfactory;

public class JavaCourseFactory extends CourseFactory{
    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        return new JavaVideo();
    }
}
