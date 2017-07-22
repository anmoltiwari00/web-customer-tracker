package com.luv2code.springdemo.customerDAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOimpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = session.createQuery("from Customer",Customer.class);
		
		List<Customer> theCustomers = theQuery.getResultList();
		
		return theCustomers;
		
	}

	@Override
	public void saveCustomers(Customer theCustomer) {
		
		Session session1 = sessionFactory.getCurrentSession();
		
		session1.save(theCustomer);
		
	}

}
