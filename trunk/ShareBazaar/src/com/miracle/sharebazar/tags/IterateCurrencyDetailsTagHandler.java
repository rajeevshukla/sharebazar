package com.miracle.sharebazar.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.miracle.sharebazar.utils.ApplicationMaps;

public class IterateCurrencyDetailsTagHandler extends SimpleTagSupport {

	
	@Override
	public void doTag() throws JspException, IOException {
	
		for (String  currencyId : ApplicationMaps.CURRENCYID_COUNTRYNAME.keySet()) {
			getJspContext().setAttribute("key", currencyId);
			getJspContext().setAttribute("value", ApplicationMaps.CURRENCYID_COUNTRYNAME.get(currencyId));
			getJspBody().invoke(null);
		}
	}
}
