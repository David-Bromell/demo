package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table

public class Student {

    @Id
    @SequenceGenerator
            (name ="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
             )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_seqeunce"
    )

    private long id;
    private Integer age;
    private String Name, email;
    private LocalDate dob;

    public Student() {

    }

    public Student(Integer age, String name, String email, LocalDate dob) {
        this.age = age;
        this.Name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student(long id, Integer age, String name, String email, LocalDate dob) {
        this.id = id;
        this.age = age;
        this.Name = name;
        this.email = email;
        this.dob = dob;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
