package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.service.common.CommonServiceProvider;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerBuyShare extends ActionSupport implements ModelDriven<ShareBean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7987685065654486659L;
	ShareBean bean = new ShareBean();
	double availabeBal = 0.0;

	private String getBuyer() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		String buyer = (String) session.getAttribute("memberId");
		return buyer;

	}

	CommonServiceProvider commonServiceProvider=new CommonServiceProvider();


	public String execute() {

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		double remainBal = availabeBal - bean.getTotalAmount();
		int remainShare = bean.getAvailableShare() - bean.getBuySharePost();
		try {
			connection.setAutoCommit(false);
			PreparedStatement buyerInsertStatement = connection.prepareStatement("insert into BUYER_MASTER values(?,?,?,?,?,?,?,?)");

			PreparedStatement customerUpdateBalanceStatement = connection.prepareStatement("UPDATE CUSTOMER_MASTER set BALANCE=? where MEMBERSHIP_ID=?");

			PreparedStatement companyUpdateShareStatement = connection.prepareStatement("UPDATE COMPANY_SHARE_MASTER set AVAILABLE_SHARE=? where MEMBERSHIP_ID=?");

			PreparedStatement selectShareFromCustomerMasterStatement = connection.prepareStatement("SELECT SHARE from CUSTOMER_MASTER where MEMBERSHIP_ID=? ");

			PreparedStatement psTransactionStatement = connection.prepareStatement("insert into CUSTOMER_TRANSACTION values(?,?,?,?,?,?,?,?)");

			psTransactionStatement.setString(1, getBuyer());
			psTransactionStatement.setString(2, null);
			psTransactionStatement.setString(3, null);
			psTransactionStatement.setString(4, null);
			psTransactionStatement.setString(5, null);
			psTransactionStatement.setDouble(6, bean.getTotalAmount());
			psTransactionStatement.setString(7, "debit");
			psTransactionStatement.setTimestamp(8,new Timestamp(System.currentTimeMillis()));
			selectShareFromCustomerMasterStatement.setString(1, getBuyer());

			companyUpdateShareStatement.setInt(1, remainShare);
			companyUpdateShareStatement.setString(2, bean.getCompanyId());

			customerUpdateBalanceStatement.setDouble(1, remainBal);
			customerUpdateBalanceStatement.setString(2, getBuyer());

			//inserting buyer details...

			buyerInsertStatement.setString(1, getBuyer());
			buyerInsertStatement.setString(2, bean.getCompanyId());
			buyerInsertStatement.setString(3, bean.getShareTypePost());
			buyerInsertStatement.setInt(4, bean.getBuySharePost());
			buyerInsertStatement.setDouble(5, bean.getRatePerSharePost());
			buyerInsertStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			buyerInsertStatement.setString(7, commonServiceProvider.getCustomerLoginIdForMembershipId(getBuyer()));
			buyerInsertStatement.setString(8, commonServiceProvider.getCompanyLoginIdForMembershipId(bean.getCompanyId()));
			
			double companyBalance=commonServiceProvider.getCompanyBalanceForMembershipId(bean.getCompanyId());

			companyBalance=companyBalance+bean.getTotalAmount();
			commonServiceProvider.updateCompanyBalanceForMembershipId(bean.getCompanyId(), companyBalance);

			int b = customerUpdateBalanceStatement.executeUpdate();
			int c = buyerInsertStatement.executeUpdate();
			int d = companyUpdateShareStatement.executeUpdate(); 

			ResultSet set = selectShareFromCustomerMasterStatement.executeQuery();
			int share = 0;
			if (set.next()) {
				share = set.getInt(1);
			}

			share = share + bean.getBuySharePost();
			PreparedStatement ps5 = connection.prepareStatement("UPDATE CUSTOMER_MASTER set SHARE=? where MEMBERSHIP_ID=?");
			ps5.setInt(1, share);
			ps5.setString(2, getBuyer());
			int e = ps5.executeUpdate();

			connection.commit();
			psTransactionStatement.executeUpdate();
			if (b == 1 && c == 1 && d == 1 && e == 1) {
				return SUCCESS;
			} else
				return ERROR;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();

			} catch (SQLException se) {
				se.printStackTrace();
			}
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return ERROR;
	}



	public ShareBean getModel() {
		return bean;
	}

	@Override
	public void validate() {
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement ps2 = connection
					.prepareStatement("SELECT BALANCE from CUSTOMER_MASTER where MEMBERSHIP_ID=?");
			ps2.setString(1, getBuyer());
			ResultSet set = ps2.executeQuery();
			if (set.next()) {
				availabeBal = set.getDouble("BALANCE");
				System.out.println("available balance is " + availabeBal);
			}
			if (availabeBal < bean.getTotalAmount())
				addFieldError("insuffBal","You have insufficient balance .Please credit  your balance using manage funds menu");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
