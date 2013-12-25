package com.miracle.sharebazar.service.common;

import com.opensymphony.xwork2.ActionSupport;

public class CurrencyCoverterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String from;
	private int to;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	@Override
	public String execute() throws Exception {
		
		
		System.out.println("called");
	
		return SUCCESS;
	}

}
