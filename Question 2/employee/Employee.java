package com.java.jpa.employee;

import javax.persistence.*;

//This is a marker annotation which indicates that this class is an entity
@Entity

//table name is emp1
@Table(name = "emp1")

public class Employee {

	// This annotation is placed on a specific field that holds the persistent
	// identifying properties
	@Id

	private int empno;

	private String name;

	private String designation;

	private double salary;

	private int pno;

	public Employee(int empno, String name, String designation, double salary, int pno) {
		super();
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.pno = pno;
	}

	public Employee() {
		super();
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

}
