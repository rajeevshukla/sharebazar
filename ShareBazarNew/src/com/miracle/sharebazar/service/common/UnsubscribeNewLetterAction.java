package com.miracle.sharebazar.service.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UnsubscribeNewLetterAction extends ActionSupport {

	private static final long serialVersionUID = -1025183536270398337L;
	 private String emailId;
	 private boolean emailExist;
	 
	 @Override
	public String execute() throws Exception {
		 DatabaseUtils db = new DatabaseUtils();
			Connection connection = db.getConnectionDb();
			
			PreparedStatement ps1=connection.prepareStatement("SELECT * FROM NEWS_LETTER_SUBSCRIPTION WHERE EMAIL_ID=?");
			ps1.setString(1, getEmailId());
			ResultSet rs= ps1.executeQuery();
			 if(rs.next()) 
				 emailExist=true;
			 else 
				 return Action.SUCCESS;
			 
			
			PreparedStatement ps=connection.prepareStatement("UPDATE  NEWS_LETTER_SUBSCRIPTION SET IS_SUBSCRIBED=? WHERE EMAIL_ID=?");
			ps.setBoolean(1, false);
			ps.setString(2, emailId);
			ps.executeUpdate();
			System.out.println("News letter has been unsubscribed  successfully !!");
			connection.close();
			return Action.SUCCESS;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public boolean isEmailExist() {
		return emailExist;
	}

	public void setEmailExist(boolean emailExist) {
		this.emailExist = emailExist;
	}
	
	
}
