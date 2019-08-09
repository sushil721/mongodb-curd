package com.paxcel.mail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paxcel.mail.model.Customer;
import com.paxcel.mail.model.Employee;
import com.paxcel.mail.service.CustomerService;
import com.paxcel.mail.service.Employeeservice;

@Controller
public class MvcController {
	
	private static Logger log = LoggerFactory.getLogger(MvcController.class);
	
	@Autowired
	private Employeeservice service;
	
	@Autowired
	private CustomerService customerService;
	
	  @GetMapping("/employee") 
	  public String emailTemplateEbillDesign( Model model) {
	  log.info("In the Employee controller");
	  Employee employee = new Employee();
	  
	  model.addAttribute("employee", employee);
	  return "/employee"; 
	  
	  }
	 
	
	 @PostMapping("/addEmployee")
	 public String emailTemplateEbillDesign(@ModelAttribute("employee") Employee employee,Model model) {
		 log.info("In add Employee");
		 service.addEmployee(employee);
		 return "redirect:employee";
	 }
	 
	 
	 @GetMapping("/customer") 
	  public String customer( Model model) {
	  log.info("In the Customer controller");
	  Customer customer = new Customer();
	  model.addAttribute("customer", customer);
	  return "/customer"; 
	  
	  }
	 
	
	 @PostMapping("/addCustomer")
	 public String customerAdd(@ModelAttribute("customer") Customer customer,Model model) {
		 log.info("In add Customer");
		 customerService.addCustomer(customer);
		 return "redirect:customer";
	 }
	 

}
