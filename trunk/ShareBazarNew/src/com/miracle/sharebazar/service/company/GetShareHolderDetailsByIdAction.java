package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.CustomerBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GetShareHolderDetailsByIdAction extends ActionSupport implements ModelDriven<CustomerBean>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2905791175675213620L;


	private  CustomerBean bean=new CustomerBean();

	@Override
	public String execute() throws Exception {

		DatabaseUtils db=new DatabaseUtils();
		Connection connection=	db.getConnectionDb();
		PreparedStatement ps=connection.prepareStatement("select CM.FIRST_NAME, CM.LAST_NAME,CM.EMAIL,CM.ADDRESS,CM.CITY,CM.STATE,CM.COUNTRY,CM.PIN,CM.MOBILE_NUMBER from CUSTOMER_MASTER CM,CUSTOMER_LOGIN CL WHERE CM.MEMBERSHIP_ID=CL.MEMBERSHIP_ID AND CL.LOGIN_ID=?");
		ps.setString(1, bean.getLoginName().trim());
		ResultSet rs=   ps.executeQuery();
		if(!rs.next())  {
			return "notfound";
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
			System.out.println(bean);
			return SUCCESS;
		}
	}



	@Override
	public CustomerBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}
}
