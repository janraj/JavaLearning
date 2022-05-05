package com.coursecatalog.CourseCatalog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CatalogController {
    private String msg = "";
    private String courseAppURL = "http://localhost:8080/";
    @RequestMapping("/")
    public String get(){
        RestTemplate restTemplate = new RestTemplate();
        msg = restTemplate.getForObject(courseAppURL, String.class);
        return ("Course APP Home Page" + msg);
    }


    @RequestMapping("/catalog")
    public String getCourses(){
        RestTemplate restTemplate = new RestTemplate();
        courseAppURL = courseAppURL + "courses";
        msg = restTemplate.getForObject(courseAppURL, String.class);
        return ("Course Catalog are" + msg);
    }
}
