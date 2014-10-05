package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.company.model.CompanyBean;
import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EditProfile extends ActionSupport implements ModelDriven<CompanyBean> {

	@Override
	public CompanyBean getModel() {
		return companyBean;
	}
	
	CompanyBean companyBean=new CompanyBean();
	
	@Override
	public String execute() throws Exception {
	
		 String memberId;
		  HttpSession session=ServletActionContext.getRequest().getSession();
		memberId=(String)session.getAttribute("memberId");
	
		  DatabaseUtils databaseUtils=new DatabaseUtils();
		 Connection  connection= databaseUtils.getConnectionDb();
		 
		     PreparedStatement preparedStatement=    connection.prepareStatement("SELECT * FROM COMPANY_MASTER WHERE MEMBERSHIP_ID=?");
		      preparedStatement.setString(1, memberId);
		
		     ResultSet rs= preparedStatement.executeQuery();
		      
		      if(rs.next()){
		    	  
		    	  companyBean.setEmail(rs.getString("EMAIL"));
		    	  companyBean.setCompanyName(rs.getString("COMPANY_NAME"));
		    	  companyBean.setAddress(rs.getString("Address"));  
		    	  companyBean.setCity(rs.getString("City"));  
		    	  companyBean.setState(rs.getString("State"));  
		    	  companyBean.setCountry(rs.getString("Country"));  
		    	  companyBean.setPin(rs.getLong("Pin"));  
		    	  companyBean.setPhone(rs.getLong("Phone")); 
		    	  companyBean.setFax(rs.getLong("Fax")); 
		    	  companyBean.setMobile(rs.getLong("Moblie"));
		    	  companyBean.setAboutCompany(rs.getString("AboutCompany"));
		    	  }
		     
		return SUCCESS;
		
	}
	
}