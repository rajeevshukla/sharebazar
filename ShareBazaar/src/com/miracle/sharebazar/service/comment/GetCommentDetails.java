package com.miracle.sharebazar.service.comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GetCommentDetails extends ActionSupport implements ModelDriven<CommentBean> {
	CommentBean bean=new CommentBean();
	
	

public String execute() throws Exception {
	DatabaseUtils db=new DatabaseUtils();
	Connection connection=db.getConnectionDb();
	HttpSession  session=ServletActionContext.getRequest().getSession();
	     PreparedStatement ps=         connection.prepareStatement("SELECT * FROM CUSTOMER_FEEDBACK ");
	          ResultSet rs=        ps.executeQuery();
	
	ArrayList<CommentBean> list=new ArrayList<CommentBean>();
	int size=0;
	      while(rs.next())
	    	  
	      {
	    	  CommentBean bean2=new CommentBean();
	    	bean2.setUserName( rs.getString("USER_NAME"));
	    	bean2.setComment(rs.getString("FEEDBACK"));
	    	bean2.setDate(rs.getTimestamp("FEEDBACK_DATE"));
	    	
	    	list.add(bean2);
	    	size++;
	    
	      }
	      session.setAttribute("size", size);
	      session.setAttribute("list", list);
	      return SUCCESS;
	
}




public CommentBean getModel() {
	// TODO Auto-generated method stub
	return bean;
}
}
