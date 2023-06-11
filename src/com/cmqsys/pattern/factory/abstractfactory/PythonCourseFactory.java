package com.cmqsys.pattern.factory.abstractfactory;

public class PythonCourseFactory extends CourseFactory{
    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        return new PythonVideo();
    }
}
