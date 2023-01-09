package net.javaguides.springbootAndThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootAndThymeleaf.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
