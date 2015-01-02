package com.miracle.sharebazar.mailandsms;
/**
 * To send email
 * 
 * @author rajeev shukla 
 *
 */
public class ApplicationEmailService {


	public  static void sendCustomerRegistrationEmail(final String memberId,final String userName,final String password,final String toMailId) {

		final String msg="";

		new Thread(){
			public void run() {

				SendMail sendMail=new SendMail();
				sendMail.sendMessageToMail(toMailId, "", msg);
			};
		}.start();
	}

	public static void sendForgetPasswordEmail(final String userId,final String password,final String memberId,final String toMailId){

		final String msg="<!Doctype html> <html lang='en'> <head> </head>"
				+ " <body>     Hi "+userId+",    <p> Here is your credentials for  <b>Sharebazar.com</b> given below."
				+ " <p>     <b>Login Id : </b> "+userId+" <br>  <b>Password : </b> "+password+" <br>  <b>MembershipId : </b> "+memberId+" <br></p>"
				+ "<i>Note : This is an auto generated email please do not reply back to this email.</i> <br> <br>"
				+ " Best regards, <br>  Sharebazar.com team  </body> </html> "   ;

		new Thread(){
			public void run() {

				SendMail sendMail=new SendMail();
				sendMail.sendMessageToMail(toMailId, "Here is your sharebazar.com credentials", msg);
			};
		}.start();



	}

	public static void sendSellShareEmailToCompany(final int noOfShares , final String customerId,final String companyId,final double totalPrice,final String dateOfSell,final String companyMailId){


		final String msg="<!Doctype html>"
				+ "<html lang='e'>  <head>  </head>  <body>  Hi "+companyId+" ,"
				+ " <p> You have sold <b>"+noOfShares+" shares</b> to  <b>"+customerId+"</b> on <b>"+dateOfSell+"</b>. Total amount  credited to your account is <b>"+totalPrice+" Rs.</b>"
				+ " <p>Thank you for choosing sharebazar.com</p>  <i>Note : This is an auto generated email please do not reply back to this email.</i>"
				+ "<br> <br>  Best regards, <br>   Sharebazar.com team   </body>   </html>";   

		new Thread(){
			public void run() {
				SendMail sendMail=new SendMail();
				sendMail.sendMessageToMail(companyMailId, "Transaction alert ! "+noOfShares+" shares sold at sharebazar.com", msg);
			};
		}.start();
	}

	public static void sendBuyShareEmailToCustomer(final int noOfShares , final String customerId,final String companyId,final double totalPrice,final String dateOfPurchase,final String customerMailId){

		final String msg="<!Doctype html>"
				+ "<html lang='e'>  <head>  </head>  <body>  Hi "+customerId+" ,"
				+ " <p> You have brought <b>"+noOfShares+" shares</b> from  <b>"+companyId+"</b> on <b>"+dateOfPurchase+"</b>. Total amount you have paid is <b>"+totalPrice+" Rs.</b>"
				+ " <p>Thank you for choosing sharebazar.com</p>  <i>Note : This is an auto generated email please do not reply back to this email.</i>"
				+ "<br> <br>  Best regards, <br>   Sharebazar.com team   </body>   </html>";    
		new Thread(){
			public void run() {
				SendMail sendMail=new SendMail();
				sendMail.sendMessageToMail(customerMailId, "Transaction alert !"+noOfShares+" share brought at sharebazar.com", msg);
			};
		}.start();

	}



}
