package com.demo;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

public class Main {

	HibernateDaoService hibernateDaoService=new HibernateDaoService();
	public static void main(String[] args) {

		Main main=new Main();

		//main.insertEmployee();
		//main.insertDepartMent();
		 Statistics statistics=HibernateUtils.getSessionFactory().getStatistics();
		 System.out.println("Statics enabled :"+statistics.isStatisticsEnabled());
		 statistics.setStatisticsEnabled(true);
		  System.out.println("Statics enabled:"+statistics.isStatisticsEnabled());
		main.getEmpDetails(1, Employee.class);
		System.out.println("#################################################");
		System.out.println("Cache Hit :"+statistics.getSecondLevelCacheHitCount());
		System.out.println("Cache miss:"+statistics.getSecondLevelCacheMissCount());
		System.out.println("Cache put:"+ statistics.getSecondLevelCachePutCount());
		main.getEmpDetails(2, Employee.class);
		System.out.println("#################################################");
		System.out.println("Cache Hit :"+statistics.getSecondLevelCacheHitCount());
		System.out.println("Cache miss:"+statistics.getSecondLevelCacheMissCount());
		System.out.println("Cache put:"+ statistics.getSecondLevelCachePutCount());
		main.getEmpDetails(3, Employee.class);
		System.out.println("#################################################");
		System.out.println("Cache Hit :"+statistics.getSecondLevelCacheHitCount());
		System.out.println("Cache miss:"+statistics.getSecondLevelCacheMissCount());
		System.out.println("Cache put:"+ statistics.getSecondLevelCachePutCount());
		main.getEmpDetails(2, Employee.class);
		System.out.println("#################################################");
		System.out.println("Cache Hit :"+statistics.getSecondLevelCacheHitCount());
		System.out.println("Cache miss:"+statistics.getSecondLevelCacheMissCount());
		System.out.println("Cache put:"+ statistics.getSecondLevelCachePutCount());
		main.getEmpDetails(1, Employee.class);
		System.out.println("#################################################");
		System.out.println("Cache Hit :"+statistics.getSecondLevelCacheHitCount());
		System.out.println("Cache miss:"+statistics.getSecondLevelCacheMissCount());
		System.out.println("Cache put:"+ statistics.getSecondLevelCachePutCount());
		
		
		

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

