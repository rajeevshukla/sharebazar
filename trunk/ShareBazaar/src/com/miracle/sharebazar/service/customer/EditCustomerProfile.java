package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.ConnectionDb;
import com.miracle.sharebazar.registration.CustomerBean;
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
		ConnectionDb db = new ConnectionDb();
		Connection connection = db.getConnectionDb();
		PreparedStatement ps = connection
				.prepareStatement("select * from customerregister where memberShipId=? ");
		ps.setString(1, memberShipId);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			cBean.setFirstName(rs.getString("firstName"));
			cBean.setLastName(rs.getString("lastName"));
			cBean.setEmail(rs.getString("email"));
			cBean.setAddress(rs.getString("address"));
			cBean.setCity(rs.getString("city"));
			cBean.setState(rs.getString("state"));
			cBean.setCountry(rs.getString("country"));
			cBean.setPin(rs.getLong("pin"));
			cBean.setDob(rs.getString("dob"));
			cBean.setOccupation(rs.getString("occupation"));
			cBean.setMobileNo(rs.getLong("mobileNo"));
			cBean.setIncomeGroup(rs.getString("incomeGroup"));
			
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
