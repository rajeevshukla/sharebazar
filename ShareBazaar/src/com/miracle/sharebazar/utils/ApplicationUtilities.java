package com.miracle.sharebazar.utils;

import java.util.Properties;

public class ApplicationUtilities {

	public static Properties  SHARE_BAZAR_PROPERTIES=new  Properties();

	public static String getCountryNameFromCurrencyId(String currencyId){

		return ApplicationMaps.CURRENCYID_COUNTRYNAME.get(currencyId);
	}

	public static String getCustomProperty(String propertyKey,String defaultValue){
		if(null == defaultValue || "".equals(defaultValue)){
			return SHARE_BAZAR_PROPERTIES.getProperty(propertyKey);
		}else{
			return SHARE_BAZAR_PROPERTIES.getProperty(propertyKey, defaultValue);
		}
	}


}
