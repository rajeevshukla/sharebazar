package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.company.model.CompanyBean;
import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.CustomerBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EditProfile extends ActionSupport implements ModelDriven<CompanyBean> {

	@Override
	public CompanyBean getModel() {
		return companyBean;
	}
	private static final long serialVersionUID = 1L;
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
		          System.out.println("accessfing member id ");
		     ResultSet rs= preparedStatement.executeQuery();
		      if(rs.next()){
		    	  companyBean.setEmail(rs.getString("EMAIL"));
		    	  companyBean.setCompanyName(rs.getString("COMPANY_NAME"));
		    	  companyBean.setAddress(rs.getString("ADDRESS"));  
		    	  companyBean.setCity(rs.getString("CITY"));  
		    	  companyBean.setState(rs.getString("STATE"));  
		    	  companyBean.setCountry(rs.getString("COUNTRY"));  
		    	  companyBean.setPin(rs.getLong("PIN"));  
		    	  companyBean.setPhone(rs.getLong("PHONE")); 
		    	  companyBean.setFax(rs.getLong("FAX")); 
		    	  companyBean.setMobile(rs.getLong("MOBILE"));
		    	  companyBean.setAboutCompany(rs.getString("ABOUT_COMPANY"));
		    	  session.setAttribute("companyBean", companyBean);
		    	  }
		      
		return SUCCESS;
	}
		
		
	}
	

