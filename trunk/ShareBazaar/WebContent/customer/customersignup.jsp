<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register as a Customer</title>
<link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<jsp:include page="../common/leftpan.jsp"></jsp:include>
	<div class="rightPan">
		<form action="customerRegister.action" class="text" method="post">
			<s:token></s:token>
			<h4 class="commentformTitle">Please fill the following
				Details...</h4>
			<div style="padding: 20px;">


				<table>
					<tbody>

						<tr>
							<td class="row"><label for="visitorFirstName">First
									Name</label></td>
							<td class="row"><input type="text" id="visitorFirstName"
								name="firstName" class="short" placeholder="rajeev" required=""
								tabindex="1" /></td>
							<td class="row" style="padding-left: 40px;"><label
								for="visitorLastName">Country</label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="country" class="short" placeholder="country name "
								required="" tabindex="10" /></td>
						</tr>
						<tr>
							<td class="row"><label for="visitorLastName">Last
									Name</label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="lastName" class="short" placeholder="Shukla" required=""
								tabindex="2" /></td>
							<td class="row" style="padding-left: 40px;"><label
								for="visitorLastName">Pin</label></td>
							<td class="row"><input type="number" id="visitorLastName"
								min="100000" max="999999" name="pin" class="short"
								placeholder="272182" required="" tabindex="11" /></td>
						</tr>
						<tr>
							<td class="row"><label for="visitorLastName">Login
									Name</label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="loginName" class="short" placeholder="rajeev123"
								required="" tabindex="3" /></td>
							<td class="row" style="padding-left: 40px;"><label
								for="visitorLastName">DOB</label></td>
							<td class="row"><input type="date" id="visitorLastName"
								name="dob" class="short" placeholder="dae of birth" required=""
								tabindex="12" /></td>
						</tr>
						<tr>

							<td class="row"><label for="visitorLastName">Password</label></td>
							<td class="row"><input type="password" id="visitorLastName"
								name="password" class="short" placeholder="************"
								required="" tabindex="4" /></td>
							<td class="row" style="padding-left: 40px;"><label
								for="visitorLastName">Occupation</label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="occupation" class="short" placeholder="occupation"
								required="" tabindex="13" /></td>
						</tr>
						<tr>

							<td class="row"><label for="visitorLastName"> <b>Re-password</b></label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="rePassword" class="short" placeholder="************"
								required="" tabindex="5" /></td>

							<td class="row" style="padding-left: 40px;"><label
								for="visitorLastName">Income Group</label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="incomeGroup" class="short" placeholder="income"
								required="" tabindex="14" /></td>
						</tr>
						<tr>

							<td class="row"><label for="visitorLastName">E-mail</label></td>
							<td class="row"><input type="email" id="visitorLastName"
								name="email" class="short"
								placeholder="rajeev1.miracle@gmail.com" required="" tabindex="6" /></td>
							<td class="row" style="padding-left: 40px;"><label
								for="visitorLastName">Mobile no.</label></td>
							<td class="row"><input type="tel" id="visitorLastName"
								name="mobileNo" class="short" placeholder="7827679444"
								required="" tabindex="15" /></td>
						</tr>
						<tr>

							<td class="row"><label for="visitorLastName">
									Address </label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="address" class="short" placeholder="address will be here"
								required="" tabindex="7" /></td>
							<td class="row" style="padding-left: 80px;"><input
								id="submitBtn" type="submit" value="Submit" tabindex="16" /></td>

							<td class="row" style="padding-left: 80px;"><input
								id="resetButton" type="reset" value="reset" tabindex="17" /></td>
						</tr>
						<tr>

							<td class="row"><label for="visitorLastName"> City </label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="city" class="short" placeholder="City name here"
								required="" tabindex="8" /></td>
						</tr>
						<tr>

							<td class="row"><label for="visitorLastName">State</label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="state" class="short" placeholder="state" required=""
								tabindex="9" /></td>
						</tr>



					</tbody>
				</table>

			</div>
		</form>



	</div>
	<jsp:include page="../common/footer.jsp" flush="true"></jsp:include>
</body>
</html>