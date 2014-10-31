<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="social" uri="http://www.springframework.org/spring-social/social/tags" %>
    <%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <social:notConnected provider="facebook">
    You are not logged in yet with facebook
    
   </social:notConnected>
  <sec:authorize access="isAuthenticated()">
    welcome authenticated user
  </sec:authorize>
  
   <social:connected provider="facebook">
      welcome to facebook  you have successfully logged in 
   
   </social:connected>
</body>
</html>