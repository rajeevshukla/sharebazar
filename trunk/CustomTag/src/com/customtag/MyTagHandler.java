package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTagHandler  extends SimpleTagSupport{
	private int endValue;
	
	

	public int getEndValue() {
		return endValue;
	}



	public void setEndValue(int endValue) {
		System.out.println("in set end value"+endValue);
		this.endValue = endValue;
	}



	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("in do tag");
		System.out.println("end value"+getEndValue());
		
		int randomValue=(int)(Math.random()*getEndValue()+1);
		System.out.println(randomValue);
		getJspContext().getOut().write(""+randomValue);
		getJspBody().invoke(null);//null means writing over response
	}
	
	
}
