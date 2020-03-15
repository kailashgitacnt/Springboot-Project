package com.sg.ms.employeeportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sg.ms.employeeportal.model.Employee;
import com.sg.ms.employeeportal.repository.EmployeeRepository;
import com.sg.ms.employeeportal.validator.EmployeeValidator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Employee Portal Service")
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@Autowired
	EmployeeValidator validator;

	@ApiOperation(value = "Add an employee")
	@PostMapping("/addEmployee")
	Employee addNewEmployee(@RequestBody Employee employee) {
		if (validator.validateEmployee(employee))
			return repository.save(employee);
		else
			System.out.println("Input Validation failed! ");
		return null;
	}

	@ApiOperation(value = "View a list of available employees", response = List.class)
	@GetMapping("/getEmployees")
	List<Employee> getEmployeeList() {
		return repository.findAll();
	}
}
