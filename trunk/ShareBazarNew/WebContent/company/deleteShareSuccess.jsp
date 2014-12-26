<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/common.jsp"%>
<c:if test="${empty session.name}">
	<c:redirect url="index.jsp"></c:redirect>


</c:if>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>
<title>Delete share success</title>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>

	<jsp:include page="../company/companyHeader.jsp"></jsp:include>
	
	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">
				
				<font style="color: green; font-size: 13px; font-style: oblique;">
                   Your share has been deleted successfully !. 
				</font>
				
			</div>
		</div>
	</div>
	
	<jsp:include page="../company/companyFooter.jsp"></jsp:include>
</body>
</html>
