package com.miracle.sharebazar.company.model;

import java.sql.Timestamp;

public class ContactRequestForm {

	private String customerMembershipId;
	private String customerMessage;
	private String customerUserName;
	private Timestamp date;
	private boolean notRead;

	public String getCustomerMembershipId() {
		return customerMembershipId;
	}

	public String getCustomerMessage() {
		return customerMessage;
	}

	public Timestamp getDate() {
		return date;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public boolean isNotRead() {
		return notRead;
	}

	public void setCustomerMembershipId(String customerMembershipId) {
		this.customerMembershipId = customerMembershipId;
	}

	public void setCustomerMessage(String customerMessage) {
		this.customerMessage = customerMessage;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public void setNotRead(boolean notRead) {
		this.notRead = notRead;
	}

	@Override
	public String toString() {
		return "ContactRequestForm [customerMembershipId="
				+ customerMembershipId + ", customerMessage=" + customerMessage
				+ ", customerUserName=" + customerUserName + ", date=" + date
				+ ", notRead=" + notRead + "]";
	}

	

}
