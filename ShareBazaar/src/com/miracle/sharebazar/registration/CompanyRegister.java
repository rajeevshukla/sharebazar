package com.miracle.sharebazar.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.service.company.CompanyBean;
import com.opensymphony.xwork2.ModelDriven;

public class CompanyRegister implements ModelDriven<CompanyBean> {

private	String memberShipId;

	CompanyBean bean = new CompanyBean();
	

	public String getMemberShipId() {
		return memberShipId;
	}

	public void setMemberShipId(String memberShipId) {
		this.memberShipId = memberShipId;
	}

	public String execute() {
		DatabaseUtils conn = new DatabaseUtils();
		Connection connection = conn.getConnectionDb();

		try {

			Statement stmt = connection
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt
					.executeQuery("select MEMBERSHIP_ID from COMPANY_LOGIN");
			if (!rs.first()) {
				memberShipId = "CY200019";
			} else {
				if (!rs.next()) {
					memberShipId = "CY200039";
				} else {
					rs.last();
					String temp1 = rs.getString(1);
					rs.previous();
					String temp2 = rs.getString(1);
					int a = 0, b = 0;
					b = Integer.parseInt(temp1.substring(2, temp1.length()));
					a = Integer.parseInt(temp2.substring(2, temp2.length()));
					memberShipId = "CY" + (2 * b - a + 1);
					setMemberShipId(memberShipId);
					stmt.close();
				}
			}

			PreparedStatement ps = connection
					.prepareStatement("insert into COMPANY_MASTER values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, getMemberShipId());
			ps.setString(2, bean.getCompanyName());
			
			ps.setString(3, bean.getEmail());
			ps.setString(4, bean.getAddress());
			ps.setString(5, bean.getCity());
			ps.setString(6, bean.getState());
			ps.setString(7, bean.getCountry());
			ps.setLong(8, bean.getPin());
			ps.setLong(9, bean.getPhone());
			ps.setLong(10, bean.getFax());
			ps.setLong(11, bean.getMobile());
			ps.setString(12, bean.getAboutCompany());
			ps.setDouble(13, 0.0);

			PreparedStatement ps2 = connection
					.prepareStatement("insert into COMPANY_LOGIN values(?,?,?,?)");
			ps2.setString(1, memberShipId);
			ps2.setString(2, bean.getCompanyLogin());
			ps2.setString(3, bean.getPassword());
			ps2.setInt(4, 0); // status to check wheather the company pay money
								// or not not. 0 means first time it does no pay
								// the money

			
			
			
			PreparedStatement ps3=connection.prepareStatement("insert into COMPANY_SHARE_MASTER values(?,?,?,?,?,?,?)");
			ps3.setString(1, memberShipId);
			ps3.setString(2, bean.getCompanyName());
			ps3.setInt(3, bean.getNoOfShare());
			ps3.setDouble(4, bean.getRatePerShare());
			ps3.setString(5, bean.getShareType());
			ps3.setString(6, bean.getDateOfIssue());
			ps3.setInt(7, bean.getNoOfShare());
			int a=ps.executeUpdate();
	     int b=		ps2.executeUpdate();
		 int c=	ps3.executeUpdate();
			if(a==b && b==c && c==1)
			{
				 HttpSession session=ServletActionContext.getRequest().getSession();
                 session.setAttribute("memberId", getMemberShipId());
				return "success";
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		finally {
			conn.close();
		}

		return "error";
	}

	public CompanyBean getModel() {
		return bean;
	}

}
