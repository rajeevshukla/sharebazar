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

<body onload="backDisable();">
	<%-- <jsp:include page="../common/headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include> --%>

	<jsp:include page="../company/companyHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">

             <c:if test="${ not empty errorMsg}">
              
              
              <span style="color: red;">${errorMsg}</span>
              <c:set var="errorMsg" value="" scope="session"></c:set>
             
             </c:if>

				<c:set value="${sessionScope.bean}" var="bean" scope="session"></c:set>
				<!--   Getting the object from the session and setting it to bean name -->







				<form action="updateProfile.action" class="text" method="post">
					<h4 class="commentformTitle">Update your details .....</h4>
					<div style="padding: 20px;">



						<table>
							<tbody>

								<tr>
									<td class="row"><label for="visitorFirstName">Company
											Name</label></td>
									<td class="row"><input type="text" id="visitorFirstName"
										name="firstName" class="short" value="${bean.firstName}"
										required="" tabindex="1" /></td>
									<td class="row" style="padding-left: 40px;"><label
										for="visitorLastName">Country</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="country" class="short" value="${bean.country}"
										required="" tabindex="10" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">Email</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="dob" class="short" value="${bean.dob}" required=""
										tabindex="12" /></td>
									<td class="row" style="padding-left: 80px;"><input
										id="submitBtn" type="submit" value="Update" tabindex="16" /></td>
									<td class="row" style="padding-left: 80px;"><input
										id="resetButton" type="reset" value="reset" tabindex="17" /></td>
								</tr>
								<tr>
									<td class="row"><label for="visitorLastName">Address</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="occupation" class="short" value="${bean.occupation }"
										required="" tabindex="13" /></td>
								</tr>
								<tr>



									<td class="row"><label for="visitorLastName">City
											</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="incomeGroup" class="short" value="${bean.incomeGroup }"
										required="" tabindex="14" /></td>

								</tr>
								<tr>
									<td class="row"><label for="visitorLastName">State
											</label></td>
									<td class="row"><input type="tel" id="visitorLastName"
										name="mobileNo" class="short" value="${bean.mobileNo }"
										required="" tabindex="15" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">
											Country </label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="address" class="short" value="${bean.address }"
										required="" tabindex="7" /></td>



								</tr>
								<tr>

									<td class="row"><label for="visitorLastName"> Pin
									</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="city" class="short" value="${bean.city }" required=""
										tabindex="8" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">Phone</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="state" class="short" value="${bean.state }" required=""
										tabindex="9" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">Fax</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="state" class="short" value="${bean.state }" required=""
										tabindex="10" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">Mobile</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="state" class="short" value="${bean.state }" required=""
										tabindex="11" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">About Country</label></td>
									<td class="row"><input type="text" id="visitorLastName"
										name="state" class="short" value="${bean.state }" required=""
										tabindex="12" /></td>
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
