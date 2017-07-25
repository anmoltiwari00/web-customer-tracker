package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	//new comment
	@RequestMapping("/list")
	public String customerlist(Model theModel){
		
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@RequestMapping("/showForm")
	public String showInputForm(Model theModel){
		
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		
		return "showInputForm";
	}
	
	//customer is the handler used to pass data....
	@RequestMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
		customerService.saveCustomers(theCustomer);
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/showFormForUpdate")
		public String prepopulateForm(@RequestParam("customerId") int theId, Model theModel){
			Customer theCustomer = customerService.getCustomer(theId);
			
			theModel.addAttribute("customer", theCustomer);
			
			return "showInputForm";
	}
	
	
		
	
	

}
