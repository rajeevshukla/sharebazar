<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@include file="../common/common.jsp"%>
<c:if test="${empty session.name}">
	<c:redirect url="../common/index.jsp"></c:redirect>
</c:if>
<html lang="en">
<head>
<style type="text/css">
</style>


<title>Shareholder details </title>

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
	<jsp:include page="../company/companyHeader.jsp"></jsp:include>


	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">

				<hr style="margin-right: 20px;">
				<div>
					<a href="${shareHolderInfoBackURL}" style="text-decoration: none;">Back
					</a><font
						style="color: navy; font-weight: bold; font-style: oblique; margin-left: 300px;">
						Shareholder Details</font>
				</div>
				<hr style="margin-right: 20px;">
				<div style="width: 740px; height: 500px; margin: 20px;">


					<div class="LeftInnerDiv">

						Name:
						<s:property value="firstName" />&nbsp;<s:property value="lastName" />

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
					Mobile:
						<s:property value="mobileNo" />
					</div>


				<%-- 	<div class="RightInnerDiv" style="height: 200px;">
						About Company :
						<s:property value="aboutCompany" />
					</div>
 --%>

				</div>
			</div>

		</div>
	</div>
	<jsp:include page="../company/companyFooter.jsp"></jsp:include>
</body>
</html>
