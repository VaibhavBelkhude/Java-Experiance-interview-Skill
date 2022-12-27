package com.HaloTech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name="Employee")
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private String empDesg;
	private String empAddr;
	private Long empPhone;
	private String email;
	private String empDept;
	private Double empSal;
	private String empdeptNo;
	

}
