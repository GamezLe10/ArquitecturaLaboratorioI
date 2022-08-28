package com.example.LaboratorioI.service;

import java.util.Optional;

import com.example.LaboratorioI.entity.Employee;

public interface InterfeceEmployeeService {
	public Employee addEmployee(Employee emp);
	public Optional<Employee> findEmployeeById(Long empId);
	public Iterable<Employee> findAllEmployee();
	public void deleteEmployeeById(Employee emp);
}
