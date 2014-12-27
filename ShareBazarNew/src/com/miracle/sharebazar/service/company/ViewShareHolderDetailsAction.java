package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.CustomerBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ViewShareHolderDetailsAction extends ActionSupport  implements ModelDriven<CustomerBean>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2118482375254315045L;
	
	CustomerBean bean=new CustomerBean();
	@Override
	public String execute() throws Exception {
		System.out.println(bean.getMemberId());
		System.out.println("inside  view shareholderdetails action class.");
		DatabaseUtils db=new DatabaseUtils();
		Connection connection=	db.getConnectionDb();
		PreparedStatement ps=connection.prepareStatement("select * from CUSTOMER_MASTER c WHERE c.MEMBERSHIP_ID=?");
		ps.setString(1, bean.getMemberId());
		ResultSet rs=   ps.executeQuery();
		if(!rs.next())  {
			return NONE;
		}
		else  {

			bean.setFirstName(rs.getString("FIRST_NAME"));
			bean.setLastName(rs.getString("LAST_NAME"));
			bean.setEmail(rs.getString("EMAIL"));
			bean.setAddress(rs.getString("ADDRESS"));
			bean.setCity(rs.getString("CITY"));
			bean.setState(rs.getString("STATE"));
			bean.setCountry(rs.getString("COUNTRY"));
			bean.setPin(rs.getLong("PIN"));
			bean.setMobileNo(rs.getLong("MOBILE_NUMBER"));
			return SUCCESS;
		}
	}

	@Override
	public CustomerBean getModel() {
		return bean;
	}

}
