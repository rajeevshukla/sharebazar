package com.miracle.sharebazar.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CommonLogin extends ActionSupport implements ModelDriven<CommonLoginBean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CommonLoginBean bean=new CommonLoginBean();

	public CommonLoginBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

	public String execute() throws Exception {

		DatabaseUtils db=new DatabaseUtils();
		Connection connection=db.getConnectionDb();
		//if member ship id as CS in startup it means it a customer otherwise it will be a company
		if(bean.getMemberShipId().startsWith("CS")) {
			PreparedStatement ps=connection.prepareStatement("select * from CUSTOMER_LOGIN where MEMBERSHIP_ID=? and LOGIN_ID=? and PASSWORD=?");
			ps.setString(1, bean.getMemberShipId());
			ps.setString(2, bean.getLoginName());
			ps.setString(3, bean.getPassword());
			ResultSet set=ps.executeQuery();
			if(set.next())
			{
				HttpSession session=ServletActionContext.getRequest().getSession();
				session.setAttribute("memberId", bean.getMemberShipId());
				session.setAttribute("name",bean.getLoginName());
				if(set.getInt(4)==0)
					return "cspayment";
				else 
					return "cssuccess";
			}
		}else {
			PreparedStatement ps=connection.prepareStatement("select * from COMPANY_LOGIN where MEMBERSHIP_ID=? and LOGIN_ID=? and PASSWORD=?");
			ps.setString(1, bean.getMemberShipId());
			ps.setString(2, bean.getLoginName());
			ps.setString(3, bean.getPassword());
			ResultSet set=ps.executeQuery();
			if(set.next())
			{
				HttpSession session=ServletActionContext.getRequest().getSession();
				session.setAttribute("memberId", bean.getMemberShipId());
				session.setAttribute("name", bean.getLoginName());
				if(set.getInt(4)==0)
					return "cypayment";
				else 
					return "cysuccess";
			}
		}
		return ERROR;
	}

}
