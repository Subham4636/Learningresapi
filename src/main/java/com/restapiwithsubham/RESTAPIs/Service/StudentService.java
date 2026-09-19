package com.restapiwithsubham.RESTAPIs.Service;

import com.restapiwithsubham.RESTAPIs.Dto.AddStudentRequestDto;
import com.restapiwithsubham.RESTAPIs.Dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentsById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(long id);
}
