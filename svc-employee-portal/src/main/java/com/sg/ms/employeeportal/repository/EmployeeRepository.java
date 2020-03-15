package com.sg.ms.employeeportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.ms.employeeportal.model.Employee;

/**
 * @author Admin
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
