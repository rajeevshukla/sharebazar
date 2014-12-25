package com.miracle.sharebazar.service.common;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SubmitContactDetailsAction extends ActionSupport {
	private static final long serialVersionUID = 4145228693169640860L;
	private String emailId;
	private String name;
	private String message;

	@Override
	public String execute() throws Exception {
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			 System.out.println(getEmailId());
			 System.out.println(getMessage());
			 System.out.println(getName());
			PreparedStatement ps=connection.prepareStatement("INSERT INTO CONTACT_US VALUES(default,?,?,?)");
			 ps.setString(1, getName());
			 ps.setString(2, getEmailId());
			 ps.setString(3, getMessage());
			 ps.executeUpdate();
			 System.out.println("Contact us has been saved successfully !!");
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			
		}
		return Action.SUCCESS;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
