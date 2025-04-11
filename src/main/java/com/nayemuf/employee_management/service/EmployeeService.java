package com.nayemuf.employee_management.service;

import com.nayemuf.employee_management.entity.Employee;
import com.nayemuf.employee_management.exception.ResourceNotFoundException;
import com.nayemuf.employee_management.repository.EmployeeRepository;
import com.nayemuf.employee_management.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        // Fetch employee by ID
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));
    }



    public Employee updateEmployee(int id, Employee updatedEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setDepartment(updatedEmployee.getDepartment());
            employee.setSalary(updatedEmployee.getSalary());
            return employeeRepository.save(employee);
        }).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
    }

    public ApiResponse<String> deleteEmployeeById(int id){

        if (!employeeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found with ID: " + id);
        }

        employeeRepository.deleteById(id);
        return new ApiResponse<String>(true, "Employee successfully deleted", null);
    }
}
