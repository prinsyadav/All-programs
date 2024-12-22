package org.prince.employee.service;

import org.prince.employee.emp.Employee;
import org.prince.employee.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    //Method to get employee details
    public List<Employee> getEmployeeDetails() {
        return empRepo.findAll();
    }

    //Method to get employee details by id
    public List<Employee> getEmployeeDetailsById(int id) {
        return empRepo.findAllById(List.of(id));
    }

    //Method to create employee
    public String createEmployee(Employee employee) {
        empRepo.save(employee);
        return "Employee created successfully";
    }

    //Method to delete employee
    public String deleteEmployee(int id) {
        empRepo.deleteById(id);
        return "Employee deleted successfully";
    }

    //Method to update employee
    public String updateEmployee(Employee employee) {
        empRepo.save(employee);
        return "Employee updated successfully";
    }
}
