<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<!DOCTYPE HTML >
<html lang="en">
<head>

<title>Logout</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log out</title>
</head>
<body>
	<jsp:include page="../common/commonHeader.jsp"></jsp:include>
	<div class="body2">
		<div class="main">
			<!-- content -->
			<section id="content">
			<div class="marg_top wrapper">
				<article class="col3">
				<p>
				<h2 class="bigHeading">Logout Successfully</h2>
				<p>
					<%
						session.invalidate();
					%>
					<a href="./common/index.jsp">Click here </a>to
					go home page
				<p>
					<br> <br>
				</p>
				</article>
			</section>
		</div>
	</div>
	<jsp:include page="../common/commonFooter.jsp"></jsp:include>
</body>
</html>
