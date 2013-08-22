package com.miracle.sharebazar.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



import org.apache.struts2.ServletActionContext;


import com.miracle.sharebazar.connection.ConnectionDb;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import freemarker.ext.servlet.HttpSessionHashModel;

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

		ConnectionDb conn = new ConnectionDb();
		Connection connection = conn.getConnectionDb();

		try {

			Statement stmt = connection
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt
					.executeQuery("select memberShipId from customerlogin");
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
					.prepareStatement("insert into customerregister values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement ps2 = connection
					.prepareStatement("insert into customerlogin values(? ,?,?,?)");
			ps.setString(1, getMemberShipId());
			ps.setString(2, bean.getFirstName());
			ps.setString(3, bean.getLastName());
			ps.setString(4, bean.getEmail());
			ps.setString(5, bean.getAddress());
			ps.setString(6, bean.getCity());
			ps.setString(7, bean.getState());
			ps.setString(8, bean.getCountry());
			ps.setLong(9, bean.getPin());
			ps.setString(10, bean.getDob());
			ps.setString(11, bean.getOccupation());
			ps.setString(12, bean.getIncomeGroup());
			ps.setLong(13, bean.getMobileNo());
            ps.setInt(14,0);
            ps.setDouble(15, 0.0);
			ps2.setString(1, memberShipId);
			ps2.setString(2, bean.getLoginName());
			ps2.setString(3, bean.getPassword());
			ps2.setInt(4, 0);

			int status = ps.executeUpdate();
			int status2 = ps2.executeUpdate();
			if (status == 1 && status2 == 1) {
/*
			Htt	`
				
				(( session).setAttribute("memberId", getMemberShipId());*/

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
