package com.example.aop.springaop.service;

import com.example.aop.springaop.service.model.Employee;
import com.example.aop.springaop.service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService  {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findById(Integer id){
        return employeeRepository.findById(id).orElseThrow();
    }
}
