package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.company.model.ContactRequestForm;
import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class ContactRequestAction extends ActionSupport {

	private List<ContactRequestForm> contactRequestList = new ArrayList<ContactRequestForm>();

	private static final long serialVersionUID = -4552364490552329648L;

	@Override
	public String execute() throws Exception {

		HttpSession session = ServletActionContext.getRequest().getSession();

		String memberId = (String) session.getAttribute("memberId");
		DatabaseUtils databaseUtils = new DatabaseUtils();
		session.setAttribute("shareHolderInfoBackURL", "contactRequest.action");
		 
		Connection connection = databaseUtils.getConnectionDb();

		PreparedStatement ps = connection
				.prepareStatement("SELECT * FROM MESSAGE_TO_COMPANY WHERE COMPANY_MEMBERSHIP_ID=?");
		ps.setString(1, memberId);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			ContactRequestForm contactRequestForm = new ContactRequestForm();
			contactRequestForm.setCustomerMembershipId(rs
					.getString("CUSTOMER_MEMBERSHIP_ID"));
			contactRequestForm.setCustomerMessage(rs.getString("MESSAGE"));
			contactRequestForm.setDate(rs.getTimestamp("DATE"));
			contactRequestForm.setNotRead(rs.getBoolean("IS_READ"));
			contactRequestForm.setCustomerUserName(rs.getString("USER_NAME"));
			getContactRequestList().add(contactRequestForm);
		}

		PreparedStatement ps2 = connection
				.prepareStatement("UPDATE MESSAGE_TO_COMPANY SET IS_READ=1 WHERE COMPANY_MEMBERSHIP_ID=?");
		
		  session.setAttribute("totalUnreadMsg", 0);
		ps2.setString(1, memberId);
		ps2.executeUpdate();
		connection.close();

		return SUCCESS;
	}

	public List<ContactRequestForm> getContactRequestList() {
		return contactRequestList;
	}

	public void setContactRequestList(
			List<ContactRequestForm> contactRequestList) {
		this.contactRequestList = contactRequestList;
	}

}
