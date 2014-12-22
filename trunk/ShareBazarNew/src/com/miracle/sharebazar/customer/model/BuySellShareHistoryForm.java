package com.miracle.sharebazar.customer.model;

import java.sql.Timestamp;

public class BuySellShareHistoryForm {

	private String memberShipId;
	private String loginName;
	private int noOfShares;
	private double ratePerShare;
	private double totalAmount;
	private String shareType;
	private Timestamp transactionDate;

	public String getMemberShipId() {
		return memberShipId;
	}

	public String getLoginName() {
		return loginName;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public double getRatePerShare() {
		return ratePerShare;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public String getShareType() {
		return shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public void setMemberShipId(String memberShipId) {
		this.memberShipId = memberShipId;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public void setRatePerShare(double ratePerShare) {
		this.ratePerShare = ratePerShare;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "BuySellShareHistoryForm [memberShipId=" + memberShipId
				+ ", loginName=" + loginName + ", noOfShares=" + noOfShares
				+ ", ratePerShare=" + ratePerShare + ", totalAmount="
				+ totalAmount + ", transactionDate=" + transactionDate + "]";
	}

}
