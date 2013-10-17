package com.miracle.sharebazar.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerRegister extends ActionSupport implements
ModelDriven<CustomerBean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CustomerBean bean = new CustomerBean();
	private String memberShipId;

	public String getMemberShipId() {
		return memberShipId;
	}

	public void setMemberShipId(String memberShipId) {
		this.memberShipId = memberShipId;
	}

	public CustomerBean getModel() {

		return bean;
	}

	public String process() {

		DatabaseUtils conn = new DatabaseUtils();
		Connection connection = conn.getConnectionDb();

		try {

			Statement stmt = connection
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt
					.executeQuery("select MEMBERSHIP_ID from CUSTOMER_LOGIN");
			if (!rs.first()) {
				memberShipId = "CS200019";
			} else {
				if (!rs.next()) {
					memberShipId = "CS200039";
				} else {
					rs.last();
					String temp1 = rs.getString(1);
					rs.previous();
					String temp2 = rs.getString(1);
					int a = 0, b = 0;
					b = Integer.parseInt(temp1.substring(2, temp1.length()));
					a = Integer.parseInt(temp2.substring(2, temp2.length()));
					memberShipId = "CS" + (2 * b - a + 1);
					setMemberShipId(memberShipId);
				}
			}

			PreparedStatement ps = connection
					.prepareStatement("insert into CUSTOMER_MASTER values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement ps2 = connection
					.prepareStatement("insert into CUSTOMER_LOGIN values(? ,?,?,?)");
			ps.setString(1, getMemberShipId());
			ps.setString(2, bean.getFirstName());
			ps.setString(3, bean.getLastName());
			ps.setString(4, bean.getAddress());
			ps.setString(5, bean.getCity());
			ps.setString(6, bean.getState());
			ps.setString(7, bean.getCountry());
			ps.setLong(8, bean.getPin());
			ps.setString(9, bean.getDob());
			ps.setString(10, bean.getOccupation());
			ps.setString(11, bean.getIncomeGroup());
			ps.setLong(12, bean.getMobileNo());
			ps.setString(13, bean.getEmail());
			ps.setInt(14,0);
			ps.setDouble(15, 0.0);
			ps2.setString(1, memberShipId);
			ps2.setString(2, bean.getLoginName());
			ps2.setString(3, bean.getPassword());
			//ps2.setInt(4, ApplicationConstants.LOGIN_TYPE_CUSTOMER);
			ps2.setInt(4, 0);

			int status = ps.executeUpdate();
			int status2 = ps2.executeUpdate();
			if (status == 1 && status2 == 1) {	
				HttpSession session=		ServletActionContext.getRequest().getSession();
				session.setAttribute("memberId", getMemberShipId());
				return "success";
			} else
				return "error";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return "success";
	}

}
