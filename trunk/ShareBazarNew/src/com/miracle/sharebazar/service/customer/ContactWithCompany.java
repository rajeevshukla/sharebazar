package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class ContactWithCompany extends ActionSupport {
private String memberShipId;
private String customerMessageToCompany;

public String getCustomerMessageToCompany() {
	return customerMessageToCompany;
}

public void setCustomerMessageToCompany(String customerMessageToCompany) {
	this.customerMessageToCompany = customerMessageToCompany;
}

public String getMemberShipId() {
	return memberShipId;
}

public void setMemberShipId(String memberShipId) {
	this.memberShipId = memberShipId;
}
	public String execute() throws Exception {
		DatabaseUtils db=new  DatabaseUtils();
		Connection connection=db.getConnectionDb();
	    HttpSession session=ServletActionContext.getRequest().getSession();
	     String userName=   (String)       session.getAttribute("name");
		String memberIdOfUser=(String)session.getAttribute("memberId");
	    PreparedStatement ps=  connection.prepareStatement("insert into MESSAGE_TO_COMPANY values( ?,?,?,?,?,?)");

	    ps.setString(1, memberIdOfUser);
		 ps.setString(2, memberShipId);
		 ps.setString(3, userName);
		 ps.setString(4, customerMessageToCompany);
		 ps.setBoolean(5, false);//isread by company
		 ps.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
		
	int  b=	ps.executeUpdate();
		 if(b==1)
			 return  SUCCESS;
		 else
			 return ERROR;
		 
		
	}
}
