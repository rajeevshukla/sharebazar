<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<c:if test="${empty session.name}">
	<c:redirect url="index.jsp"></c:redirect>


</c:if>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>


<title>Buy success</title>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
.RightInnerDiv {
	float: left;
	width: 340px;
	padding-right: 10px;
	padding-left: 20px;
	padding-top: 10px;
	font-size: 15px;
	height: 50px;
	-moz-border-radius: 10px;
	-webkit-box-shadow: 0 0 10px #ccc;
	overflow: auto;
}

.LeftInnerDiv {
	float: left;
	width: 340px;
	font-size: 15px;
	padding-left: 20px;
	padding-top: 10px;
	padding-right: 10px;
	height: 50px;
	-moz-border-radius: 10px;
	-webkit-box-shadow: 0 0 10px #ccc;
	overflow: auto;
}

.LeftInnerDiv:hover {
	background-color: #ECF6F5;
}

.RightInnerDiv:HOVER {
	background-color: #ECF6F5;
}
</style>
</head>

<body>
	&nbsp;
	<jsp:include page="headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include>


	<div class="abc" style="float: left; height: 700px;">

		<hr style="margin-right: 20px;">
		<div>
			<a href="companyDetailGet.action" style="text-decoration: none;">Back
			</a><font
				style="color: navy; font-weight: bold; font-style: oblique; margin-left: 300px;">
				Company Details</font>
		</div>
		<hr style="margin-right: 20px;">
		<div style="width: 740px; height: 500px; margin: 20px;">


			<div class="LeftInnerDiv">

				Name:
				<s:property value="companyName" />

			</div>


			<div class="RightInnerDiv">
				Email :
				<s:property value="email" />

			</div>

			<div class="LeftInnerDiv">
				Address :
				<s:property value="address" />

			</div>


			<div class="RightInnerDiv">
				City :
				<s:property value="city" />

			</div>

			<div class="LeftInnerDiv">

				State :
				<s:property value="state" />

			</div>


			<div class="RightInnerDiv">
				Country :
				<s:property value="country" />

			</div>

			<div class="LeftInnerDiv">
				Pin :
				<s:property value="pin" />
			</div>


			<div class="RightInnerDiv">
				Phone :
				<s:property value="phone" />
			</div>
			<div class="LeftInnerDiv">
				Mobile:
				<s:property value="mobile" />
			</div>


			<div class="RightInnerDiv" style="height: 200px;">
				About Company :
				<s:property value="aboutCompany" />
			</div>


		</div>
	</div>




	<jsp:include page="footerHome.jsp"></jsp:include>
</body>
</html>
