package com.nayemuf.employee_management.controller;

import com.nayemuf.employee_management.entity.Employee;
import com.nayemuf.employee_management.response.ApiResponse;
import com.nayemuf.employee_management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public ApiResponse<List<Employee>> getEmployees(){
        return new ApiResponse<>(true, "Employee list retrieve successfully", service.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ApiResponse<Employee> getEmployeeById(@PathVariable int id){
        return new ApiResponse<>(true,"Employee retrieve successfully", service.getEmployeeById(id));
    }

    @PostMapping("/")
    public ApiResponse<Employee> createNewEmployee(@RequestBody Employee employee){
        return new ApiResponse<>(true, "Employee created successfully", service.createEmployee(employee));
    }

    @PutMapping("/{id}")
    public ApiResponse<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return new ApiResponse<>( true,  "Employee updated successfully", service.updateEmployee(id, employee));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteEmployee(@PathVariable int id){
        return service.deleteEmployeeById(id);
    }


}
