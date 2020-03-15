package com.sg.ms.employeeportal.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import com.sg.ms.employeeportal.model.Employee;

@Component
public class EmployeeValidator {

	
	public boolean validateEmployee(Employee employee) {
		if(null != employee){
			if(StringUtils.isEmpty(employee.getFirstName())){
				System.out.println("Invalid First Name");
				return false;
			}
			if(StringUtils.isEmpty(employee.getLastName())){
				System.out.println("Invalid Last Name");
				return false;
			}
			if(StringUtils.isEmpty(employee.getGender())){
				System.out.println("Invalid gender");
				return false;
			}
			if(StringUtils.isEmpty(employee.getDateOfBirth())){
				System.out.println("Invalid Dob");
				return false;
			}
			if(StringUtils.isEmpty(employee.getDepartment())){
				System.out.println("Invalid department");
				return false;
			}
		}else{
			return false;
		}
		return true;
	}
}
