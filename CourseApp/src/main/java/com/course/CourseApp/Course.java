package com.course.CourseApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Course {
    @Id
    private BigInteger id;
    private String course;
    private String author;

    public Course() {
    }

    public BigInteger getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getAuthor() {
        return author;
    }
    public void setID(BigInteger id) {
        this.id = id;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
