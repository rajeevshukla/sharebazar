package com.miracle.sharebazar.customerLogic;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerSellShare  extends ActionSupport implements ModelDriven<ShareBean>{
	  ShareBean bean=new ShareBean();
  public ShareBean getModel() {

   	   return bean;
   }
	    
	public String execute() throws Exception {

	 System.out.println(" in execute method");
	 return SUCCESS;
	 }
}
