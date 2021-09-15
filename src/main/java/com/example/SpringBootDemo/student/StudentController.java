package com.example.SpringBootDemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new StudentImpl(
                        1L,
                        "Michael",
                        "michael.scott@dundermiflin.com",
                        LocalDate.of(1964, Month.FEBRUARY, 20),
                        Period.between(LocalDate.of(1964, Month.FEBRUARY, 20), LocalDate.now()).getYears()
                )
        );
    }
}
