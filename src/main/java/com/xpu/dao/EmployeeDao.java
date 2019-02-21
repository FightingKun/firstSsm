package com.xpu.dao;

import com.xpu.model.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getEmployees();
    int addEmployee(Employee emp);
}
