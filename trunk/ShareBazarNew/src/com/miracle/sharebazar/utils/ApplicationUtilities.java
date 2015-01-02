package com.miracle.sharebazar.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class ApplicationUtilities {

	public static Properties SHARE_BAZAR_PROPERTIES = new Properties();

	public static String getCountryNameFromCurrencyId(String currencyId) {

		return ApplicationMaps.CURRENCYID_COUNTRYNAME.get(currencyId);
	}

	public static String getCustomProperty(String propertyKey,
			String defaultValue) {
		if (null == defaultValue || "".equals(defaultValue)) {
			return SHARE_BAZAR_PROPERTIES.getProperty(propertyKey);
		} else {
			return SHARE_BAZAR_PROPERTIES
					.getProperty(propertyKey, defaultValue);
		}
	}

	public static String getCurrentMemberIdFromSession() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		return (String) session.getAttribute("memberId");
	}

	
	public static String getCurrentDateWithTime(){
		
		 SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy hh:mm a");
		 
		 return simpleDateFormat.format(new Date(System.currentTimeMillis()));
		
	}
	
}
