package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.payment.PaymentBean;
import com.miracle.sharebazar.service.company.CompanyBean;
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
	
		DatabaseUtils db=new DatabaseUtils();
	Connection connection=	db.getConnectionDb();
	  PreparedStatement ps=            connection.prepareStatement("select * from COMPANY_MASTER c, COMPANY_SHARE_MASTER s where c.MEMBERSHIP_ID=s.MEMBERSHIP_ID and c.MEMBERSHIP_ID=?" );
	     ps.setString(1, memberShipId);
	  ResultSet rs=   ps.executeQuery();
	   if(!rs.next())
	   {
		   return NONE;
	   }
	   else
	   {
		   bean.setCompanyName(rs.getString("COMPANY_NAME"));
		   bean.setEmail(rs.getString("EMAIL"));
		   bean.setAddress(rs.getString("ADDRESS"));
		   bean.setCity(rs.getString("CITY"));
		   bean.setState(rs.getString("STATE"));
		   bean.setCountry(rs.getString("COUNTRY"));
		   bean.setPin(rs.getLong("PIN"));
		   bean.setPhone(rs.getLong("PHONE"));
		   bean.setMobile(rs.getLong("MOBILE"));
		   bean.setAboutCompany(rs.getString("ABOUT_COMPANY"));
		   return SUCCESS;
		   
	   }
	  
	}

	public CompanyBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}



}
