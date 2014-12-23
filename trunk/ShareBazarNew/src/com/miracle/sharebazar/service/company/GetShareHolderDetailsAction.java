package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.CustomerBean;
import com.opensymphony.xwork2.ActionSupport;

public class GetShareHolderDetailsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3730451016537009601L;

	private String membershipId;
	
	private CustomerBean shareHolderDetails = new CustomerBean();
	private int noOfSharesBrought;
	@Override
	public String execute() throws Exception {

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		PreparedStatement ps = connection
				.prepareStatement("SELECT * FROM CUSTOMER_MASTER WHERE MEMBERSHIP_ID=?");
		ps.setString(1, getMembershipId());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			shareHolderDetails.setFirstName(rs.getString("FIRST_NAME"));
			shareHolderDetails.setLastName(rs.getString("LAST_NAME"));
			shareHolderDetails.setEmail(rs.getString("EMAIL"));
			shareHolderDetails.setMobileNo(rs.getLong("MOBILE_NUMBER"));
			shareHolderDetails.setAddress(rs.getString("STATE"));
			shareHolderDetails.setState(rs.getString("STATE"));
			shareHolderDetails.setCity(rs.getString("CITY"));
			shareHolderDetails.setCountry(rs.getString("COUNTRY"));

		}

		PreparedStatement preparedStatement= connection.prepareStatement("SELECT SUM(NO_OF_SHARE) FROM BUYER_SELLER_MASTER WHERE BUYER_MEMEBERSHIP_ID=? AND SELLER_MEMBERSHIP_ID=? GROUP BY SELLER_MEMBERSHIP_ID");
		ResultSet resultSet= preparedStatement.executeQuery();

		if(resultSet.next()){

			noOfSharesBrought=rs.getInt(1);

		}else {
			noOfSharesBrought=0;
		}
		connection.close();

		return SUCCESS;
	}

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public CustomerBean getShareHolderDetails() {
		return shareHolderDetails;
	}

	public void setShareHolderDetails(CustomerBean shareHolderDetails) {
		this.shareHolderDetails = shareHolderDetails;
	}

	public int getNoOfSharesBrought() {
		return noOfSharesBrought;
	}

	public void setNoOfSharesBrought(int noOfSharesBrought) {
		this.noOfSharesBrought = noOfSharesBrought;
	}


}
