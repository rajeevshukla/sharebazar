package com.miracle.sharebazar.utils;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.miracle.sharebazar.connection.DatabaseUtils;

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
		     /*System.out.println(ApplicationUtilities.getCustomProperty("mysql.userName", "i dont now"));*/
			logger.info("Application started successfully...");
			/*DatabaseUtils databaseUtils=new DatabaseUtils();
			System.out.println(databaseUtils.getConnectionDb());*/
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
