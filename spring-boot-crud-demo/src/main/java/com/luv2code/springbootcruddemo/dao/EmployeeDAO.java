package com.luv2code.springbootcruddemo.dao;

import java.util.List;

import com.luv2code.springbootcruddemo.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
	public Employee findById(int employeeId);
	public void save(Employee employee);
	public void deleteById(int theId);
}
