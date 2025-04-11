package com.nayemuf.employee_management.repository;

import com.nayemuf.employee_management.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
