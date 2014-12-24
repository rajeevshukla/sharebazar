package com.demo;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {

		Main main=new Main();

	  	main.insertEmployee();
		
 /* Employee employee=(Employee)main.getEmpDetails(1,Employee.class);
   System.out.println(employee.getDepartment());
   
    System.out.println("Fetching department :");
     
    DepartmentDTO departmentDTO=(DepartmentDTO)main.getEmpDetails(3, DepartmentDTO.class);
    
    
     System.out.println(departmentDTO);
     System.out.println(departmentDTO.getEmployee());*/
	}

	public void insertEmployee(){
		Employee employee=new Employee();
		employee.setName("rajeev shukla");
		employee.setSalary(25000);
		DepartmentDTO  departmentDTO=new DepartmentDTO();
		departmentDTO.setDeptName("ID");


		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("emp saved one time.");
		departmentDTO.setDeptId(employee.getId());
		employee.setDepartment(departmentDTO);
		departmentDTO.setEmployee(employee);
		
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}


	
	
	public Object getEmpDetails(int id,Class object1){

		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Object object=(Object)session.get(object1, id);
		session.getTransaction().commit();
		session.close();
		return  object;
	}


}
