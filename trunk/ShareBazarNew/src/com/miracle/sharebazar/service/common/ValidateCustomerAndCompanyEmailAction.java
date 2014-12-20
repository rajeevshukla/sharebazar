package com.miracle.sharebazar.service.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.Action;

public class ValidateCustomerAndCompanyEmailAction {

	public boolean isValidCustomerMail = false;
	public boolean isValidCompanyMail = false;

	private String customerEmail;
	private String companyEmail;

	public String validateCustomerMail() {

		boolean status = false;
		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();

		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT * FROM  CUSTOMER_MASTER WHERE  EMAIL LIKE ?%");
			ps.setString(1, getCustomerEmail());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				isValidCustomerMail = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Action.SUCCESS;
	}

	public String validateComapanyMail() {

		boolean status = false;
		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();

		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT * FROM  COMPANY_MASTER WHERE  EMAIL LIKE ?%");
			ps.setString(1, getCustomerEmail());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				isValidCompanyMail = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Action.SUCCESS;
	}

	public boolean isValidCustomerMail() {
		return isValidCustomerMail;
	}

	public boolean isValidCompanyMail() {
		return isValidCompanyMail;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setValidCustomerMail(boolean isValidCustomerMail) {
		this.isValidCustomerMail = isValidCustomerMail;
	}

	public void setValidCompanyMail(boolean isValidCompanyMail) {
		this.isValidCompanyMail = isValidCompanyMail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

}
