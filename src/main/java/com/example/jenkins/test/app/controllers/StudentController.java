package com.example.jenkins.test.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public List<String> getStudent()
    {
        List<String> lst = new ArrayList<>();
        lst.add("Deepanshu");
        lst.add("Aryan");
        return lst;
    }
}
