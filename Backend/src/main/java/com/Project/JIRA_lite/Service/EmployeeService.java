package com.Project.JIRA_lite.Service;

import com.Project.JIRA_lite.Entity.Employee;
import com.Project.JIRA_lite.Repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepo employeeRepo;

    EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> createEmployee(Employee employee) {
        this.employeeRepo.save(employee);
        return this.employeeRepo.findAll();
    }

    public List<Employee> getEmployees() {
        return this.employeeRepo.findAll();
    }
}
