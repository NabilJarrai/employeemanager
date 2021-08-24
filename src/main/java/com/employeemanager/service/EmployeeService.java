package com.employeemanager.service;
import com.employeemanager.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public List<Employee> findAllEmployees();
    public Employee updateEmployee(Employee employee);
    public void delete(Long id);
    public Employee findEmployeeById(Long id);
    public void deleteEmployee(Long id);
}
