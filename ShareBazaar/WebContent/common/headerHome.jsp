<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'headerHome.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../style/header.css">


</head>

<body>
	<div class="header" style="height: 100px;">
		<img src="../images/homelogo.png" alt=" image not found " height="100px"
			width="200px;" /> <img src="images/graph.png"
			alt=" image not found " height="100px" width="200px;" align="right" />
	</div>
	<div class="header1"
		style="height: 30px; width: 1030px; padding-left: 10px; padding-top: 10px;">
		<div style="width: 250px;; float: left">
			<font style="font-size: medium; color: maroon;">Welcome &nbsp;
				${session.name } </font>
		</div>
		<div style="float: left; width: 700px; height: 30px;">
			<marquee behavior="alternate">Dollar rate has been bounced
				up </marquee>
		</div>
		<div style="float: right; padding-right: 10px;">
			<a href="../common/logout.jsp">Logout</a>
		</div>
	</div>

</body>
</html>
