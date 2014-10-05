package com.miracle.sharebazar.service.customer;

import com.miracle.sharebazar.customer.model.ChangePasswordForm;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ChangePasswordAction extends ActionSupport implements ModelDriven<ChangePasswordForm>{

	
	@Override
	public ChangePasswordForm getModel() {
		// TODO Auto-generated method stub
		return changePasswordForm;
	}
	
	ChangePasswordForm changePasswordForm=new ChangePasswordForm();
	
	@Override
	public String execute() throws Exception {
		
		
		
		return SUCCESS;
	}
}
