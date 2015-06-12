package vision;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poll.ConnectionPoll;

public class Exupdate extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id=request.getParameter("id");
		String name=request.getParameter("name");
		double name1=Double.valueOf(name);
		String fname=request.getParameter("fname");
		double fname1=Double.valueOf(fname);
		String phone=request.getParameter("phone");
		double phone1=Double.valueOf(phone);
		String email=request.getParameter("email");
		double email1=Double.valueOf(email);
		
		ConnectionPoll cp = new ConnectionPoll();
		cp.connect();
		try{
			PreparedStatement ps=cp.con.prepareStatement("update expense set home_rent=?,phone_bill=?,elec_bill=?,other_bill=? where id='"+id+"'");
			ps.setDouble(1, name1);
			ps.setDouble(2, phone1);
			ps.setDouble(3, email1);
			ps.setDouble(4, fname1);
			
			ps.executeUpdate();
			response.sendRedirect("exedit.jsp?id="+id+"");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
