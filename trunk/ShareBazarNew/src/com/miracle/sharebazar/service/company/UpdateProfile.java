package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.company.model.CompanyBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateProfile extends ActionSupport implements
		ModelDriven<CompanyBean> {
	CompanyBean bean = new CompanyBean();

	@Override
	public String execute() throws Exception {

		boolean status = false;

		try {
			DatabaseUtils db = new DatabaseUtils();
			Connection connection = db.getConnectionDb();
			PreparedStatement ps = connection
					.prepareStatement("UPDATE COMPANY_MASTER  SET COMPANY_NAME=? , EMAIL=? , ADDRESS=? , CITY=?, STATE=?, COUNTRY=?, PIN=?, PHONE=? FAX=?,MOBILE=?,ABOUT_COMPANY=? WHERE MEMBERSHIP_ID=? ");

			ps.setString(1, bean.getCompanyName());
			ps.setString(2, bean.getEmail());
			ps.setString(3, bean.getAddress());
			ps.setString(4, bean.getCity());
			ps.setString(5, bean.getState());
			ps.setString(6, bean.getCountry());
			ps.setLong(7, bean.getPin());
			ps.setLong(8, bean.getPhone());
			ps.setLong(9, bean.getFax());
			ps.setLong(10, bean.getMobile());
			ps.setString(11, bean.getAboutCompany());
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			String memberShipId = (String) session.getAttribute("memberId");
			ps.setString(13, memberShipId);
			ps.executeUpdate();
			int x=2/0;
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
			  HttpSession  session=ServletActionContext.getRequest().getSession();
			  session.setAttribute("errorMsg", "Error in updating profile details");
		}

		if (status) {

			return SUCCESS;
		} else
			return ERROR;

	}

	public CompanyBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

}
