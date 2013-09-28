package com.miracle.sharebazar.service.customer;

import java.util.Calendar;

public class ShareBean {

	
	private String companyNamePost;
	
	private String shareTypePost;
	private int buySharePost;
	private int tranPasswordPost;
	private double ratePerSharePost;
	private String companyId;
	private int availableShare; 
//------------------------- these are the varible to store the value of sell shares class...........
	
	private int customerShare;
	private int noOfShareForSell;
	
	
	 public int getCustomerShare() {
		return customerShare;
	}
	public void setCustomerShare(int customerShare) {
		System.out.println(" custoemr shares are"+ customerShare);
		this.customerShare = customerShare;
	}
	public int getNoOfShareForSell() {
		return noOfShareForSell;
	}
	public void setNoOfShareForSell(int noOfShareForSell) {
		System.out.println("no of share for sell"+noOfShareForSell);
		this.noOfShareForSell = noOfShareForSell;
	}
	
	
	//-----------------------------------------------------------------------
	
	
	public String getCurrentDate()
	   {
		   Calendar calendar=Calendar.getInstance();
		   int day=calendar.get(Calendar.DATE);
		   int month=calendar.get(Calendar.MONTH);
		   int year=calendar.get(Calendar.YEAR);
		   return  day+"/"+month+"/"+year;
		   
		   
	   }
	public int getAvailableShare() {
		return availableShare;
	}


	public void setAvailableShare(int availableShare) {
		System.out.println("available share is "+ availableShare);
		this.availableShare = availableShare;
	}


	public String getCompanyId() {
		return companyId;
	}


	public void setCompanyId(String companyId) {
		System.out.println(" companyid is " + companyId);
		this.companyId = companyId;
	}


	private double totalAmount;
	
	


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		System.out.println("total amount"+ totalAmount);
		this.totalAmount = totalAmount;
	}


	public String getCompanyNamePost() {
	
		return companyNamePost;
	}


	public void setCompanyNamePost(String companyNamePost) {
		System.out.println(" in company name "+companyNamePost);
		this.companyNamePost = companyNamePost;
	}




	public String getShareTypePost() {
		return shareTypePost;
	}


	public void setShareTypePost(String shareTypePost) {
		System.out.println("share type" +shareTypePost);
		this.shareTypePost = shareTypePost;
	}


	

	public int getBuySharePost() {
		return buySharePost;
	}


	public void setBuySharePost(int buySharePost) {
		this.buySharePost = buySharePost;
	}


	public int getTranPasswordPost() {
		return tranPasswordPost;
	}


	public void setTranPasswordPost(int tranPasswordPost) {
		System.out.println("transaction password"+tranPasswordPost);
		this.tranPasswordPost = tranPasswordPost;
	}


	public double getRatePerSharePost() {
		return ratePerSharePost;
	}


	public void setRatePerSharePost(double ratePerSharePost) {
		System.out.println("rate per share"+ratePerSharePost);
		this.ratePerSharePost = ratePerSharePost;
	}


}
