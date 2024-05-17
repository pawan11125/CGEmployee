package com.pawan.CGEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pawan.CGEmployee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
