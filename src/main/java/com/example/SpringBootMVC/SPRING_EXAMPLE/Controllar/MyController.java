package com.example.SpringBootMVC.SPRING_EXAMPLE.Controllar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @GetMapping("/home")
    public String home(){
        return "Welcome to Spring boot";
    }
    @GetMapping("/courses")
    public List<Course> getCourses() {

    }
}
