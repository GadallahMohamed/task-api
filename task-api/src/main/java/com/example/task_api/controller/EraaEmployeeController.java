package com.example.task_api.controller;

import com.example.task_api.model.EraaEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.task_api.service.EraaEmployeeService;

import java.util.List;

@RestController
public class EraaEmployeeController {

    private EraaEmployeeService eraaEmployeeService;

    @Autowired
    public EraaEmployeeController(EraaEmployeeService eraaEmployeeService) {
        this.eraaEmployeeService = eraaEmployeeService;
    }
    @PostMapping("/save-employee")
    EraaEmployee addEmployee(@RequestBody  EraaEmployee eraaEmployee){
        return eraaEmployeeService.save(eraaEmployee);
    }
    @PutMapping("/update-employee")
    EraaEmployee updateEmployee(@RequestBody EraaEmployee eraaEmployee){
        return eraaEmployeeService.save(eraaEmployee);
    }
    @DeleteMapping("/delete-employee/{id}")
    boolean deleteEmployee(@PathVariable Long id){
        eraaEmployeeService.delete(id);
        return true;

    }
    @GetMapping("/employees")
    List<EraaEmployee> getAllEmployee(){
        return eraaEmployeeService.getAll();

    }
    @GetMapping("/employee/{id}")
    EraaEmployee getEmployeeById(@PathVariable Long id){
        return eraaEmployeeService.getById(id);

    }
    @PostMapping("/save-employees")
    public List<EraaEmployee> addEmployees(@RequestBody List<EraaEmployee> employees) {
        return eraaEmployeeService.saveAll(employees);
    }
    @PostMapping("/update-employees")
    public List<EraaEmployee> updateEmployees(@RequestBody List<EraaEmployee> employees) {
        return eraaEmployeeService.saveAll(employees);
    }
    @DeleteMapping("/delete-employees")
    public boolean deleteEmployees(@RequestBody List<Long> ids) {
        eraaEmployeeService.deleteAllByIds(ids);
        return true;
    }
    @PostMapping("/employees-by-ids")
    public List<EraaEmployee> getEmployeesByIds(@RequestBody List<Long> ids) {
        return eraaEmployeeService.getAllByIds(ids);
    }
    @DeleteMapping("/delete-all-employees")
    public boolean deleteAllEmployees() {
        eraaEmployeeService.deleteAll();
        return true;
    }
    @GetMapping("/search-employees")
    public List<EraaEmployee> searchEmployeesByName(@RequestParam String name) {
        return eraaEmployeeService.searchByName(name);
    }

}
