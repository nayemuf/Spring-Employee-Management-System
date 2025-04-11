package com.nayemuf.employee_management.controller;

import com.nayemuf.employee_management.entity.Employee;
import com.nayemuf.employee_management.service.EmployeeService;
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
    public List<Employee> getEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @PostMapping("/")
    public Employee createNewEmployee(@RequestBody Employee employee){
        return service.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        return service.deleteEmployeeById(id);
    }


}
