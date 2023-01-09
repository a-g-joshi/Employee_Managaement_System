package net.javaguides.springbootAndThymeleaf.service;

import java.util.List;

import net.javaguides.springbootAndThymeleaf.model.Employee;

public interface EmployeeService {
List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployeeById(long id);
}
