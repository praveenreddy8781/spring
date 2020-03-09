package com.luv2code.springbootcruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springbootcruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernarteImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOHibernarteImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}

	@Override
	public List<Employee> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int employeeId) {
		Session session = entityManager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, employeeId);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
	}

	@Override
	public void deleteById(int theId) {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("delete from Employee where id=:employeeId ");
		query.setParameter("employeeId", theId).executeUpdate();
	}
}
