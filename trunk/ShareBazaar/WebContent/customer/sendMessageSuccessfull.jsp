<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<c:if test="${empty session.name}">
	<c:redirect url="index.jsp"></c:redirect>


</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>


<title>update Successfull</title>


<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body onload="backDisable();">
	<jsp:include page="../common/headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include>


	<div class="abc" style="float: left;">
		<h4 class="commentformTitle"
			style="font-size: 15px; margin-left: 30px; margin-top: 70px;">Your
			message has been Sent successfully........</h4>
	</div>




	<jsp:include page="../common/footerHome.jsp"></jsp:include>
</body>
</html>
