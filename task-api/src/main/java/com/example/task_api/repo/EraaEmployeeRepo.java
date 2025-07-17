package com.example.task_api.repo;

import com.example.task_api.model.EraaEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EraaEmployeeRepo extends JpaRepository<EraaEmployee, Long> {
    List<EraaEmployee> findByNameStartingWithIgnoreCase(String namePrefix);
}
