package vision;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import poll.ConnectionPoll;
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	String dbUser=null;
	String dbPass=null;
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		ConnectionPoll cp=new ConnectionPoll();
		cp.connect();
		try{
		Statement st=cp.con.createStatement();
		ResultSet rs=st.executeQuery("select * from login where user='"+user+"' and pass='"+pass+"'");
		while(rs.next()){
			dbUser=rs.getString("user");
			dbPass=rs.getString("pass");
		}
		}
		catch(Exception e){e.printStackTrace();}
		if(dbUser.equalsIgnoreCase(user) && dbPass.equalsIgnoreCase(pass)){
			HttpSession ses=request.getSession(true);
			ses.setAttribute("user", user);
			response.sendRedirect("dashboard.jsp");
		}
		else{
			response.sendRedirect("error.html");
		}		


	}




}
