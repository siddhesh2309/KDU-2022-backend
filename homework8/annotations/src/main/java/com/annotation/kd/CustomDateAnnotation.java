package com.annotation.kd;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DOBValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface CustomDateAnnotation {
    String message() default "Invalid DOB entered";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
