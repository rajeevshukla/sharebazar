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

public class Deposit extends HttpServlet {


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
		
		String id=request.getParameter("id");
		int id1=Integer.parseInt(id);
		String phone=request.getParameter("phone");
		String cate=request.getParameter("cate");
		String deposit=request.getParameter("deposit");
		String rema=request.getParameter("rema");
		double rema1=Double.valueOf(rema);
		double depo=Double.valueOf(deposit);
		double newrema=rema1-depo;
		//String pfee = request.getParameter("pfee");
		//double pfee1 = Double.valueOf(pfee);
		//double pfee2 = pfee1+depo;
		
		ConnectionPoll cp = new ConnectionPoll();
		cp.connect();
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String date = df.format(d).toString();
		
		try
		{
			PreparedStatement ps=cp.con.prepareStatement("insert into deposit (phone,cate,amount,date,s_id) values (?,?,?,?,?)");
			ps.setString(1, phone);
			ps.setString(2, cate);
			ps.setDouble(3, depo);
			ps.setString(4, date);
			ps.setInt(5, id1);
			ps.executeUpdate();
			
			PreparedStatement ps1=cp.con.prepareStatement("update student set remaining_fee=? where id='"+id1+"'");
			ps1.setDouble(1, newrema);
			ps1.executeUpdate();
			response.sendRedirect("afterdepositprint.jsp?id="+id1+"");
			
/*			PreparedStatement ps2=cp.con.prepareStatement("update student set remaining_fee=? where id='"+id1+"'");
			ps2.setDouble(1, pfee2);
			ps.executeUpdate();
			response.sendRedirect("student_details.jsp");*/			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



}
