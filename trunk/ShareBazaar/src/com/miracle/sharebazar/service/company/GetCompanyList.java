package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class GetCompanyList extends ActionSupport {
	private List<String> companyList=new ArrayList<String>();
	private List<Integer> noOfShare=new ArrayList<Integer>();
	private List<String>  shareType=new ArrayList<String>();
	private List<Double>  ratePerShare=new ArrayList<Double>();
	private List<String>  companyId=new ArrayList<String>();
	
	

	public List<String> getCompanyId() {
		return companyId;
	}

	public void setCompanyId(List<String> companyId) {
		this.companyId = companyId;
	}

	public List<Double> getRatePerShare() {
		return ratePerShare;
	}

	public void setRatePerShare(List<Double> ratePerShare) {
		this.ratePerShare = ratePerShare;
	}

	public List<String> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<String> companyList) {
		this.companyList = companyList;
	}

	public List<Integer> getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(List<Integer> noOfShare) {
		this.noOfShare = noOfShare;
	}

	public List<String> getShareType() {
		return shareType;
	}

	public void setShareType(List<String> shareType) {
		this.shareType = shareType;
	}

	

	public String execute() throws Exception {
		companyList.add(" select a company");
		noOfShare.add(0);
		shareType.add("no");
		ratePerShare.add(0.00);
		companyId.add("");
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		PreparedStatement ps = connection
				.prepareStatement("select  companyName,remainShare,  shareType ,ratePerShare , memberShipId from sharemaster");
		
		ResultSet set = ps.executeQuery();
		while(set.next())
		{ 
			companyList.add(set.getString(1));
			noOfShare.add(set.getInt(2));
			shareType.add(set.getString(3));
			ratePerShare.add(set.getDouble(4));
			companyId.add(set.getString(5));
		}
		
		return SUCCESS;

	}

}
