package com.employeemanager.service;
import com.employeemanager.model.Employee;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface EmployeeService {
     Employee addEmployee(Employee employee);
     List<Employee> findAllEmployees();
     Employee updateEmployee(Employee employee);
     void delete(Long id);
     Employee findEmployeeById(Long id);
     void deleteEmployee(Long id);
}
