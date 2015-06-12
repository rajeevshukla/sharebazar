package vision;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poll.ConnectionPoll;

public class DoStudent extends HttpServlet {

	
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			String name = request.getParameter("name");
			String fname = request.getParameter("fname");
			String phone = request.getParameter("phone");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String cate = request.getParameter("cate");
			String fee = request.getParameter("fee");
			double fee1 = Double.valueOf(fee);
			String paidfee = request.getParameter("paidfee");
			double paidfee1 = Double.valueOf(paidfee);
			String address = request.getParameter("address");
			double remain_fee=fee1-paidfee1;
			
			ConnectionPoll cp = new ConnectionPoll();
			cp.connect();
			Date d=new Date();
			SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
			String date=sf.format(d).toString();
			
			try{
				PreparedStatement ps=cp.con.prepareStatement("insert into student (name,fname,phone,email,gender,cate,fee,pfee,address,date,remaining_fee) values (?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, fname);
				ps.setString(3, phone);
				ps.setString(4, email);
				ps.setString(5, gender);
				ps.setString(6, cate);
				ps.setDouble(7, fee1);
				ps.setDouble(8, paidfee1);
				ps.setString(9, address);
				ps.setString(10, date);
				ps.setDouble(11, remain_fee);
				ps.executeUpdate();
				response.sendRedirect("student_reg.jsp?name="+name+"&phone="+phone+"");
			}
			catch (Exception e) {
				e.printStackTrace();
			}

	}


}
