package com.restapiwithsubham.RESTAPIs.Service.impl;

import com.restapiwithsubham.RESTAPIs.Dto.AddStudentRequestDto;
import com.restapiwithsubham.RESTAPIs.Dto.StudentDto;
import com.restapiwithsubham.RESTAPIs.Entity.Student;
import com.restapiwithsubham.RESTAPIs.Repository.StudentRepository;
import com.restapiwithsubham.RESTAPIs.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students
                .stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .toList();
    }

    @Override
    public StudentDto getStudentsById(Long id) {
        Student student=  studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not find with id : " + id));
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        return null;
    }
}
