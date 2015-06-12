<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="poll.ConnectionPoll"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Student Delete</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%
  		String id = request.getParameter("id");
  		ConnectionPoll cp = new ConnectionPoll();
  		cp.connect();
  		Statement st = cp.con.createStatement();
  		PreparedStatement ps = cp.con.prepareStatement("delete from student where id = "+id+"");
  		ps.executeUpdate();
  		response.sendRedirect("student_details.jsp");
   %>
   	 
  </body>
</html>
