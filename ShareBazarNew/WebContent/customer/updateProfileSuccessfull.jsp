<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/common.jsp"%>
<c:if test="${empty session.name}">
	<c:redirect url="../common/index.jsp"></c:redirect>
</c:if>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
.body2 {
	min-height: 400px;
}
</style>


<title>Home</title>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body >
	<%-- <jsp:include page="../common/headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include> --%>

	<jsp:include page="../customer/customerHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">
			
					<h4 class="commentformTitle"
						style="font-size: 15px; margin-left: 30px; margin-top: 70px;">Profile
						updated successfully..........</h4>
				
			</div>
		</div>
	</div>


	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
