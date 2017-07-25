package com.luv2code.springdemo.customerDAO;

import java.util.List;


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
		
		Query<Customer> theQuery = session.createQuery("from Customer order by lastName",Customer.class);
		
		List<Customer> theCustomers = theQuery.getResultList();
		
		return theCustomers;
		
	}

	@Override
	public void saveCustomers(Customer theCustomer) {
		
		Session session1 = sessionFactory.getCurrentSession();
		
		session1.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		Session session2 = sessionFactory.getCurrentSession();
		
		Customer theCustomer = session2.get(Customer.class, theId);
		
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session session3 = sessionFactory.getCurrentSession();
		
		Query query = session3.createQuery("delete from Customer where id = "+theId);
		
		query.executeUpdate();
	}

	
}
