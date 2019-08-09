package com.paxcel.mail.serviceImpl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paxcel.mail.daoInterface.EmployeeDao;
import com.paxcel.mail.model.Employee;
import com.paxcel.mail.service.Employeeservice;

@Service
public class Employeeserviceimpl implements Employeeservice {
 
    // The dao repository will use the Mongodb-Repository to perform the database operations.
    @Autowired
    EmployeeDao dao;
 
    @Override
    public void createEmployee(List<Employee> emp) {
//        dao.saveAll(emp);
    }
 
    @Override
    public Collection<Employee> getAllEmployees() {
        return dao.findAll();
    }
 
    @Override
    public Optional<Employee> findEmployeeById(int id) {
        return null;//dao.findById(id);
    }
 
    @Override
    public void deleteEmployeeById(int id) {
//        dao.deleteById(id);
    }
 
    @Override
    public void updateEmployee(Employee emp) {
        dao.save(emp);
    }
 
 
    @Override
    public void deleteAllEmployees() {
        dao.deleteAll();
    }

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.save(emp);
	}
    
}