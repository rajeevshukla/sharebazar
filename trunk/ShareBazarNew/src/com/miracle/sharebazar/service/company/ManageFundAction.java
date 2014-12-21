package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class ManageFundAction extends ActionSupport {

	/**
	 * 
	 */

	private double balance;
	private int availableShare;

	private static final long serialVersionUID = -4552364490552329648L;

	public String execute() throws Exception {
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		HttpSession session = ServletActionContext.getRequest().getSession();

		PreparedStatement statement = connection
				.prepareStatement("select CM.BALANCE,SM.AVAILABLE_SHARE from COMPANY_MASTER CM, COMPANY_SHARE_MASTER SM   where CM.MEMBERSHIP_ID=SM.MEMBERSHIP_ID AND  CM.MEMBERSHIP_ID= ?");
		statement.setString(1, (String) session.getAttribute("memberId"));
		ResultSet set = statement.executeQuery();
		if (set.next()) {
			setBalance(set.getDouble(1));
			setAvailableShare(set.getInt(2));
			return SUCCESS;
		} else
			return ERROR;
	}

	public double getBalance() {
		return balance;
	}

	public int getAvailableShare() {
		return availableShare;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAvailableShare(int availableShare) {
		this.availableShare = availableShare;
	}

}
