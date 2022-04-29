package com.course.CourseApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private int id;
    private String course;
    private String author;

    public Course() {
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getAuthor() {
        return author;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
