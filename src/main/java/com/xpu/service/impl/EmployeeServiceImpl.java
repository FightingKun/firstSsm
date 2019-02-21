package com.xpu.service.impl;

import com.xpu.dao.EmployeeDao;
import com.xpu.model.Employee;
import com.xpu.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    protected EmployeeDao employeeDao;

    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    public int addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }
}
