package com.miracle.sharebazar.company.model;

import java.sql.Timestamp;

public class ViewShareHoldersListForm {

	private String customerMembershipId;
	private String customerLoginId;
	private float ratePerShare;
	private int noOfShares;
	private Timestamp date;
	private int totalCostOfShares;

	public String getCustomerMembershipId() {
		return customerMembershipId;
	}

	public String getCustomerLoginId() {
		return customerLoginId;
	}

	public float getRatePerShare() {
		return ratePerShare;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public Timestamp getDate() {
		return date;
	}

	public int getTotalCostOfShares() {
		return totalCostOfShares;
	}

	public void setCustomerMembershipId(String customerMembershipId) {
		this.customerMembershipId = customerMembershipId;
	}

	public void setCustomerLoginId(String customerLoginId) {
		this.customerLoginId = customerLoginId;
	}

	public void setRatePerShare(float ratePerShare) {
		this.ratePerShare = ratePerShare;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public void setTotalCostOfShares(int totalCostOfShares) {
		this.totalCostOfShares = totalCostOfShares;
	}

	@Override
	public String toString() {
		return "ViewShareHoldersListForm [customerMembershipId="
				+ customerMembershipId + ", customerLoginId=" + customerLoginId
				+ ", ratePerShare=" + ratePerShare + ", noOfShares="
				+ noOfShares + ", date=" + date + ", totalCostOfShares="
				+ totalCostOfShares + "]";
	}


}
