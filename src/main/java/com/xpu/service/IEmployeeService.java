package com.xpu.service;

import com.xpu.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployees();
    int addEmployee(Employee employee);
}
