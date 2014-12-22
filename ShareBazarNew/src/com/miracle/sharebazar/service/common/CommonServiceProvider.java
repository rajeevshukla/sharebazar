package com.miracle.sharebazar.service.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.miracle.sharebazar.connection.DatabaseUtils;

public class CommonServiceProvider  {



	public String getCompanyLoginIdForMembershipId(String memberShipId) {

		String loginId = "";
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();

		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT LOGIN_ID FROM COMPANY_LOGIN WHERE MEMBERSHIP_ID=?");
			statement.setString(1, memberShipId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				loginId = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return loginId;
	}

	public String getCustomerLoginIdForMembershipId(String membershipId) {

		String loginId = "";
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();

		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT LOGIN_ID FROM CUSTOMER_LOGIN WHERE MEMBERSHIP_ID=?");
			statement.setString(1, membershipId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				loginId = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return loginId;
	}

	public double getCompanyBalanceForMembershipId(String membershipId){

		double balance = 0.0;
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();

		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT BALANCE FROM COMPANY_MASTER WHERE MEMBERSHIP_ID=?");
			statement.setString(1, membershipId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				balance = rs.getDouble(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return balance;

	}

	public void updateCompanyBalanceForMembershipId(String memberShipId,double balance){
		System.out.println("updating company balance ..");

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection.prepareStatement("UPDATE COMPANY_MASTER SET  BALANCE=?   WHERE MEMBERSHIP_ID=?");
			statement.setDouble(1,balance);
			statement.setString(2, memberShipId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public double getCustomerBalanceForMembershipId(String membershipId){

		double balance = 0.0;
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();

		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT BALANCE FROM CUSTOMER_MASTER WHERE MEMBERSHIP_ID=?");
			statement.setString(1, membershipId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				balance = rs.getDouble(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return balance;

	}


	public void updateCustomerBalanceForMembershipId(String memberShipId,double balance){
		System.out.println("updating company balance ..");

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection
					.prepareStatement("UPDATE CUSTOMER_MASTER SET  BALANCE=?   WHERE MEMBERSHIP_ID=?");
			statement.setDouble(1,balance);
			statement.setString(2, memberShipId);
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public void updateCustomerShareForMembershipId(String memberShipId,int noOfShare){
		System.out.println("updating customer  share");

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection
					.prepareStatement("UPDATE CUSTOMER_MASTER SET  SHARE=?   WHERE MEMBERSHIP_ID=?");
			statement.setDouble(1,noOfShare);
			statement.setString(2, memberShipId);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int getCustomerShareForMembershipId(String memberShipId){
		System.out.println("Inside get customer share !!");

		int noOfShares=0;
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT SHARE FROM CUSTOMER_MASTER   WHERE MEMBERSHIP_ID=?");
			statement.setString(1, memberShipId);
			ResultSet  rs=  statement.executeQuery();
			if(rs.next()){
				noOfShares=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return noOfShares;
	}



	public int getCompanyShareForMembershipId(String membershipId){
		int noOfShares=0;
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT AVAILABLE_SHARE FROM COMPANY_SHARE_MASTER   WHERE MEMBERSHIP_ID=?");
			statement.setString(1, membershipId);
			ResultSet  rs=  statement.executeQuery();
			if(rs.next()){
				noOfShares=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return noOfShares;

	}

	public void updateCompanyShareForMembershipId(String membershipId, int noOfShares){

		System.out.println("updating comapny share details.....");

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection.prepareStatement("UPDATE COMPANY_SHARE_MASTER SET  AVAILABLE_SHARE=?   WHERE MEMBERSHIP_ID=?");
			
			statement.setDouble(1,noOfShares);
			statement.setString(2,  membershipId);
			statement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
