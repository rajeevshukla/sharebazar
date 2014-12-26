package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	private int Id;
	private String name;
	private double salary;

	private DepartmentDTO departmentDTO;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	@Column(name = "SALARY")
	public double getSalary() {
		return salary;
	}

	@ManyToOne()
	@JoinColumn(name="DEPT_ID")
	public DepartmentDTO getDepartmentDTO() {
		return departmentDTO;
	}

	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

}
