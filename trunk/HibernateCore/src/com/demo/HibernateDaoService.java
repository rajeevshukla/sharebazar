package com.demo;

import org.hibernate.Session;

public class HibernateDaoService {

	
	
	public Object getObject(Class classToLoad,int id){
		
		Object objectToReturn=null;
		
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
         objectToReturn=session.get(classToLoad, id);
         session.getTransaction().commit();
         session.close();
         
         return objectToReturn;
         
		 
	}
	
}
