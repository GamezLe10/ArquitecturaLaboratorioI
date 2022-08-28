package com.example.LaboratorioI.BusinessDelegate;

import java.util.Optional;

import com.example.LaboratorioI.entity.Employee;
import com.example.LaboratorioI.service.EmployeeService;

public class EmployeeServiceProxy extends EmployeeService {
	@Override
	public Employee addEmployee(Employee emp) {
		System.out.println("Delegar trabajo en objeto real.");
	    return super.addEmployee(emp);
	}
	@Override
	public Optional<Employee> findEmployeeById(Long empId) {
		System.out.println("Delegar trabajo en objeto real.");
	    return super.findEmployeeById(empId);
	}
	@Override
	public Iterable<Employee> findAllEmployee() {
		System.out.println("Delegar trabajo en objeto real.");
	    return super.findAllEmployee();
	}
	@Override
	public void deleteEmployeeById(Employee emp) {
		System.out.println("Delegar trabajo en objeto real.");
	    super.deleteEmployeeById(emp);
	}
}
