package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerBuyShare extends ActionSupport implements ModelDriven<ShareBean> {
	ShareBean bean=new ShareBean();
	double availabeBal=0.0;
	
	
  
private String getBuyer()
{
	
	HttpSession session=ServletActionContext.getRequest().getSession();
	String buyer=(String)session.getAttribute("memberId");
	
	return buyer;
}
 
	public String execute()
	{

		DatabaseUtils db=new DatabaseUtils();
		Connection  connection=db.getConnectionDb();
		double remainBal=availabeBal-bean.getTotalAmount();
		int remainShare=bean.getAvailableShare()-bean.getBuySharePost();
		try {
			connection.setAutoCommit(false);
		PreparedStatement ps=connection.prepareStatement("insert into BUYER_MASTER values(?,?,?,?,?,?)");
		PreparedStatement sellerStatement=connection.prepareStatement("insert into SELLER_MASTER value(?,?,?,?,?)");
	    PreparedStatement ps2=connection.prepareStatement("update CUSTOMER_MASTER set BALANCE=? where MEMBERSHIP_ID=?");	
		PreparedStatement ps3=connection.prepareStatement("update COMPANY_SHARE_MASTER set AVAILABLE_SHARE=? where MEMBERSHIP_ID=?");
		PreparedStatement ps4=connection.prepareStatement("select SHARE from CUSTOMER_MASTER where MEMBERSHIP_ID=? ");
	
		PreparedStatement  psTransactionStatement = connection
				.prepareStatement("insert into CUSTOMER_TRANSACTION values(?,?,?,?,?,?,?,?)");
		psTransactionStatement.setString(1, getBuyer());
		psTransactionStatement.setString(2, null);
		psTransactionStatement.setString(3, null);
		psTransactionStatement.setString(4, null);

		psTransactionStatement.setString(5, null);
		psTransactionStatement.setDouble(6, bean.getTotalAmount());
		psTransactionStatement.setString(7, "debit");
		psTransactionStatement.setTimestamp(8, new Timestamp(System.currentTimeMillis()));

		
		ps4.setString(1, getBuyer());
		
		ps3.setInt(1, remainShare);
		ps3.setString(2, bean.getCompanyId());
	    ps2.setDouble(1, remainBal);
		  ps2.setString(2, getBuyer());
		  
		ps.setString(1, getBuyer());
		ps.setString(2, bean.getCompanyId());
		ps.setString(3, bean.getShareTypePost());
		ps.setInt(4, bean.getBuySharePost());
		ps.setDouble(5, bean.getTotalAmount());
		ps.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
		int b=ps2.executeUpdate();
		int c=ps.executeUpdate();
		int d=ps3.executeUpdate();
	ResultSet  set=ps4.executeQuery();
	int share=0;
	   if(set.next())
	   {
		    share=set.getInt(1);
	   }
	
	   share=share+bean.getBuySharePost();
		PreparedStatement ps5=connection.prepareStatement("update CUSTOMER_MASTER set SHARE=? where MEMBERSHIP_ID=?");
		ps5.setInt(1, share);
		ps5.setString(2, getBuyer());
		int e=ps5.executeUpdate();
		connection.commit();
		
		psTransactionStatement.executeUpdate();
		
		
		if(b==1 && c==1 && d==1 && e==1)
		{
			return SUCCESS;
		}
		else
			return ERROR;
		}
      
		catch (Exception e) {
            e.printStackTrace();
              try {
            	  connection.rollback();
            	  connection.close();
              }catch(SQLException se){
            	  se.printStackTrace();
              }
            
		}
		
		
		return  ERROR;
	}
	public ShareBean getModel() {
		return bean;
	}
	@Override
	public void validate() {

	
	DatabaseUtils db=new DatabaseUtils();
	Connection connection=db.getConnectionDb();
	try {
	PreparedStatement ps2=connection.prepareStatement("select BALANCE from CUSTOMER_MASTER where MEMBERSHIP_ID=?");
	ps2.setString(1,getBuyer());
	ResultSet set=ps2.executeQuery();
	if(set.next())
	{
		availabeBal=set.getDouble("BALANCE");
		System.out.println("available balance is "+availabeBal);
	}
	if(availabeBal<bean.getTotalAmount())
		addFieldError("insuffBal", "You have insufficient balance .Please credit  your balance using manage funds menu");
	
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	
}
