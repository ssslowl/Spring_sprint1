package com.bitlab.sprinttask.controller;


import com.bitlab.sprinttask.entity.Student;
import com.bitlab.sprinttask.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    StudentService studentService = new StudentService();

    @GetMapping("/")
    public String home(Model model){
        List<Student> students = studentService.getSortedStudents();

        model.addAttribute("students", students);

        return "home";
    }

    @GetMapping("/AddStudent")
    public String addStudent_get(Model model){

        return "addStudent";
    }

    @PostMapping("/AddStudent")
    public String addStudent_post(Student student){
        studentService.addStudent(student);


        return ("redirect:/");
    }
}
