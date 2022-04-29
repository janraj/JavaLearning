package com.course.CourseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @RequestMapping("/courses")
    public List<Course> get(){
        return courseRepository.findAll();
    }

    @RequestMapping("/courses/{id}")
    public Course getByID(@PathVariable("id") BigInteger id){
        return courseRepository.getOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void post(@RequestBody  Course course){
        courseRepository.save(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void delete(@PathVariable("id") BigInteger id){
        courseRepository.deleteById(id);
    }
}
