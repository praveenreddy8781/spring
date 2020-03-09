package com.luv2code.springbootcruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springbootcruddemo.dao.EmployeeRepository;
import com.luv2code.springbootcruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int employeeId) {
		Optional<Employee> result = employeeRepository.findById(employeeId);

		Employee employee = null;
		if (result.isPresent()) {
			employee = result.get();
		} else {
			throw new RuntimeException("Did not find employee id : " + employeeId);
		}

		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}
}
