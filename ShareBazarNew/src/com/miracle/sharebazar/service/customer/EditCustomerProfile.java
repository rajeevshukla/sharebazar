package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.CustomerBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EditCustomerProfile extends ActionSupport implements
		ModelDriven<CustomerBean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CustomerBean cBean = new CustomerBean();

	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		String memberShipId = (String) session.getAttribute("memberId");
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		PreparedStatement ps = connection.prepareStatement("select * from CUSTOMER_MASTER where MEMBERSHIP_ID=? ");
		ps.setString(1, memberShipId);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			cBean.setFirstName(rs.getString("FIRST_NAME"));
			cBean.setLastName(rs.getString("LAST_NAME"));
			cBean.setEmail(rs.getString("EMAIL"));
			cBean.setAddress(rs.getString("ADDRESS"));
			cBean.setCity(rs.getString("CITY"));
			cBean.setState(rs.getString("STATE"));
			cBean.setCountry(rs.getString("COUNTRY"));
			cBean.setPin(rs.getLong("PIN"));
			cBean.setDob(rs.getString("DOB"));
			cBean.setOccupation(rs.getString("OCCUPATION"));
			cBean.setMobileNo(rs.getLong("MOBILE_NUMBER"));
			cBean.setIncomeGroup(rs.getString("INCOME_GROUP"));
			
		}
		else 
		{
			return ERROR;
		}
		
		session.setAttribute("bean", cBean);
		return SUCCESS;

	}

	public CustomerBean getModel() {
		// TODO Auto-generated method stub
		return cBean;
	}

}
