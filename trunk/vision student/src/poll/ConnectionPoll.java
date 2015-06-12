package poll;

import java.sql.*;

public class ConnectionPoll {
	
	public Connection con;
	
	public void connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/visionstudent","root", "root");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
