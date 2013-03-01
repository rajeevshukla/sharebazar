package com.miracle.sharebazar.customerLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.ConnectionDb;
import com.miracle.sharebazar.payment.PaymentBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddFund extends ActionSupport implements ModelDriven<PaymentBean>{
	 PaymentBean bean=new PaymentBean();
	 private double amount;
	 
	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		System.out.println(" in set "+amount);
		this.amount = amount;
	}
public String getDate()
{
	
	Calendar cal = new GregorianCalendar();
	  int month = cal.get(Calendar.MONTH);
	  int year = cal.get(Calendar.YEAR);
	  int day = cal.get(Calendar.DAY_OF_MONTH);
	  System.out.println("Current date : " 
	  + day + "/" + (month + 1) + "/" + year);
	String date=day+"/"+(month+1)+"/"+year;
	return date;
	
}

	@Override
	public String execute() throws Exception {
		ConnectionDb db=new ConnectionDb();
	Connection connection=	db.getConnectionDb();
	HttpSession session=ServletActionContext.getRequest().getSession();
		PreparedStatement statement1=connection.prepareStatement("select balance from customerregister where memberShipId=?");
		statement1.setString(1, (String)session.getAttribute("memberId"));
		PreparedStatement ps = connection
				.prepareStatement("insert into customerfunds values(?,?,?,?,?,?,?,?)");
		ps.setString(1, (String) session.getAttribute("memberId"));
		ps.setString(2, bean.getCardHolderName());
		ps.setString(3, bean.getCardNumber());
		ps.setString(4, bean.getCardType());

		ps.setString(5, bean.getMonth() + "/" + bean.getYear());
		ps.setDouble(6, getAmount());
		ps.setString(7, "credit");
		ps.setString(8, getDate());
		double bal=0.0;
		ResultSet set=statement1.executeQuery();
		if(set.next())
		{
			bal=set.getDouble(1);
			
			
		}
		bal=bal+getAmount(); // adding the amount
		PreparedStatement ps3 = connection
				.prepareStatement("update customerregister set balance=? where memberShipId=?");
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
