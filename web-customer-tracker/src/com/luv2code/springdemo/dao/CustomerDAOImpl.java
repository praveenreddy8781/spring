package com.luv2code.springdemo.dao;

import java.util.List;

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
	public List<Customer> getCustomers() {

//		get the current hibernate session
		Session session = sessionFactory.getCurrentSession();

//		create a query
		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);

//		execute the query and get result list
		List<Customer> customers = query.getResultList();

//		return the results
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
//		get the hibernate session
		Session session = sessionFactory.getCurrentSession();

//		save/update the customer object
		session.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(int id) {

		Session session = sessionFactory.getCurrentSession();

		Customer customer = session.get(Customer.class, id);

		return customer;
	}

	@Override
	public void deleteCustomer(int id) {

		Session session = sessionFactory.getCurrentSession();

		session.createQuery("delete from Customer where id=:customerId").setParameter("customerId", id).executeUpdate();
	}

	@Override
	public List<Customer> searchCustomers(String searchName) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery = null;

		//
		// only search by name if theSearchName is not empty
		//
		if (searchName != null && searchName.trim().length() > 0) {

			// search for firstName or lastName ... case insensitive
			theQuery = currentSession.createQuery(
					"from Customer where lower(firstName) like :theName or lower(lastName) like :theName",
					Customer.class);
			theQuery.setParameter("theName", "%" + searchName.toLowerCase() + "%");

		} else {
			// theSearchName is empty ... so just get all customers
			theQuery = currentSession.createQuery("from Customer", Customer.class);
		}

		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

}
