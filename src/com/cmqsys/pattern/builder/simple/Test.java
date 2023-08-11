package com.cmqsys.pattern.builder.simple;

public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addName("design pattern");
        builder.addHomework("hw");
        builder.addNote("note");
        System.out.println(builder.builder());
    }
}
