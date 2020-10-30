package com.bai.service;

import com.bai.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public List<Employee> getAll();
}
