package com.nayemuf.employee_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;

    @NotEmpty(message = "Name is required")
    private String name;


    @NotEmpty(message = "Email is required")
    @Email
    @Column(unique = true)
    private String email;

    @NotEmpty(message = "Department is required")
    private String department;

    @NotNull(message = "Salary is required")
    private Double salary;
}
