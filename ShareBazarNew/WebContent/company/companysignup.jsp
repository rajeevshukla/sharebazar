<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register As a company</title>
</head>

<%-- <jsp:include page="../common/header.jsp"></jsp:include>
	<jsp:include page="../common/leftpan.jsp"></jsp:include> --%>
<%@include file="../common/commonHeader.jsp"%>
<div class="body2">
	<div class="main">
		<div class="marg_top wrapper">
			<form action="addShare.jsp" class="text" method="post">
				<s:token></s:token>
				<h4 class="commentformTitle">Please fill the following
					Details...</h4>
				<div style="padding: 20px; width: 800px; height: 400px;">
					<div style="width: 380px; height: 400px; float: left;">
						<table>
							<tbody>
								<tr>
									<td class="row"><label for="visitorFirstName">Company
											Name</label></td>
									<td class="row"><input type="text" name="companyName"
										class="short" placeholder="Miracle Technologies" required="" /></td>
								</tr>
								<tr>
									<td class="row"><label for="visitorLastName">Login
											Name</label></td>
									<td class="row"><input type="text" name="companyLogin"
										class="short" placeholder="Miracle123" required="" /></td>
								</tr>
								<tr>
									<td class="row"><label for="visitorLastName">Password</label></td>
									<td class="row"><input type="password" name="password"
										class="short" placeholder="************" required="" /></td>

								</tr>
								<tr>
									<td class="row"><label for="visitorLastName"> <b>Re-password</b></label></td>
									<td class="row"><input type="password" name="rePassword"
										class="short" placeholder="************" required="" /></td>
								</tr>
								<tr>
									<td class="row"><label for="visitorLastName">E-mail</label></td>
									<td class="row"><input type="email" name="email"
										class="short" placeholder="rajeev1.miracle@gmail.com"
										required="" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">
											Address </label></td>
									<td class="row"><input type="text" name="address"
										class="short" placeholder="address will be here" required="" /></td>

								</tr>
								<tr>

									<td class="row"><label for="visitorLastName"> City
											-</label></td>
									<td class="row"><input type="text" name="city"
										class="short" placeholder="City name here" required="" /></td>
								</tr>


								<tr>

									<td class="row"><label for="visitorLastName">State</label></td>
									<td class="row"><input type="text" name="state"
										class="short" placeholder="State name here" required="" /></td>
								</tr>
								<tr>

									<td class="row"><label for="visitorLastName">Country</label></td>
									<td class="row"><input type="text" name="country"
										class="short" placeholder="country" required="" /></td>
								</tr>


							</tbody>
						</table>
					</div>







					<div style="width: 380px; float: left;">

						<table>
							<tbody>

								<tr>

									<td class="row"><label for="visitorLastName">pin</label></td>
									<td class="row"><input type="text" name="pin"
										class="short" placeholder="272182" required="" /></td>
								</tr>


								<tr>
									<td class="row"><label for="visitorLastName">Fax
											no</label></td>
									<td class="row"><input type="tel" name="fax" class="short"
										placeholder="012024040102" required="" /></td>
								</tr>

								<tr>
									<td class="row"><label for="visitorLastName">Phone
											no </label></td>
									<td class="row"><input type="tel" name="phone"
										class="short" placeholder="01204040101" required="" /></td>
								</tr>
								<tr>
									<td class="row"><label for="visitorLastName">Mobile
											no</label></td>
									<td class="row"><input type="tel" name="mobile"
										class="short" placeholder="7827679444" required="" /></td>
								</tr>

								<tr>
									<td class="row" style="vertical-align: middle;"><label
										for="visitorComment">About <br>company
									</label></td>
									<td class="row"><textarea name="aboutCompany" rows="6"
											cols="20" placeholder="Explain here about your company "
											required=""></textarea></td>
								</tr>

								<tr>


									<td class="row" style="margin-left: 20px;"><input
										id="submitBtn" type="submit" value="Submit" tabindex="16" /></td>

									<td class="row" style="margin-left: 20px;"><input
										id="resetButton" type="reset" value="reset" tabindex="17" /></td>
								</tr>

							</tbody>
						</table>


					</div>
				</div>
			</form>
		</div>
		
	</div>
</div>

<jsp:include page="../common/commonFooter.jsp"></jsp:include>
</body>
</html>