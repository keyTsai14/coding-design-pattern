package com.cmqsys.pattern.factory.factorymethod;

public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
