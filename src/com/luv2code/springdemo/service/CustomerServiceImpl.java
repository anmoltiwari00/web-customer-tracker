package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.customerDAO.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	public List<Customer> getCustomers() {
		List<Customer> theCustomers = customerDAO.getCustomers();
		return theCustomers;
	}

	@Transactional
	public void saveCustomers(Customer theCustomer) {
		customerDAO.saveCustomers(theCustomer);
	}
	
}
