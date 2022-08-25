package com.example.LaboratorioI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.LaboratorioI.entity.Employee;

@Repository
public interface EmployeeRepositiry extends CrudRepository<Employee, Long> {


}