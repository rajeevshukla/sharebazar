package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.ChangePasswordForm;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ChangePasswordAction extends ActionSupport implements ModelDriven<ChangePasswordForm>{

	
	@Override
	public ChangePasswordForm getModel() {
		// TODO Auto-generated method stub
		return changePasswordForm;
	}
	
	ChangePasswordForm changePasswordForm=new ChangePasswordForm();
	
	@Override
	public String execute() throws Exception {
		
		HttpSession session=ServletActionContext.getRequest().getSession();
		  currentPassword=(String)session.getAttribute("Current Pa");
		  
		  HttpSession session=ServletActionContext.getRequest().getSession();
		  newPassword=(String)session.getAttribute("New Password");
		  
		  HttpSession session=ServletActionContext.getRequest().getSession();
		  rePassword=(String)session.getAttribute("Re Password");
	
		  DatabaseUtils databaseUtils=new DatabaseUtils();
		  Connection  connection= databaseUtils.getConnectionDb();
		 
		  PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM COMPANY_MASTER WHERE MEMBERSHIP_ID=?");
		  preparedStatement.setString(1, memberId);
		
		     ResultSet rs= preparedStatement.executeQuery();
		      
		      if(rs.next()){
		    	  
		    	  companyBean.setEmail(rs.getString("EMAIL"));
		    	  companyBean.setCompanyName("COMPANY_NAME"); 
		    	  
		      }
		
		
		return SUCCESS;
	}
}
