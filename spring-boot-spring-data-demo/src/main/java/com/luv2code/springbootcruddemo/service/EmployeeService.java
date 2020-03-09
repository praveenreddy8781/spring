package com.luv2code.springbootcruddemo.service;

import java.util.List;

import com.luv2code.springbootcruddemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int employeeId);
	public void save(Employee employee);
	public void deleteById(int theId);
}
