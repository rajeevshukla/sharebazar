package vision;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poll.ConnectionPoll;

public class Salary extends HttpServlet {




	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		int id1 = Integer.parseInt(id);
		String salary = request.getParameter("salary");
		double sal = Double.valueOf(salary);
		String month = request.getParameter("month");
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		String date = sf.format(d).toString();
		
		ConnectionPoll cp = new ConnectionPoll();
		cp.connect();
		
		try
		{
			PreparedStatement ps = cp.con.prepareStatement("insert into salary(salary, month, date, t_id) values(?,?,?,?)");
			ps.setDouble(1, sal);
			ps.setString(2, month);
			ps.setString(3, date);
			ps.setInt(4, id1);
			ps.executeUpdate();
			response.sendRedirect("teacher_details.jsp?id="+id1+"");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}




}
