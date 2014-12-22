package com.miracle.sharebazar.company.model;

import java.sql.Timestamp;

public class TransactionHistoryDetailsForm {

	private String transactionType;
	private double transactionAmount;
	private Timestamp transactionDate;
	private String transactionDoneByUserName;
	private String transactionDoneByMembershipId;
	private String transactionDoneForMembershipId;

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDoneByUserName() {
		return transactionDoneByUserName;
	}

	public void setTransactionDoneByUserName(String transactionDoneByUserName) {
		this.transactionDoneByUserName = transactionDoneByUserName;
	}

	public String getTransactionDoneByMembershipId() {
		return transactionDoneByMembershipId;
	}

	public void setTransactionDoneByMembershipId(
			String transactionDoneByMembershipId) {
		this.transactionDoneByMembershipId = transactionDoneByMembershipId;
	}

	public String getTransactionDoneForMembershipId() {
		return transactionDoneForMembershipId;
	}

	public void setTransactionDoneForMembershipId(
			String transactionDoneForMembershipId) {
		this.transactionDoneForMembershipId = transactionDoneForMembershipId;
	}

	@Override
	public String toString() {
		return "TransactionHistoryDetailsForm [transactionType="
				+ transactionType + ", transactionAmount=" + transactionAmount
				+ ", transactionDate=" + transactionDate
				+ ", transactionDoneByUserName=" + transactionDoneByUserName
				+ ", transactionDoneByMembershipId="
				+ transactionDoneByMembershipId
				+ ", transactionDoneForMembershipId="
				+ transactionDoneForMembershipId + "]";
	}

}
