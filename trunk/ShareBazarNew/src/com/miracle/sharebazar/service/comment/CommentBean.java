package com.miracle.sharebazar.service.comment;


import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class CommentBean {
	private String memberShipId;
	private String userName;
	private String comment;
	private Timestamp date;
	
	public String getMemberShipId() {
		HttpSession session=ServletActionContext.getRequest().getSession();
		memberShipId=(String)	session.getAttribute("memberId");
		return memberShipId;
	}
	
	
	public void setMemberShipId(String memberShipId) {
		this.memberShipId = memberShipId;
	}
	public String getUserName() {
		
		 
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		comment=comment.replace("\n", "<br>");
		comment=comment.replace(" ", "&nbsp;");
		System.out.println(comment);
		this.comment = comment;
	}
	
	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String generateDate()
	{
		Calendar calendar=Calendar.getInstance();
		   int day=calendar.get(Calendar.DATE);
		   int month=calendar.get(Calendar.MONTH);
		   int year=calendar.get(Calendar.YEAR);
		 int hr=   calendar.get(Calendar.HOUR);
		 int min=calendar.get(Calendar.MINUTE);
		   int i =calendar.get(Calendar.AM_PM);
		  String ampm;
		  String minute;
		  if(i==0)
		  {
			  ampm=" AM";
		  }
		  else 
			  ampm=" PM";
		  if(min<10)
			  minute="0"+min;
		  else 
			  minute=""+min;
		String date=   day+"/"+month+"/"+year +" Time : "+hr+":"+minute+ ampm;
		return date;
	}
}
