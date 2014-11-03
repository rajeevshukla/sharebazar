package com.gss.spring.security.persistence.security;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import com.gss.spring.security.domain.common.UserDetailsDTO;

public class AuthenticationDAO {

	private SessionFactory sessionFactory;

	private Session currentSession;

	private Logger logger = Logger.getLogger(AuthenticationDAO.class);

	public UserDetailsDTO getDetailsForUserId(String strUserId) {
		UserDetailsDTO userDetailsDTO = new UserDetailsDTO();

		try{
			currentSession = sessionFactory.openSession();
			Transaction transaction = currentSession.beginTransaction();
			userDetailsDTO =  (UserDetailsDTO) currentSession.load(UserDetailsDTO.class, strUserId.toUpperCase());
			logger.debug(userDetailsDTO.toString());
			transaction.commit();
			if(currentSession.isOpen())
				currentSession.close();
			currentSession = null;
		}catch (ObjectNotFoundException e) {
			userDetailsDTO = new UserDetailsDTO();
			return userDetailsDTO;
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		return userDetailsDTO;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void updatePasswordForUser(String updateQuery, UserDetailsDTO userDetails,String newPassword){
		Session session= getSessionFactory().openSession();
		Transaction transaction= session.beginTransaction();
		int numOfUpdate = session.createQuery(updateQuery).
				setString("newPassword", newPassword).
				setInteger("version", userDetails.getVersion()+1).
				setString("updatedAuthor", userDetails.getUsername()).
				setDate("updatedDate", new Date()).setString("userId", userDetails.getUsername()).executeUpdate();
		transaction.commit();
		logger.debug("in change pwd method. num of rows updated: " + numOfUpdate);
	}
	//	
	//	public void updateUser(UserDetailsDTO userDetailsDTO)
	//	{
	//		getHibernateTemplate().saveOrUpdate(userDetailsDTO);
	//	}


	public List loadAllRowsForCriteriaOnStartUp(DetachedCriteria criteria){
		System.out.println("Loading criteria");
		List result=null;
		Session session=sessionFactory.openSession();
		Transaction transaction=   session.beginTransaction();
		result= criteria.getExecutableCriteria(session).list();
		transaction.commit();
		if(session.isOpen()){
			session.close();
		}
		return result;
	}

	public void insertNewRow(Object entityToSave){

		try{
			Session	currentSession = sessionFactory.openSession();
			Transaction transaction = currentSession.beginTransaction();
			currentSession.save(entityToSave);
			transaction.commit();
			if(currentSession.isOpen())
				currentSession.close();

		}catch (Exception e) {
			logger.error("error in updating login hostory details", e);
		}
	}



}
