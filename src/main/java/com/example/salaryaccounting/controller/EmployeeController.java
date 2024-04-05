package com.example.salaryaccounting.controller;

import com.example.salaryaccounting.exception.ResourceNotFoundException;
import com.example.salaryaccounting.model.Employee;
import com.example.salaryaccounting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.findAll();
        return ResponseEntity.ok().body(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = (Employee) employeeService.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee not fount with id" + id));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.save(employee);
        return ResponseEntity.ok().body(newEmployee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id
            ,@RequestBody Employee employeeDetails) {
        Employee updateEmployee = employeeService.update(id, employeeDetails);
        return ResponseEntity.ok().body(updateEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok().build();
    }

}
