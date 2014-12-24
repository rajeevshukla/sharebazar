package com.demo;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="EMPLOYEE")
public class Employee {

	private int Id;
	private String name;
	private double salary;
	private DepartmentDTO department;
	 
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	@Column(name="NAME")
	public String getName() {
		return name;
	}

	@Column(name="SALARY")
	public double getSalary() {
		return salary;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public DepartmentDTO getDepartment() {
		return department;
	}
	
	public void setDepartment(DepartmentDTO department) {
		this.department = department;
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
