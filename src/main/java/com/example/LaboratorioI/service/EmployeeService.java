package com.example.LaboratorioI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LaboratorioI.entity.Employee;
import com.example.LaboratorioI.repository.EmployeeRepositiry;

@Service
public class EmployeeService implements InterfeceEmployeeService {
	@Autowired
	EmployeeRepositiry repo;

	public Employee addEmployee(Employee emp) {
		emp = repo.save(emp);
		System.out.println("Employee saved::" + emp);
		return emp;
	}

	public Optional<Employee> findEmployeeById(Long empId) {
		Optional<Employee> emp = repo.findById(empId);
		System.out.println("Employee found::" + emp);
		return emp;
	}

	public Iterable<Employee> findAllEmployee() {
		return repo.findAll();
	}

	public void deleteEmployeeById(Employee emp) {
		repo.delete(emp);
		System.out.println("Employee deleted::" + emp);
	}
}