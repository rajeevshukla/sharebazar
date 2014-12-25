package com.miracle.sharebazar.service.customer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ViewCompanyDetailsAction  extends ActionSupport{

	private static final long serialVersionUID = 8022588323331506036L;
	
	private String memberId;
	
	@Override
	public String execute() throws Exception {

		
		
		
		
		
	
		return Action.SUCCESS;
	}

	
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


}
