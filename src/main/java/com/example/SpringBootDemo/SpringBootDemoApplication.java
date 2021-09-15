package com.example.SpringBootDemo;

import com.example.SpringBootDemo.student.Student;
import com.example.SpringBootDemo.student.StudentImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@GetMapping
	public List<Student> studentList() {
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
