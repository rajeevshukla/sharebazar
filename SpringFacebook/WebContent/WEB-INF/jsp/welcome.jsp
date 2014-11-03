<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="social"
	uri="http://www.springframework.org/spring-social/social/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	welcome ..

<%-- 	<security:authentication property="principal.username" />
 --%>
 
	<social:connected provider="facebook">
    You are connected with facebook
    </social:connected>
	
   <social:notConnected provider="facebook">
       you are not connected with facebook
   </social:notConnected>
 
  <form action="connect/facebook.htm" method="delete">
   <input type="submit" value="Logout with facebook">
  </form>
<a href="j_spring_security_logout">Logout</a>
</body>
</html>