<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>


<title>${session.name }'s Home</title>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body onload="backDisable();">
	<jsp:include page="../common/headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include>


	<div class="abc" style="float: left;">Account Setting</div>




	<jsp:include page="../common/footerHome.jsp"></jsp:include>
</body>
</html>
