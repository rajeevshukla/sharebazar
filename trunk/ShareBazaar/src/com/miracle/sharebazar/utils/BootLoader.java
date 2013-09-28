package com.miracle.sharebazar.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class BootLoader implements ServletContextListener{
	Logger logger=Logger.getLogger(getClass());

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		 logger.info("----------------------Context Initilized-------------------------------------------------");
		 try {
			 System.out.println(ApplicationUtilities.SHARE_BAZAR_PROPERTIES);
			 System.out.println(this.getClass());
			 System.out.println(this.getClass().getResourceAsStream("sharebazar.properties"));
		ApplicationUtilities.SHARE_BAZAR_PROPERTIES.load(this.getClass().getResourceAsStream("./sharebazar.properties"));
		 System.out.println(ApplicationUtilities.SHARE_BAZAR_PROPERTIES);
		 }catch(Exception e ){
			 logger.error("Error in loading properties", e);
		 }
	}

	

}
