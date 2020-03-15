package com.sg.ms.employeeportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@ApiModel(description = "All details about the Employee. ")
public class Employee {

	 public Employee() {
	 }
	 public Employee(String firstName, String lastName, String gender, String dateOfBirth, String department) {
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.gender = gender;
	  this.dateOfBirth = dateOfBirth;
	  this.department = department;
	 }

	
	@Id @GeneratedValue@ApiModelProperty(notes = "The database generated employee ID")
	private Long id;
	@NonNull@ApiModelProperty(notes = "The employee first name", required = true)
	private String firstName;
	@NonNull@ApiModelProperty(notes = "The employee last name", required = true)
	private String lastName;
	@NonNull@ApiModelProperty(notes = "The employee gender", required = true)
	private String gender;
	@NonNull@ApiModelProperty(notes = "The employee dateOfBirth", required = true)
	private String dateOfBirth;
	@NonNull@ApiModelProperty(notes = "The employee department", required = true)
	private String department;
	
}
