package br.com.alessanderleite.app.service;

import java.util.List;
import java.util.Optional;

import br.com.alessanderleite.app.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Optional<Employee> getEmployeeById(long id);
}
