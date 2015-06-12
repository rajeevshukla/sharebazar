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

public class DoExpense extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String home = request.getParameter("home");
		double home1 = Double.valueOf(home);
		String phone = request.getParameter("phone");
		double phone1 = Double.valueOf(phone);
		String elec = request.getParameter("elec");
		double elec1 = Double.valueOf(elec);
		String other = request.getParameter("other");
		double other1 = Double.valueOf(other);
		
		ConnectionPoll cp = new ConnectionPoll();
		cp.connect();
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sf.format(d).toString();
		try
		{
			PreparedStatement ps = cp.con.prepareStatement("insert into expense (home_rent,phone_bill,elec_bill,other_bill,date) value(?,?,?,?,?)");
			ps.setDouble(1, home1);
			ps.setDouble(2, phone1);
			ps.setDouble(3, elec1);
			ps.setDouble(4, other1);
			ps.setString(5, date);
			ps.executeUpdate();
			response.sendRedirect("expenses.jsp");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
