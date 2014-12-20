<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
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

.error {
 color: red;

}
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

				<c:if test="${ not empty errorMsg}">


					<span style="color: red;">${errorMsg}</span>
					<c:set var="errorMsg" value="" scope="session"></c:set>

				</c:if>



				<form action="changePassword.action" class="text" method="post">
					<h4 class="commentformTitle">Change Password .....</h4>
					<div style="padding: 20px;">
					   
					    <s:fielderror name="errorMsg" cssClass="error"></s:fielderror>
					  
						<table>
							<tbody>
								<tr>
									<td class="row"><label for="visitorFirstName">Current
											Password</label></td>
									<td class="row"><input type="password" id="visitorFirstName"
										name="currentPassword" class="short" required="" tabindex="1" /></td>

								</tr>
								<tr>
									<td class="row"><label
										for="visitorLastName">New Password</label></td>
									<td class="row"><input type="password" name="newPassword"
										id="visitorLastName"  class="short" required="" tabindex="2" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">Re
											Password</label></td>
									<td class="row"><input type="password" 
										name="rePassword"   class="short" required=""
										tabindex="3" /></td>

								</tr>
								<tr>
									<td class="row" style="padding-left: 80px;"><input
										id="submitBtn" type="submit" value="Update" tabindex="16" /></td>
									<td class="row" style="padding-left: 80px;"><input
										id="resetButton" type="reset" value="reset" tabindex="17" /></td>
								</tr>
							</tbody>
						</table>

					</div>
				</form>
			</div>
		</div>
	</div>

	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
