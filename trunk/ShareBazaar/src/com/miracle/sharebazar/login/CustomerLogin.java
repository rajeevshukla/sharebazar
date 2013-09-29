package com.miracle.sharebazar.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerLogin extends ActionSupport implements ModelDriven<CustomerLoginBean> {
    CustomerLoginBean bean=new CustomerLoginBean();

	public CustomerLoginBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}
    
    public String execute() throws Exception {
    	
        DatabaseUtils db=new DatabaseUtils();
        Connection connection=db.getConnectionDb();
	      PreparedStatement ps=connection.prepareStatement("select * from customerlogin where memberShipId=? and loginName=? and password=?");
	         ps.setString(1, bean.getMemberShipId());
	         ps.setString(2, bean.getLoginName());
	         ps.setString(3, bean.getPassword());
	         ResultSet set=ps.executeQuery();
	         if(set.next())
	         {
	        	 HttpSession session=ServletActionContext.getRequest().getSession();
	        	 session.setAttribute("memberId", bean.getMemberShipId());
	        	 session.setAttribute("name",bean.getLoginName());
	        	 if(set.getInt(4)==0)
	        		 return "payment";
	        	 else 
	        		 return SUCCESS;
	         }
	
	
	
	
	return ERROR;
    }
    
}
