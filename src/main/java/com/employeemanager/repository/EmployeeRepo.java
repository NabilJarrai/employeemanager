package com.employeemanager.repository;

import com.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);
    Employee findEmployeeById(Long id);
}
