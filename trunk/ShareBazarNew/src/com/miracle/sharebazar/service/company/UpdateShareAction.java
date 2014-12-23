package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateShareAction extends ActionSupport {

	private double newShareRate;
	private String newShareType;
	private static final long serialVersionUID = -4552364490552329648L;

	@Override
	public String execute() throws Exception {

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			 System.out.println(newShareRate);
			 System.out.println(newShareType);
			PreparedStatement statement = connection.prepareStatement("UPDATE COMPANY_SHARE_MASTER SET SHARE_TYPE=? , RATE_PER_SHARE=? WHERE MEMBERSHIP_ID=?");
			statement.setString(1, getNewShareType());
			statement.setDouble(2, getNewShareRate());
			statement.setString(3,ApplicationUtilities.getCurrentMemberIdFromSession());
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return SUCCESS;
	}

	public double getNewShareRate() {
		return newShareRate;
	}

	public void setNewShareRate(double newShareRate) {
		this.newShareRate = newShareRate;
	}

	public String getNewShareType() {
		return newShareType;
	}

	public void setNewShareType(String newShareType) {
		this.newShareType = newShareType;
	}

}
