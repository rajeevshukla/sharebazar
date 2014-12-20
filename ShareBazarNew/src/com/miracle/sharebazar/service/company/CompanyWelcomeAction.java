package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class CompanyWelcomeAction  extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
	
       DatabaseUtils databaseUtils=new DatabaseUtils();
       Connection connection=  databaseUtils.getConnectionDb();
		
       HttpSession session=ServletActionContext.getRequest().getSession();
       String membershipId=(String)session.getAttribute("memberId");
	   PreparedStatement ps=connection.prepareStatement("SELECT COUNT(*) FROM MESSAGE_TO_COMPANY WHERE IS_READ=0  AND COMPANY_MEMBERSHIP_ID=?");
		 ps.setString(1, membershipId);
        ResultSet rs=ps.executeQuery();		
		int totalUnreadMessages=0;
         if(rs.next()){
        	  totalUnreadMessages=rs.getInt(1);
         }
         session.setAttribute("totalUnreadMsg", totalUnreadMessages);
         connection.close();
		return SUCCESS;
	}
}
