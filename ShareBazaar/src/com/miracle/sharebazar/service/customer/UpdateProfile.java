package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.registration.CustomerBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateProfile extends ActionSupport implements
		ModelDriven<CustomerBean> {
	CustomerBean bean = new CustomerBean();

	@Override
	public String execute() throws Exception {
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
	PreparedStatement ps=	connection
				.prepareStatement("update customerregister  set firstName=? , lastName=?, email=? , address=? , city=?, state=?, country=?, pin=?, dob=?, occupation=?,mobileNo=?, incomeGroup=? where memberShipId=? ");

	
	     ps.setString(1, bean.getFirstName());
	     ps.setString(2, bean.getLastName());
	     ps.setString(3,bean.getEmail() );
	     ps.setString(4, bean.getAddress());
	ps.setString(5, bean.getCity());
	ps.setString(6, bean.getState());
	ps.setString(7, bean.getCountry());
	ps.setLong(8, bean.getPin());
	ps.setString(9, bean.getDob());
	ps.setString(10, bean.getOccupation());
	ps.setLong(11, bean.getMobileNo());
	ps.setString(12, bean.getIncomeGroup());
	HttpSession session=ServletActionContext.getRequest().getSession();
String memberShipId=(String)	session.getAttribute("memberId");
	
	ps.setString(13, memberShipId);
int b=	ps.executeUpdate();
	if(b==1)
	{
		
		return SUCCESS;
	}
	else
		return ERROR;
	
	}

	public CustomerBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

}
