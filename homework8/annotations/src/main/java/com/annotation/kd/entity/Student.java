package com.annotation.kd.entity;

import com.annotation.kd.CustomDateAnnotation;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import lombok.Data;


public class Student {
    @NotNull(message = "Student name can not be null")
    private String name;

    @AssertTrue(message = "Student must be admitted")
    private boolean isAdmitted;

    @Size(min = 2, max = 20, message = "Student's department must be of size 2 characters to 20 charaters")
    private String department;

    @CustomDateAnnotation(message = "Valid date of admission must be before today")
    private LocalDate admissionDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isAdmitted=" + isAdmitted +
                ", department='" + department + '\'' +
                ", admissionDate=" + admissionDate +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }
//    public void setName(String siddhesh_joshi) {
//    }
}
