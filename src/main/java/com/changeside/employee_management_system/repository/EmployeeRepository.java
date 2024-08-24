package com.changeside.employee_management_system.repository;

import com.changeside.employee_management_system.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
    Optional<Employee> findById(String id);
}
