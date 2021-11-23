package com.training.practice.controller;

import com.training.practice.entity.Employee;
import com.training.practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    List<Employee> empList = new ArrayList<>();

    // CREATE
    @RequestMapping(value = "/addEmp", method = RequestMethod.POST)
    public String addEmp(@RequestBody Employee emp){
        employeeService.addEmp(emp);
        return "Employee added successfully";
    }

    //READ
    @RequestMapping(value = "/getEmp", method = RequestMethod.GET)
    public List<Employee> getEmp(){

        return employeeService.getAllEmp();
    }

    //UPDATE
    @RequestMapping(value = "/updateEmp/{id}", method = RequestMethod.PUT)
    public String updateEmp(@PathVariable long id,@RequestBody Employee emp){
        Employee employee = employeeService.getEmpById(id);
        employee.setName(emp.getName());
        employee.setAddress(emp.getAddress());
        employeeService.addEmp(employee);
        return "object updated successfully";
    }

    //UPDATE
    @RequestMapping(value = "/deleteEmp/{id}", method = RequestMethod.DELETE)
    public String deleteEmp(@PathVariable long id){
        employeeService.delEmp(id);
        return "object Deleted successfully";
    }
}
