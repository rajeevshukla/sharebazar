package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.ChangePasswordForm;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ChangePasswordAction extends ActionSupport implements ModelDriven<ChangePasswordForm>{

	@Override
	public ChangePasswordForm getModel() {
		return changePasswordForm;
	}

	ChangePasswordForm changePasswordForm = new ChangePasswordForm();

	@Override
	public String execute() throws Exception {

		HttpSession session = ServletActionContext.getRequest().getSession();
		String memberId = (String) session.getAttribute("memberId");
		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();

		try {
			PreparedStatement ps=connection.prepareStatement("UPDATE COMPANY_LOGIN SET PASSWORD=? WHERE MEMBERSHIP_ID=?");
			ps.setString(1, changePasswordForm.getNewPassword());
			ps.setString(2, memberId);
		    System.out.println( "Execute status "+ps.executeUpdate());
			System.out.println("Password update succesfully !!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

		return SUCCESS;
	}

	@Override
	public void validate() {
		if(!changePasswordForm.getNewPassword().equals(changePasswordForm.getRePassword())){
			addFieldError("errorMsg", "->New Password and Repassword do not match !");
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		String memberId = (String) session.getAttribute("memberId");
		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();

		try {
		
			PreparedStatement ps= connection.prepareStatement("SELECT PASSWORD FROM COMPANY_LOGIN WHERE MEMBERSHIP_ID=?");
			ps.setString(1, memberId);
			ResultSet rs= ps.executeQuery();
			if(rs.next()){
				if(!rs.getString(1).equals(changePasswordForm.getCurrentPassword())){
					addFieldError("errorMsg", "->Current Password do not match with existing passsword !");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}
