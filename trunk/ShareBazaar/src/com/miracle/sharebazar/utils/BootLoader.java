package com.miracle.sharebazar.utils;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class BootLoader implements ServletContextListener {

	Logger logger=Logger.getLogger(getClass());
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		logger.info("Context destroyed....");
	}


	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		try {
			ApplicationUtilities.SHARE_BAZAR_PROPERTIES.load(this.getClass().getResourceAsStream("/sharebazar.properties"));
				logger.info("Application started successfully...");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
