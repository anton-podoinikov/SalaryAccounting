package com.example.salaryaccounting.service;


import com.example.salaryaccounting.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {



    List<Employee> findAll();

    Optional<Object> findById(Long id);

    Employee save(Employee employee);

    Employee update(Long id, Employee employeeDetails);

    void delete(Long id);
}
