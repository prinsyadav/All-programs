package org.prince.employee.controller;

import org.prince.employee.emp.Employee;
import org.prince.employee.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    //Controller method to get employee details
    @GetMapping("/employee")
    public List<Employee> getEmployeeDetails(){
        return empService.getEmployeeDetails();
    }

    //Controller method to get employee details by id
    @GetMapping("/employee/{id}")
    public List<Employee> getEmployeeDetailsById(@PathVariable int id){
        return empService.getEmployeeDetailsById(id);
    }

    //Controller method to create employee
    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee){
        return empService.createEmployee(employee);
    }

    //Controller method to delete employee
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id){
        return empService.deleteEmployee(id);
    }

    //Method to update employee
    @PutMapping("/employee")
    public String updateEmployee(@RequestBody Employee employee){
        return empService.updateEmployee(employee);
    }
}
