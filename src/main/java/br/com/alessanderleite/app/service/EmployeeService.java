package br.com.alessanderleite.app.service;

import java.util.List;

import br.com.alessanderleite.app.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
}
