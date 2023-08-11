package com.cmqsys.pattern.builder.simple;

public class CourseBuilder implements ICourseBuilder{

    private Course course = new Course();

    public void addName(String name) {
        course.setName(name);
    }
    public void addNote(String note) {
        course.setNote(note);
    }
    public void addPpt(String ppt) {
        course.setPpt(ppt);
    }
    public void addVideo(String video) {
        course.setVideo(video);
    }
    public void addHomework(String homework) {
        course.setHomework(homework);
    }

    @Override
    public Course builder() {
        return course;
    }
}
