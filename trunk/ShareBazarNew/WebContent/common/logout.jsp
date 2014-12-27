<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

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
<title>Security Alert</title>

<script type="text/javascript">
	$(document).ready(function() {

		$("#dialog").dialog({
			autoOpen : false,
			model : true,
			height : 300,
			width : 400,
			resizable : false,

		/* buttons: [ { text: "Ok", click: function() { $( this ).dialog( "close" ); } } ] */

		});

		$("#dialog").parent("div").css("top", "160px;");

		$(function() {
			$("#tabs").tabs();
		});
	});
</script>

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
					Logout Successfully . <a href="./common/index.jsp">Click here </a>to
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
