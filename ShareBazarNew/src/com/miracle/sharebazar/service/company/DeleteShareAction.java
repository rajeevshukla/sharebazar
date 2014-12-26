package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteShareAction  extends ActionSupport{

	private static final long serialVersionUID = -4552364490552329648L;
	@Override
	public String execute() throws Exception {
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
		
			PreparedStatement statement = connection.prepareStatement("UPDATE COMPANY_SHARE_MASTER SET IS_DELETED=? , AVAILABLE_SHARE=? WHERE MEMBERSHIP_ID=?");
			statement.setBoolean(1, true);
			statement.setInt(2, 0);
			statement.setString(3,ApplicationUtilities.getCurrentMemberIdFromSession());
			statement.executeUpdate();
			System.out.println("Company Status has been disabled..");
			//send a new mail to company 
			
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

}
