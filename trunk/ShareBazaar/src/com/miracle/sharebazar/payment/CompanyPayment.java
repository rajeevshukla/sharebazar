package com.miracle.sharebazar.payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CompanyPayment  extends ActionSupport implements ModelDriven<PaymentBean>{

	private static final long serialVersionUID = 1L;
	PaymentBean bean=new PaymentBean();
      public PaymentBean getModel() {
            return bean;
         }
      
      @Override
    public String execute() throws Exception {
    
    	  DatabaseUtils db = new DatabaseUtils();
  		Connection connection = db.getConnectionDb();
  		HttpSession session = ServletActionContext.getRequest().getSession();
  		PreparedStatement ps2 = connection
  				.prepareStatement("UPDATE COMPANY_LOGIN set IS_PAID=? where MEMBERSHIP_ID=?");
  		
  		ps2.setInt(1, 1);
  		
  		ps2.setString(2, (String) session.getAttribute("memberId"));
  		
  		PreparedStatement ps3=connection.prepareStatement("UPDATE COMAPNY_MASTER set BALANCE=? where MEMBERSHIP_ID=?");
        ps3.setDouble(1, 1000);
        ps3.setString(2,(String) session.getAttribute("memberId"));
		
  		PreparedStatement ps = connection
  				.prepareStatement("insert into COMPANY_TRANSACTION values(?,?,?,?,?,?,?,?)");
  		ps.setString(1, (String) session.getAttribute("memberId"));
		ps.setString(2, bean.getCardHolderName());
		ps.setString(3, bean.getCardNumber());
		ps.setString(4, bean.getCardType());

		ps.setString(5, bean.getMonth() + "/" + bean.getYear());
		ps.setInt(6, 1000);
		ps.setString(7, "registration");
		ps.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
		int b=ps.executeUpdate();
  		
  		if (b == 1) {
  			int c = ps2.executeUpdate();
  			if (c == 1) {
  				ps3.executeUpdate();
  				return "success";
  			} else
  				return ERROR;
  		}
  		return ERROR;
      
      
      }


}
