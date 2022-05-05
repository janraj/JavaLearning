package com.employee.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppService {
    @RequestMapping("/")
    public String index(){
        return "Hello Index File";
    }
}
