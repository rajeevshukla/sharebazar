package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.service.common.CommonServiceProvider;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerSellShare extends ActionSupport implements		ModelDriven<ShareBean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4817868514030518957L;

	ShareBean bean = new ShareBean();
 
	CommonServiceProvider commonServiceProvider=new CommonServiceProvider();
	
	public ShareBean getModel() {
		return bean;
	}
	public String execute() throws Exception {
		System.out.println("inside sell share....");
		System.out.println(bean);

		bean.getCompanyId();
		
		bean.getAvailableShare(); //COMPANY available share..
	    bean.getCustomerShare();// customer available share
		bean.getRatePerSharePost();
		bean.getTotalAmount(); //
		bean.getNoOfShareForSell();
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();

		try {
			connection.setAutoCommit(false);
			PreparedStatement buyerInsertStatement = connection.prepareStatement("INSERT INTO BUYER_MASTER values(?,?,?,?,?,?,?,?)");
			
			
			double availableCustomerBalance= commonServiceProvider.getCustomerBalanceForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession());
			commonServiceProvider.updateCustomerBalanceForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession(), availableCustomerBalance+bean.getTotalAmount());
			
			double availableCompanyBalance=commonServiceProvider.getCompanyBalanceForMembershipId(bean.getCompanyId());
			commonServiceProvider.updateCompanyBalanceForMembershipId(bean.getCompanyId(), availableCompanyBalance-bean.getTotalAmount());
			commonServiceProvider.updateCustomerShareForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession(), bean.getCustomerShare()-bean.getNoOfShareForSell());
			
			commonServiceProvider.updateCompanyShareForMembershipId(bean.getCompanyId(), bean.getAvailableShare()+bean.getNoOfShareForSell());
			
			
			buyerInsertStatement.setString(1, bean.getCompanyId());
			buyerInsertStatement.setString(2, ApplicationUtilities.getCurrentMemberIdFromSession());
			buyerInsertStatement.setString(3, bean.getShareTypePost());
			buyerInsertStatement.setInt(4, bean.getBuySharePost());
			buyerInsertStatement.setDouble(5, bean.getRatePerSharePost());
			buyerInsertStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			buyerInsertStatement.setString(7, commonServiceProvider.getCustomerLoginIdForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession()));
			buyerInsertStatement.setString(8, commonServiceProvider.getCompanyLoginIdForMembershipId(bean.getCompanyId()));
			
			PreparedStatement psTransactionStatement = connection.prepareStatement("insert into CUSTOMER_TRANSACTION values(?,?,?,?,?,?,?,?)");

			psTransactionStatement.setString(1, ApplicationUtilities.getCurrentMemberIdFromSession());
			psTransactionStatement.setString(2, null);
			psTransactionStatement.setString(3, null);
			psTransactionStatement.setString(4, null);
			psTransactionStatement.setString(5, null);
			psTransactionStatement.setDouble(6, bean.getTotalAmount());
			psTransactionStatement.setString(7, "sell");
			psTransactionStatement.setTimestamp(8,new Timestamp(System.currentTimeMillis()));

			System.out.println("Inserting record in customer transaction:"+psTransactionStatement.executeUpdate());
			System.out.println("Inserting in buyer master :"+buyerInsertStatement.executeUpdate());
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		









			return SUCCESS;
		}

		@Override
		public void validate() {
			System.out.println("in side validate method of sell share...");


		}


	}
