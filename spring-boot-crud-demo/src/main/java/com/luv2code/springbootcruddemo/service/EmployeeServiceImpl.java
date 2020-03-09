package com.luv2code.springbootcruddemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.luv2code.springbootcruddemo.dao.EmployeeDAO;
import com.luv2code.springbootcruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
//	Using native Hibernate API
//	@Autowired
//	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
//		this.employeeDAO = employeeDAO;
//	}
		
//	Using standard JPA API
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return this.employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int employeeId) {

		return this.employeeDAO.findById(employeeId);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		 this.employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		 this.employeeDAO.deleteById(theId);
	}
}
