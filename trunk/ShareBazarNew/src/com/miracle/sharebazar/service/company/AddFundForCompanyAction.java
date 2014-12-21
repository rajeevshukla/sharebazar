package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.payment.PaymentBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddFundForCompanyAction  extends ActionSupport  implements ModelDriven<PaymentBean>{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3101869950763986664L;
	
	PaymentBean bean=new PaymentBean();
	 private double amount;
	 
	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		System.out.println(" in set "+amount);
		this.amount = amount;
	}

	@Override
	public String execute() throws Exception {
		DatabaseUtils db=new DatabaseUtils();
	Connection connection=	db.getConnectionDb();
	HttpSession session=ServletActionContext.getRequest().getSession();
		PreparedStatement statement1=connection.prepareStatement("select BALANCE from COMPANY_MASTER where MEMBERSHIP_ID=?");
		statement1.setString(1, (String)session.getAttribute("memberId"));
		PreparedStatement ps = connection
				.prepareStatement("insert into COMPANY_TRANSACTION values(?,?,?,?,?,?,?,?)");
		ps.setString(1, (String) session.getAttribute("memberId"));
		ps.setString(2, bean.getCardHolderName());
		ps.setString(3, bean.getCardNumber());
		ps.setString(4, bean.getCardType());
		ps.setString(5, bean.getMonth() + "/" + bean.getYear());
		ps.setDouble(6, getAmount());
		ps.setString(7, "credit");
		ps.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
		double bal=0.0;
		ResultSet set=statement1.executeQuery();
		if(set.next())	{
			bal=set.getDouble(1);
		}
		
		bal=bal+getAmount(); // adding the amount
		PreparedStatement ps3 = connection.prepareStatement("update COMPANY_MASTER set BALANCE=? where MEMBERSHIP_ID=?");
		ps3.setDouble(1, bal);
		ps3.setString(2, (String) session.getAttribute("memberId"));
		int a=ps.executeUpdate();
		int b=ps3.executeUpdate();
		if(a==1 & b==1)
			return SUCCESS;
		 else 
			 return ERROR;
	}
	public PaymentBean getModel() {
		return bean;
	}
	
}
