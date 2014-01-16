package com.miracle.sharebazar.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.miracle.sharebazar.utils.ApplicationUtilities;

public class DatabaseUtils {

	Connection connection;

	public DatabaseUtils() {

		try {
			Class.forName(ApplicationUtilities.getCustomProperty("mysql.driverClass", "com.mysql.jdbc.Driver"));

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public Connection getConnectionDb() {
		try {
			connection = DriverManager.getConnection(ApplicationUtilities.getCustomProperty("mysql.connectionUrl",null), ApplicationUtilities.getCustomProperty("mysql.userName", "root"), ApplicationUtilities.getCustomProperty("mysql.password", "password"));
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close() {
		try {

			connection.close();
		} catch (Exception e) {
			System.out.println(" error in closing database connection");
		}

	}
}
