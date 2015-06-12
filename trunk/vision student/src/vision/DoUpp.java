package vision;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poll.ConnectionPoll;

public class DoUpp extends HttpServlet {




	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		ConnectionPoll cp = new ConnectionPoll();
		cp.connect();
		
		try
		{
			PreparedStatement ps = cp.con.prepareStatement("update login set user=?,pass=? where id=1");
			ps.setString(1, user);
			ps.setString(2, pass);
			ps.executeUpdate();
			response.sendRedirect("recover.jsp");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



}
