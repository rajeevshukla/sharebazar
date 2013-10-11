package com.miracle.sharebazar.service.comment;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SaveCommentDetails extends ActionSupport implements ModelDriven<CommentBean> {
	CommentBean bean=new CommentBean();
	
	@Override
	public String execute() throws Exception {
	
		DatabaseUtils db=new DatabaseUtils();
	Connection connection=	db.getConnectionDb();
	HttpSession session=ServletActionContext.getRequest().getSession();
	String userName=(String)session.getAttribute("name");
	 PreparedStatement ps=connection.prepareStatement("insert into comment(memberShipId,userName,comment,commentDate) values(?,?,?,?)");
	 ps.setString(1, bean.getMemberShipId());
	 ps.setString(2, userName);
	 ps.setString(3, bean.getComment());
	 ps.setString(4, bean.generateDate());
	int b= ps.executeUpdate();
		if(b==1)
			return SUCCESS;
		else 
			return ERROR;
		
		
		
	}
	
	
	
	
	public CommentBean getModel() {
		// TODO Auto-generated method stub
		return bean;
	}
	

}
