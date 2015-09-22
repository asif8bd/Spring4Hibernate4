package com.dineshonjava.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh Rajput
 *
 */
@Entity
@Table(name = "Employee")
// For oracle db alter the line below:
// @Table(name="Employee", catalog = "database_name")
public class Employee implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// For oracle db alter two (2) lines below:
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="emp_id_Seq")
	// @SequenceGenerator(name = "emp_id_Seq", sequenceName = "emp_id_Seq", allocationSize = 1, initialValue = 1)
	@Column(name = "empid")
	private Integer empId;

	@Column(name = "empname")
	private String empName;

	@Column(name = "empaddress")
	private String empAddress;

	@Column(name = "salary")
	private Long salary;

	@Column(name = "empAge")
	private Integer empAge;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

}
