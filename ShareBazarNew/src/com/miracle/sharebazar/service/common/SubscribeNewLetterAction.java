package com.miracle.sharebazar.service.common;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SubscribeNewLetterAction  extends ActionSupport{

	private static final long serialVersionUID = 7775832190212132777L;
	private String emailId;
	@Override
	public String execute() throws Exception {
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		PreparedStatement ps=connection.prepareStatement("INSERT INTO NEWS_LETTER_SUBSCRIPTION VALUES(default,?,?)");
		ps.setString(1,getEmailId());
		ps.setBoolean(2, true);
		ps.executeUpdate();
		System.out.println("News letter has been subscribed successfully !!");
		connection.close();
		return Action.SUCCESS;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



}
