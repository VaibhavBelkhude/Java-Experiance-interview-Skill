package com.HaloTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HaloTech.model.Employee;

import com.HaloTech.service.IEmployeeService;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
@PostMapping("/register")
public String RegisterEmp(@ModelAttribute Employee employee,Model model) {
	Integer id=service.SaveEmp(employee);
	String msg="Employee Created Successfully"+id;
	model.addAttribute("message",msg);
	return "EmployeeReg";
}
@GetMapping("/getEmp")
public String getEmpDetail() {
	return "Empdetail";
}
@DeleteMapping("/delete")
public String deleteEmp() {
	return "deleteEmp";
}
@PutMapping("/update")
public String updateEmp() {
	return "EditEmp";
}
}
