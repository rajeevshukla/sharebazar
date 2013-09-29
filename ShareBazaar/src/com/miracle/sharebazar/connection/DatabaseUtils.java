package com.miracle.sharebazar.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtils {

	Connection connection;

	public DatabaseUtils() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public Connection getConnectionDb() {
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sharebazar", "root", "password");

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
