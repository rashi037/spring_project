package com.ioc.demo.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeHandler {

    private EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> Employee(){
        employeeService = new EmployeeService();
        return employeeService.getAllEmployees();
    }


}
