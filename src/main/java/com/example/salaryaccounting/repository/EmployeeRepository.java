package com.example.salaryaccounting.repository;

import com.example.salaryaccounting.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Override
    <S extends Employee> S save(S entity);
}
