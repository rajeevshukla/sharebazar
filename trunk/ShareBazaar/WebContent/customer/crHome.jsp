<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/common.jsp" %>
<c:if test="${empty session.name}">
	<c:redirect url="../common/index.jsp"></c:redirect>


</c:if>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>


<title>Home</title>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body onload="backDisable();">
	<%-- <jsp:include page="../common/headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include> --%>

<jsp:include page="../customer/customerHeader.jsp"></jsp:include>

	



	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
