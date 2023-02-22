package com.ioc.demo.Employee;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees(){
        return (List<Employee>) Arrays.asList(
                new Employee(1, "Rashicka", "Verma"),
                new Employee(2, "Divyanshi", "Bajpai")
        );
    }
}
