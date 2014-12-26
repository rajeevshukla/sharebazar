package com.demo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class DepartmentDTO {

	private int deptId;
	private String deptName;
	private String deptDesc;

	Collection<Employee> employeList=new ArrayList<Employee>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DEPT_ID")
	public int getDeptId() {
		return deptId;
	}

	@Column(name="DEPT_NAME")
	public String getDeptName() {
		return deptName;
	}

	@Column(name="DESCd")
	public String getDeptDesc() {
		return deptDesc;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="DEPT_ID")
	public Collection<Employee> getEmployeList() {
		return employeList;
	}

	public void setEmployeList(Collection<Employee> employeList) {
		this.employeList = employeList;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}




}
