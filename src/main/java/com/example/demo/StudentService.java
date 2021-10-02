package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Service Layer

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(
                22,
                "Dave",
                "test@gmail.com",
                LocalDate.of(1990, Month.APRIL,
                        30)));
    }


}
