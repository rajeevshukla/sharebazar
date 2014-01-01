package com.miracle.sharebazar.utils;

import java.util.Properties;

public class ApplicationUtilities {

	public static Properties  SHARE_BAZAR_PROPERTIES=new  Properties();
	
	public static String getCountryNameFromCurrencyId(String currencyId){
		
		return ApplicationMaps.CURRENCYID_COUNTRYNAME.get(currencyId);
	}

}
