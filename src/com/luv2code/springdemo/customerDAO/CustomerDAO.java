package com.luv2code.springdemo.customerDAO;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomers(Customer theCustomer);
}
