package com.vp.learning.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping(value = "/students")
    public String displayStudent() {
        System.out.println("Student display");
        return "students"; // view name
    }

}
