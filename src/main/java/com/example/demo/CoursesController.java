package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {
    @RequestMapping("/courses")
    public List<Course> retrieveCourses(){
        return Arrays.asList(new Course(1,"Learn AWS","Linkedin Learning"),new Course(2,"Learn Java","Great Learning"));
    }
}
