package com.HaloTech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.HaloTech.model.Employee;

@Repository
public interface IEmployeeService {
//save emp
	Integer SaveEmp(Employee e);
//find emp by id
  Optional<Employee> getEmpbyId(Integer id);
//find all emp	
  List<Employee>getAllEmp();
//update emp
  void updateEmp(Employee e);
//delete emp
	void deleteEmp(Integer id);
}
