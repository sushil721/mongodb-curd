package com.paxcel.mail.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.paxcel.mail.model.Employee;

public interface Employeeservice {
	
	 public void addEmployee(Employee emp);
	 public void createEmployee(List<Employee> emp);
	 public Collection<Employee> getAllEmployees();
	 public Optional<Employee> findEmployeeById(int id);
	 public void deleteEmployeeById(int id);
	 public void updateEmployee(Employee emp);
	 public void deleteAllEmployees();
	 

}
