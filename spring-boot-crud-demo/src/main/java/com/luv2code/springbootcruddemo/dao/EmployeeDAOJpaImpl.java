package com.luv2code.springbootcruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springbootcruddemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = entityManager.createQuery("from Employee").getResultList();
		return employees;
	}

	@Override
	public Employee findById(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	@Override
	public void save(Employee employee) {
		entityManager.merge(employee);
	}

	@Override
	public void deleteById(int theId) {
		Query query = entityManager.createQuery("delete from Employee where id=:employeeId ");
		query.setParameter("employeeId", theId).executeUpdate();
	}

}
