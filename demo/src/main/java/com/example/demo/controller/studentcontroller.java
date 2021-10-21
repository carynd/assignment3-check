package com.example.demo.controller;

import com.example.demo.entity.passport;
import com.example.demo.entity.student;
import com.example.demo.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class studentcontroller {

    @Autowired
    studentservice studentService;


    @GetMapping("/students")
    public List<student> getAllStudents(){
        List<student> bookInfo = studentService.getAllStudents();
        return bookInfo;
    }

}
