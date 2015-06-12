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

public class DoTeacher extends HttpServlet {



	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String fname = request.getParameter("fname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String cate = request.getParameter("cate");
		String salary = request.getParameter("salary");
		double salary1 = Double.valueOf(salary);
		String address = request.getParameter("address");
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat();
		String date = sf.format(d).toString();
		
		ConnectionPoll cp = new ConnectionPoll();
		cp.connect();
		try{
			PreparedStatement ps=cp.con.prepareStatement("insert into teacher (name,fname,phone,email,gender,cate,salary,address,date) values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, fname);
			ps.setString(3, phone);
			ps.setString(4, email);
			ps.setString(5, gender);
			ps.setString(6, cate);
			ps.setDouble(7, salary1);
			ps.setString(8, address);
			ps.setString(9, date);
			ps.executeUpdate();
			response.sendRedirect("teacher_reg.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
		
	}



}
