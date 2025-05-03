package com.Project.JIRA_lite.Controllers;

import com.Project.JIRA_lite.Entity.Employee;
import com.Project.JIRA_lite.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.employeeService.getEmployees();
    }

    @PostMapping("/employee")
    public List<Employee> createEmployee(@RequestBody Employee ticket) {
//        List<Employee> tickets = this.employeeService.createEmployee(ticket);
        return this.employeeService.createEmployee(ticket);
    }

}
