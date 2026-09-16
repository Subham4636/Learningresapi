package com.restapiwithsubham.RESTAPIs.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private int enrollNumber;
    private String name;
    private String email;
}
