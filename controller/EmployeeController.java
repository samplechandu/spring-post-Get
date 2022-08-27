package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @PostMapping
    public Employee saveEmp(@RequestBody Employee employee) {
        return employeeRepository.save(employee);

    }
    @GetMapping
    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();
    }
}
