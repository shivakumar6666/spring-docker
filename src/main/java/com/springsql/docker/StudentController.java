package com.springsql.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(value ="/student")
    public Student createStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }
    @GetMapping(value ="/student/{id}")
    public Student getStudent(@PathVariable Integer id) {
        Student student=studentRepository.findById(id).get();
        return student;
    }

    @GetMapping(value ="/student")
    public List<Student> getStudentList() {
   List<Student> studentList=studentRepository.findAll();
   return studentList;
    }
}
