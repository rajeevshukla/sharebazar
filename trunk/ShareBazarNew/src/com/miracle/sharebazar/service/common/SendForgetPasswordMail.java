package com.miracle.sharebazar.service.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.mailandsms.SendMail;
import com.opensymphony.xwork2.Action;

public class SendForgetPasswordMail {


	private String userType;
	private String emailId;

	private String result;
	public String getUserType() {
		return userType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String execute(){

		boolean status=false;

		DatabaseUtils databaseUtils=new DatabaseUtils();
		Connection connection= databaseUtils.getConnectionDb();
		String userName="";
		String firstName="";
		String password="";
		String memberShipId="";

		try  {
           System.out.println("inside send forget password mail.. ");

			if(userType.equalsIgnoreCase("Customer")){
				PreparedStatement ps=connection.prepareStatement("SELECT CL.MEMBERSHIP_ID, CL.LOGIN_ID, CL.PASSWORD,CM.FIRST_NAME  FROM CUSTOMER_MASTER CM, CUSTOMER_LOGIN CL WHERE CL.MEMBERSHIP_ID=CM.MEMBERSHIP_ID AND CM.EMAIL=?");
				ps.setString(1, emailId);
				ResultSet rs= ps.executeQuery();
				if(rs.next()){
					memberShipId=rs.getString(1);
					userName=rs.getString(2);
					password=rs.getString(3);
					firstName=rs.getString(4);
					result=" <span style='color : green;'>Email send successfully to your mail Id !</span>";
					status=true;
				}else {
					result="<span style='color : red;'>Email Id does not exist in our database !</span>";
				}

			}else if(userType.equalsIgnoreCase("Company")){
				PreparedStatement ps=connection.prepareStatement("SELECT CL.MEMBERSHIP_ID, CL.LOGIN_ID, CL.PASSWORD,CM.FIRST_NAME  FROM COMPANY_MASTER CM, COMPANY_LOGIN CL WHERE CL.MEMBERSHIP_ID=CM.MEMBERSHIP_ID AND CM.EMAIL=?");
				ps.setString(1, emailId);
				ResultSet rs= ps.executeQuery();

				if(rs.next()){
					memberShipId=rs.getString(1);
					userName=rs.getString(2);
					password=rs.getString(3);
					firstName=rs.getString(4);

					result=" <span style='color : green;'>Email send successfully to your mail Id !!</span>";
					status=true;
				}else {
					result="<span style='color : red;'>Email Id does not exist in our database !!</span>";
				}

			}
			if(status){
				SendMail sendMail=new SendMail();
				final 	String htmlMsg="<html> <body> Dear "+firstName+", <p> Your userId is :<b>"+userName+"</b> Password is :<b> "+password+ "</b> and your  membershipId  is   <b>"+memberShipId+"</b> ! </p><br><br><br> Best Regards,  <br> ShareBazar.com";
				boolean statusOfMail = sendMail.sendMessageToMail(emailId, "Here is your Sharebazar credentials",  htmlMsg); 
				System.out.println("Mail send successfullly to "+emailId);
				
				 if(!statusOfMail){
					 
					 result=" <span style='color : red;'> Could send forget password email . Please check your internet connection ! </span>";
					 
				 }
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return Action.SUCCESS;

	}





}
