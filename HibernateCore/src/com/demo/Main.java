package com.demo;

import org.hibernate.Session;

public class Main {

	HibernateDaoService hibernateDaoService=new HibernateDaoService();
	public static void main(String[] args) {

		Main main=new Main();

		//main.insertEmployee();
		//main.insertDepartMent();
		main.insertEmp();
		

		/* Employee employee=(Employee)main.getEmpDetails(1,Employee.class);
   System.out.println(employee.getDepartment());

    System.out.println("Fetching department :");

    DepartmentDTO departmentDTO=(DepartmentDTO)main.getEmpDetails(3, DepartmentDTO.class);


     System.out.println(departmentDTO);
     System.out.println(departmentDTO.getEmployee());*/
	}

	public void insertEmployee(){
		/*Employee employee=new Employee();
		employee.setName("rajeev shukla");
		employee.setSalary(25000);
		DepartmentDTO  departmentDTO=new DepartmentDTO();
		departmentDTO.setDeptName("ID");


		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("emp saved one time.");
		departmentDTO.setDeptId(employee.getId());


		session.save(employee);
		session.getTransaction().commit();
		session.close();*/
	}

	public void insertEmp(){

		Employee employee=new Employee("Rajeev ", 1200);
		employee.setDepartmentDTO((DepartmentDTO)hibernateDaoService.getObject(DepartmentDTO.class, 1));

		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		
		session.close();
	}

	public void insertDepartMent(){


		DepartmentDTO departmentDTO=new DepartmentDTO();
		departmentDTO.setDeptName("IT");
		departmentDTO.getEmployeList().add(new Employee("Rajeev", 12000));
		departmentDTO.getEmployeList().add(new Employee("Vaibhav", 1500));


		Session session=HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();
		session.save(departmentDTO);
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
