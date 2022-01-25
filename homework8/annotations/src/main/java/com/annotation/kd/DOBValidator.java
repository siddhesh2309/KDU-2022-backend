package com.annotation.kd;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DOBValidator implements ConstraintValidator<CustomDateAnnotation, LocalDate> {
    @Override
    public void initialize(CustomDateAnnotation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        return !localDate.isAfter(LocalDate.now());
    }

//    @Override
//    public boolean isValid(LocalDate admissionDate, ConstraintValidatorContext constraintValidatorContext) {
//
//    }
}