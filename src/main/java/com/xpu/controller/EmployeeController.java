package com.xpu.controller;

import com.xpu.model.Employee;
import com.xpu.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Employee> employeeList(){
        List<Employee> result =  employeeService.getEmployees();
        return result;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int addEmployee(Employee employee){
        employee.setBirthday(new Date());
        return employeeService.addEmployee(employee);
    }

}
