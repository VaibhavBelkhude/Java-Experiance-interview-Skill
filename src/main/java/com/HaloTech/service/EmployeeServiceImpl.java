package com.HaloTech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HaloTech.model.Employee;
import com.HaloTech.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
@Autowired
private EmployeeRepository repo;
	@Override
	public Integer SaveEmp(Employee e) {
		e=repo.save(e);
		return e.getEmpId();
	}

	@Override
	public Optional<Employee> getEmpbyId(Integer id) {
		Optional<Employee>opt=repo.findById(id);
		return opt;
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee>emplist=repo.findAll();
		return emplist;
	}

	@Override
	public void updateEmp(Employee e) {
		if((e.getEmpId())!=null) {
		repo.save(e);
		}
		else {
			System.out.println("Employee does Not exist..");
		}
		
	}

	@Override
	public void deleteEmp(Integer id) {
		repo.deleteById(id);
		
	}
}
