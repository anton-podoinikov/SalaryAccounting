package com.example.salaryaccounting.service;

import com.example.salaryaccounting.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Optional<Object> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Long id, Employee employeeDetails) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
