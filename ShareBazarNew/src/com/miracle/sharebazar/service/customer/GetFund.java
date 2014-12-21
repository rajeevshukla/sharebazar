package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class GetFund extends ActionSupport {

	public String execute() throws Exception {
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		HttpSession session = ServletActionContext.getRequest().getSession();

		PreparedStatement statement = connection
				.prepareStatement("select BALANCE,SHARE from CUSTOMER_MASTER  where MEMBERSHIP_ID= ?");
		statement.setString(1, (String) session.getAttribute("memberId"));
		ResultSet set = statement.executeQuery();
		if (set.next()) {
			session.setAttribute("balance", set.getDouble(1));
			session.setAttribute("share", set.getInt(2));
			return SUCCESS;
		} else
			return ERROR;
	}
}
