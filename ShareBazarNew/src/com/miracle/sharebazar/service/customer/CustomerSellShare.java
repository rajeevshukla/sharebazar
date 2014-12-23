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
			PreparedStatement buyerInsertStatement = connection.prepareStatement("INSERT INTO BUYER_SELLER_MASTER values(?,?,?,?,?,?,?,?)");
			
			
			double availableCustomerBalance= commonServiceProvider.getCustomerBalanceForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession());
			commonServiceProvider.updateCustomerBalanceForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession(), availableCustomerBalance+bean.getTotalAmount());
			
			double availableCompanyBalance=commonServiceProvider.getCompanyBalanceForMembershipId(bean.getCompanyId());
			commonServiceProvider.updateCompanyBalanceForMembershipId(bean.getCompanyId(), availableCompanyBalance-bean.getTotalAmount());
			commonServiceProvider.updateCustomerShareForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession(), bean.getCustomerShare()-bean.getNoOfShareForSell());
			
			commonServiceProvider.updateCompanyShareForMembershipId(bean.getCompanyId(), bean.getAvailableShare()+bean.getNoOfShareForSell());
			
			
			buyerInsertStatement.setString(1, bean.getCompanyId());
			buyerInsertStatement.setString(2, ApplicationUtilities.getCurrentMemberIdFromSession());
			buyerInsertStatement.setString(3, bean.getShareTypePost());
			buyerInsertStatement.setInt(4, bean.getNoOfShareForSell());
			buyerInsertStatement.setDouble(5, bean.getRatePerSharePost());
			buyerInsertStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			buyerInsertStatement.setString(7, commonServiceProvider.getCompanyLoginIdForMembershipId(bean.getCompanyId()));
			buyerInsertStatement.setString(8, commonServiceProvider.getCustomerLoginIdForMembershipId(ApplicationUtilities.getCurrentMemberIdFromSession()));
			
			PreparedStatement customerTransactionStatement = connection.prepareStatement("insert into CUSTOMER_TRANSACTION values(?,?,?,?,?,?,?,?)");

			customerTransactionStatement.setString(1, ApplicationUtilities.getCurrentMemberIdFromSession());
			customerTransactionStatement.setString(2, null);
			customerTransactionStatement.setString(3, null);
			customerTransactionStatement.setString(4, null);
			customerTransactionStatement.setString(5, null);
			customerTransactionStatement.setDouble(6, bean.getTotalAmount());
			customerTransactionStatement.setString(7, "SELL");
			customerTransactionStatement.setTimestamp(8,new Timestamp(System.currentTimeMillis()));
			
			
			PreparedStatement companyTransactionStatement = connection.prepareStatement("insert into COMPANY_TRANSACTION values(?,?,?,?,?,?,?,?)");

			companyTransactionStatement.setString(1, bean.getCompanyId());
			companyTransactionStatement.setString(2, null);
			companyTransactionStatement.setString(3, null);
			companyTransactionStatement.setString(4, null);
			companyTransactionStatement.setString(5, null);
			companyTransactionStatement.setDouble(6, bean.getTotalAmount());
			companyTransactionStatement.setString(7, "BUY");
			companyTransactionStatement.setTimestamp(8,new Timestamp(System.currentTimeMillis()));
			 System.out.println("executing.. update statement.. ");
			customerTransactionStatement.executeUpdate();
			 companyTransactionStatement.executeUpdate();
			 buyerInsertStatement.executeUpdate();
			 System.out.println("executed update statements. ");
			
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
