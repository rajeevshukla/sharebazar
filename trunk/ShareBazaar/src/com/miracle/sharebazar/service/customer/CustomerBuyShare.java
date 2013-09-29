package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customerLogic.ShareBean;
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
		
		PreparedStatement ps=connection.prepareStatement("insert into buyandsell values(?,?,?,?,?,?)");
	    PreparedStatement ps2=connection.prepareStatement("update customerregister set balance=? where memberShipId=?");	
		PreparedStatement ps3=connection.prepareStatement("update sharemaster set remainShare=? where memberShipId=?");
		PreparedStatement ps4=connection.prepareStatement("select share from customerregister where memberShipId=? ");
		
		
		ps4.setString(1, getBuyer());
		
		ps3.setInt(1, remainShare);
		ps3.setString(2, bean.getCompanyId());
	    ps2.setDouble(1, remainBal);
		  ps2.setString(2, getBuyer());
		ps.setString(1, getBuyer());
		ps.setString(2, bean.getCompanyId());
		ps.setString(3, bean.getShareTypePost());
		ps.setString(4, "buy");
		ps.setDouble(5, bean.getTotalAmount());
		ps.setString(6, bean.getCurrentDate());
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
		PreparedStatement ps5=connection.prepareStatement("update customerregister set share=? where memberShipId=?");
		ps5.setInt(1, share);
		ps5.setString(2, getBuyer());
		int e=ps5.executeUpdate();
		
		if(b==1 && c==1 && d==1 && e==1)
		{
			return SUCCESS;
		}
		else
			return ERROR;
		
		}
		catch (Exception e) {
            e.printStackTrace();
		
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
	PreparedStatement ps2=connection.prepareStatement("select balance from customerregister where memberShipId=?");
	ps2.setString(1,getBuyer());
	ResultSet set=ps2.executeQuery();
	if(set.next())
	{
		availabeBal=set.getDouble("balance");
		System.out.println("available balance is "+availabeBal);
	}
	if(availabeBal<bean.getTotalAmount())
		addFieldError("insuffBal", "You have insufficient balance .Please credit  your balance using funds menu");
	
	}
	
	catch (Exception e) {
		// TODO: handle exception
	}
	}
	
}
