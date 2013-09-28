package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.miracle.sharebazar.connection.ConnectionDb;
import com.miracle.sharebazar.payment.PaymentBean;
import com.miracle.sharebazar.registration.CompanyBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CompanyInfo  extends ActionSupport implements ModelDriven<CompanyBean> {
private String memberShipId;

public String getMemberShipId() {
	return memberShipId;
}

public void setMemberShipId(String memberShipId) {
	this.memberShipId = memberShipId;
}
CompanyBean bean=new CompanyBean();
PaymentBean paymentBean=new PaymentBean();
 
	public String execute() throws Exception {
	
		ConnectionDb db=new ConnectionDb();
	Connection connection=	db.getConnectionDb();
	  PreparedStatement ps=            connection.prepareStatement("select * from companyregister c, sharemaster s where c.memberShipId=s.memberShipId and c.memberShipId=?" );
	     ps.setString(1, memberShipId);
	  ResultSet rs=   ps.executeQuery();
	   if(!rs.next())
	   {
		   return NONE;
	   }
	   else
	   {
		   bean.setCompanyName(rs.getString("companyName"));
		   bean.setEmail(rs.getString("email"));
		   bean.setAddress(rs.getString("address"));
		   bean.setCity(rs.getString("city"));
		   bean.setState(rs.getString("state"));
		   bean.setCountry(rs.getString("country"));
		   bean.setPin(rs.getLong("pin"));
		   bean.setPhone(rs.getLong("phone"));
		   bean.setMobile(rs.getLong("mobile"));
		   bean.setAboutCompany(rs.getString("aboutCompany"));
		   
		   
		   return SUCCESS;
		   
	   }
	  
	}

	public CompanyBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}



}
