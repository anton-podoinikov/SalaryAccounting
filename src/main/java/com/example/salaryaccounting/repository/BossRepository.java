package com.example.salaryaccounting.repository;

import com.example.salaryaccounting.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BossRepository extends JpaRepository<Manager, Long> {
    @Override
    <S extends Manager> S save(S entity);
}
