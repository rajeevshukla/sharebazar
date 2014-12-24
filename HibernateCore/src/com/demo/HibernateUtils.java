package com.demo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;

	static {
		Configuration  configuration=new Configuration().configure();
		ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory= configuration.buildSessionFactory(serviceRegistry);
	}
	private HibernateUtils() {
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
