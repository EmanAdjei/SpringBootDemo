package com.example.SpringBootDemo.student;

import java.time.LocalDate;

public interface Student {
    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    LocalDate getDob();

    void setDob(LocalDate dob);

    Integer getAge();

    void setAge(Integer age);

    @Override
    String toString();
}
