package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("in do start tag");

		try {
			pageContext.getOut().write("Do start tage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("in do after body");
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("in do end tag");
		return SKIP_PAGE;
	}

}
