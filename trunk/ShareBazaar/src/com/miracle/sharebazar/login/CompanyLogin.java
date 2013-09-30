package com.miracle.sharebazar.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class CompanyLogin extends ActionSupport implements ModelDriven<CompanyLoginBean> {
CompanyLoginBean bean=new CompanyLoginBean();
	
	         
	
	
	public CompanyLoginBean getModel() {
		return bean;
	}

	
		public String execute() throws Exception {
         DatabaseUtils db=new DatabaseUtils();
         Connection connection=db.getConnectionDb();
	      PreparedStatement ps=connection.prepareStatement("select * from companylogin where memberShipId=? and companyLogin=? and password=?");
	         ps.setString(1, bean.getMemberShipId());
	         ps.setString(2, bean.getLoginName());
	         ps.setString(3, bean.getPassword());
	         ResultSet set=ps.executeQuery();
	         if(set.next())
	         {
	        	 HttpSession session=ServletActionContext.getRequest().getSession();
	        	 session.setAttribute("memberId", bean.getMemberShipId());
	        	 if(set.getInt(4)==0)
        		 return "payment";
        	 else 
        		 return SUCCESS;
	         }
	
	
	
	
	return ERROR;
	}
	
	
}
