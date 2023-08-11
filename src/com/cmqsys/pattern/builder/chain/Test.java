package com.cmqsys.pattern.builder.chain;

public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .addName("design pattern")
                .addHomework("hw")
                .addNote("note");
        System.out.println(builder.builder());
    }
}
