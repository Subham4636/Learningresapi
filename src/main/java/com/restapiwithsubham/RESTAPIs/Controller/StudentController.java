package com.restapiwithsubham.RESTAPIs.Controller;

import com.restapiwithsubham.RESTAPIs.Dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(1966, "Subham Kumar", "subhamsbu@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentbyId(){
        return new StudentDto(1966, "Subham Kumar", "subhamsbu@gmail.com");
    }
}