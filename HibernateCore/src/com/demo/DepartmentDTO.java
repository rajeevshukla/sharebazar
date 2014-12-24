package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="DEPARTMENT")
@EntityListeners(value=DepartmentDTO.class)
public class DepartmentDTO {

	
	
	private int deptId;
	private String deptName;
    private String deptDesc;
    
    Employee employee;

    @Id
/*    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name="property",value="employee"))
    @GeneratedValue(generator = "generator")*/
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
	
	@OneToOne(mappedBy="department")
	@MapsId
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
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
	
	@PrePersist
	public void insertDefaultValue(){
		System.out.println("setting pre persist value..");
		setDeptDesc("Its nothing..");
	}
	
	
	
}
