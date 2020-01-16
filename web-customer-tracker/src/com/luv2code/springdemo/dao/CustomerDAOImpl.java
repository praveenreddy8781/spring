package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

//	need to inject the session factory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
//		get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
//		create a query
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		
//		execute the query and get result list
		List<Customer> customers = query.getResultList();
		
//		return the results
		return customers;
	}

}
