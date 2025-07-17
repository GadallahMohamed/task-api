package com.example.task_api.service.impl;

import com.example.task_api.model.EraaEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.task_api.repo.EraaEmployeeRepo;
import com.example.task_api.service.EraaEmployeeService;

import java.util.List;

@Service
public class EraaEmployeeServiceImpl implements EraaEmployeeService {

    private EraaEmployeeRepo eraaEmployeeRepo;

    @Autowired
    public EraaEmployeeServiceImpl(EraaEmployeeRepo eraaEmployeeRepo) {
        this.eraaEmployeeRepo = eraaEmployeeRepo;
    }

    @Override
    public EraaEmployee save(EraaEmployee eraaEmployee) {
        return eraaEmployeeRepo.save(eraaEmployee);
    }

    @Override
    public EraaEmployee update(EraaEmployee eraaEmployee) {
        return eraaEmployeeRepo.save(eraaEmployee);
    }

    @Override
    public boolean delete(Long id) {
        eraaEmployeeRepo.deleteById(id);
        return true;

    }

    @Override
    public List<EraaEmployee> getAll() {
        return eraaEmployeeRepo.findAll();
    }

    @Override
    public EraaEmployee getById(Long id) {
        return eraaEmployeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee with ID " + id + " not found."));
    }

    @Override
    public List<EraaEmployee> saveAll(List<EraaEmployee> employees) {
        return eraaEmployeeRepo.saveAll(employees);
    }

    @Override
    public List<EraaEmployee> updateAll(List<EraaEmployee> employees) {
        return eraaEmployeeRepo.saveAll(employees);
    }

    @Override
    public void deleteAllByIds(List<Long> ids) {
        eraaEmployeeRepo.deleteAllById(ids);

    }

    @Override
    public List<EraaEmployee> getAllByIds(List<Long> ids) {
        return eraaEmployeeRepo.findAllById(ids);
    }

    @Override
    public void deleteAll() {
        eraaEmployeeRepo.deleteAll();
    }

    @Override
    public List<EraaEmployee> searchByName(String namePrefix) {
        return eraaEmployeeRepo.findByNameStartingWithIgnoreCase(namePrefix);
    }
}
