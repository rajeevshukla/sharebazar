package vision;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poll.ConnectionPoll;

public class Supdate extends HttpServlet {




	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String fname = request.getParameter("fname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		
		ConnectionPoll cp = new ConnectionPoll();
		cp.connect();
		
		try
		{
			PreparedStatement ps = cp.con.prepareStatement("update student set name=?, fname=?, phone=?, email=?, address=? where id ='"+id+"'");
			ps.setString(1, name);
			ps.setString(2, fname);
			ps.setString(3, phone);
			ps.setString(4, email);
			ps.setString(5, address);
			ps.executeUpdate();
			response.sendRedirect("sedit.jsp?id="+id+"");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


}
