package com.HaloTech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HaloTech.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
