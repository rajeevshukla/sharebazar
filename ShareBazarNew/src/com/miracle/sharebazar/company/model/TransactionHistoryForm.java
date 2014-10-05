package com.miracle.sharebazar.company.model;

import java.sql.Timestamp;

public class TransactionHistoryForm {
 
	 
	private String cardHolderName;
	private Timestamp transactionDate;
	private float amount;

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TransactionHistoryForm [cardHolderName=" + cardHolderName
				+ ", transactionDate=" + transactionDate + ", amount=" + amount
				+ "]";
	}
}
