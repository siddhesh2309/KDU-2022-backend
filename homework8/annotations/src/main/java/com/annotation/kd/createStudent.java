package com.annotation.kd;

import com.annotation.kd.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import javax.validation.Validation;
import javax.validation.Validator;
import java.time.LocalDate;

@Configuration
public class createStudent {
    @Bean
    @Scope("prototype")
    public Student createNewStudent() {
        Student student = new Student();
        student.setName("Siddhesh Joshi");
        student.setDepartment("CSE");
        student.setAdmitted(true);
        student.setAdmissionDate(LocalDate.parse("2020-01-01"));

        return student;
    }

    @Bean
    public Validator createValidator() {
        return Validation.buildDefaultValidatorFactory().getValidator();
    }
}
