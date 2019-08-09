package com.paxcel.mail.daoInterface;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paxcel.mail.model.Employee;
 
 
@Repository
public interface EmployeeDao extends MongoRepository<Employee, String> {
 
	
}
