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

<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">

<div style="float: left;">
	<script src="//www.gmodules.com/ig/ifr?url=http://hosting.gmodules.com/ig/gadgets/file/100012867032945674529/XSensex.xml&amp;up_refresh_secs=600&amp;synd=open&amp;w=580&amp;h=435&amp;title=Indian+Stock+Market&amp;border=%23ffffff%7C3px%2C1px+solid+%23999999&amp;output=js"></script>
</div>
<div>
<script src="//www.gmodules.com/ig/ifr?url=http://hosting.gmodules.com/ig/gadgets/file/100343953499244689209/LiveForeignExchangeRatesTableWithCharts.xml&amp;synd=open&amp;w=250&amp;h=480&amp;title=Live+Foreign+Exchange+Rates+Table+With+Charts+&amp;border=%23ffffff%7C3px%2C1px+solid+%23999999&amp;output=js"></script>

</div>
 </div>
 </div>
 </div>

	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
