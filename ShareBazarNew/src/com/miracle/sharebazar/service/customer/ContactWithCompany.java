package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
	  PreparedStatement ps=  connection.prepareStatement("insert into MESSAGE_TO_COMAPNY values( ?,?,?,? )");
	           
		 ps.setString(1, memberShipId);
		 ps.setString(2, memberIdOfUser);
		 ps.setString(3, userName);
		 ps.setString(4, customerMessageToCompany);
		 System.out.println(customerMessageToCompany);
		 System.out.println(userName);
		 System.out.println(memberIdOfUser);
		 System.out.println(memberShipId);
	int  b=	ps.executeUpdate();
		 if(b==1)
			 return  SUCCESS;
		 else
			 return ERROR;
		 
		
	}
}
