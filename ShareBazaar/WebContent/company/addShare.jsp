<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="../common/common.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<script type="text/javascript">
	$(document).ready(
			function() {

				var fullDate = new Date()
				console.log(fullDate);
				//Thu May 19 2011 17:25:38 GMT+1000 {}
				 
				//convert month to 2 digits
				var twoDigitMonth = ((fullDate.getMonth().length+1) === 1)? (fullDate.getMonth()+1) : '0' + (fullDate.getMonth()+1);
				 
				var currentDate = fullDate.getDate() + "/" + twoDigitMonth + "/" + fullDate.getFullYear();
				
				document.getElementById("dateOfIssue").value = currentDate;
				document.getElementById("date").value = currentDate;

			});
</script>

<title>Add Share</title>
</head>
<%@include file="../common/commonHeader.jsp"%>
<div class="body2">
	<div class="main">
		<div class="marg_top wrapper">
<s:token ></s:token>
			<form action="companyRegister.action" class="text" method="post">
				<input type="hidden" name="companyName" value="${param.companyName}">
				<input type="hidden" name="companyLogin"
					value="${param.companyLogin}"> <input type="hidden"
					name="address" value="${param.address}"> <input
					type="hidden" name="city" value="${param.city}"> <input
					type="hidden" name="state" value="${param.state}"> <input
					type="hidden" name="country" value="${param.country}"> <input
					type="hidden" name="pin" value="${param.pin}"> <input
					type="hidden" name="phone" value="${param.phone}"> <input
					type="hidden" name="mobile" value="${param.mobile}"> <input
					type="hidden" name="email" value="${param.email}"> <input
					type="hidden" name="password" value="${param.password}"> <input
					type="hidden" name="rePassword" value="${param.rePassword}">
				<input type="hidden" name="aboutCompany"
					value="${param.aboutCompany}"> <input type="hidden"
					name="fax" value="${param.fax}"> <input type="hidden"
					name="dateOfIssue" id="dateOfIssue" />
				<h4 class="commentformTitle">Please fill the Share Details...</h4>
				<div style="padding: 20px;">


					<table>
						<tbody>

							<tr>
								<td class="row"><label for="visitorFirstName">company
										Name</label></td>
								<td class="row"><input type="text" name="companyName"
									class="short" value="${param.companyName}" disabled="disabled" />
								</td>

							</tr>
							<tr>
								<td class="row"><label for="visitorLastName"> No of
										shares (issued)</label></td>
								<td class="row"><input type="text" id="visitorLastName"
									name="noOfShare" class="short" required="" />&nbsp;&nbsp;<font
									color="red" size="1">(Becarefull)</font></td>

							</tr>
							<tr>
								<td class="row"><label for="visitorLastName">Rate
										per Share</label></td>
								<td class="row"><input type="text" name="ratePerShare"
									class="short" required="" />Rs.</td>

							</tr>
							<tr>

								<td class="row"><label for="visitorLastName">Type</label></td>
								<td class="row"><select name="shareType">
										<option selected="selected">Select Share Type</option>
										<option value="ordinary">Ordinary</option>
										<option value="equity">Equity</option>
										<option value="preferential">Preferential</option>


								</select>
							</tr>
							<tr>

								<td class="row"><label for="visitorLastName">Date
										Of Issue</label></td>
								<td class="row"><input type="text" id="date"
									name="dateOfIssue" class="short" disabled="disabled"
									style="width: 100px;" /></td>

							</tr>
							<tr>

								<td class="row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td class="row"><input type="submit" value="submit" /> <!-- <input
									type="reset" value="Reset" /> --></td>

							</tr>

						</tbody>
					</table>
				</div>
			</form>
		</div>
	</div>
</div>
<%@include file="../common/commonFooter.jsp"%>
</body>
</html>
