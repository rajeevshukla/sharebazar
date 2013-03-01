package com.miracle.sharebazar.payment;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.ConnectionDb;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerPayment extends ActionSupport implements
		ModelDriven<PaymentBean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PaymentBean bean = new PaymentBean();

	public PaymentBean getModel() {

		return bean;
	}

	public String execute() throws Exception {
		ConnectionDb db = new ConnectionDb();
		Connection connection = db.getConnectionDb();
		HttpSession session = ServletActionContext.getRequest().getSession();
		PreparedStatement ps2 = connection
				.prepareStatement("update customerlogin set status=? where memberShipId=?");

		ps2.setInt(1, 1);

		ps2.setString(2, (String) session.getAttribute("memberId"));

		PreparedStatement ps3 = connection
				.prepareStatement("update customerregister set balance=? where memberShipId=?");
		ps3.setDouble(1, 1000);
		ps3.setString(2, (String) session.getAttribute("memberId"));

		PreparedStatement ps = connection
				.prepareStatement("insert into customerfunds values(?,?,?,?,?,?,?)");
		ps.setString(1, (String) session.getAttribute("memberId"));
		ps.setString(2, bean.getCardHolderName());
		ps.setString(3, bean.getCardNumber());
		ps.setString(4, bean.getCardType());

		ps.setString(5, bean.getMonth() + "/" + bean.getYear());
		ps.setInt(6, 1000);
		ps.setString(7, "registration");
		int b = ps.executeUpdate();
		int a = ps3.executeUpdate();
		int c = ps2.executeUpdate();
		if (b == 1 & c == 1 & a == 1) {
			return SUCCESS;
		} else
			return ERROR;

	}
}
