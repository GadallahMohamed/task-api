package com.example.task_api.service;

import com.example.task_api.model.EraaEmployee;

import java.util.List;

public interface EraaEmployeeService {
    EraaEmployee save(EraaEmployee eraaEmployee);
    EraaEmployee update(EraaEmployee eraaEmployee);
    boolean delete(Long id);
    List<EraaEmployee> getAll();
    EraaEmployee getById(Long id);
    List<EraaEmployee> saveAll(List<EraaEmployee> employees);
    List<EraaEmployee> updateAll(List<EraaEmployee> employees);
    void deleteAllByIds(List<Long> ids);
    List<EraaEmployee> getAllByIds(List<Long> ids);
    void deleteAll();
    List<EraaEmployee> searchByName(String namePrefix);

}
