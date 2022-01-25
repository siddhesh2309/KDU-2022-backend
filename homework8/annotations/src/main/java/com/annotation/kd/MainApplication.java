package com.annotation.kd;

import com.annotation.kd.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(createStudent.class);
        Validator validator = context.getBean("createValidator", Validator.class);

        Student student = context.getBean("createNewStudent", Student.class);
        System.out.println(student);
        Set<ConstraintViolation<Student>> violations = validator.validate(student);

        for (ConstraintViolation<Student> violation : violations) {
            System.err.println(violation.getMessage());
        }
    }

}
