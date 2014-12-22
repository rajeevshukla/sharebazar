<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/common.jsp"%>
<c:if test="${empty session.name}">
	<c:redirect url="../common/index.jsp"></c:redirect>
</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
	
</script>
<style type="text/css">
</style>
<title>Manage Funds</title>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function displayScreen() {

		var value = document.getElementById("credit").checked;

		if (value) {

			document.getElementById("screen").style.display = "block";

		} else {

			document.getElementById("screen").style.display = "none";

		}

	}
	function block() {

		document.getElementById("screen").style.display = "none";

	}

	$(document).ready(function() {

		$('input[name="cvvNo"]').keypress(function() {
			if (this.value.length >= 3) {
				return false;
			}
		});
		
		$('input[name="pin"]').keypress(function() {
			if (this.value.length >= 4) {
				return false;
			}
		});
		$('input[name="cardNumber"]').keypress(function() {
			if (this.value.length >= 16) {
				return false;
			}
		});

	});
</script>

</head>

<body onload="block();">
	<%-- 	<jsp:include page="../common/headerHome.jsp"></jsp:include> --%>
	<jsp:include page="../customer/customerHeader.jsp"></jsp:include>
	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">

				<div style="padding-left: 30px; font-size: 13px;">

					<h4 class="commentformTitle" style="padding: 20px;">Balance
						and Share details :</h4>

					<div style="float: left;">
						Your available balance is : <b>${balance}</b>
					</div>
					<div align="right" style="margin-right: 60px;">
						Your available shares are: <b>${share}</b>
					</div>
					<h4 class="commentformTitle"
						style="padding-left: 20px; font-size: 13px;">
						<input type="checkbox" name="credit" value="credit" id="credit"
							onchange="displayScreen()"> Credit your balance
					</h4>
					<br>
					<div id="screen">
						<form action="addFund.action" method="post">


							<table style="font-size: 13px;">
								<tbody>
									<tr>
										<td colspan="2"><h4 class="commentformTitle"
												style="font-size: 10px;">Please fill the payment
												Details....</h4></td>

									</tr>
									<tr>
										<td class="row"><label for="visitorFirstName">CardHolders
												Name </label></td>
										<td class="row"><input type="text" id="loginName"
											name="cardHolderName" class="short"
											placeholder="Name appear as on card" required="" /></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Card
												Number</label></td>
										<td class="row"><input type="number" name="cardNumber"
											class="short" placeholder="7897797878799" required=""
											size="16" maxlength="16" /></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Card
												Type</label></td>
										<td class="row"><select name="cardType" required="">
												<option>Select card type</option>
												<option value="master">Master</option>
												<option value="credit">Credit</option>
												<option value="visa">Visa</option>
										</select>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Expiry
												Date</label></td>
										<td class="row"><select name="month">
												<option selected="selected">Month</option>
												<option value="jan">Jan</option>
												<option value="feb">Feb</option>
												<option value="march">Mar</option>
												<option value="april">Aprl</option>
												<option value="may">May</option>
												<option value="june">June</option>
												<option value="july">Jul</option>
												<option value="aug">Aug</option>
												<option value="sept">Sept</option>
												<option value="oct">Oct</option>
												<option value="nov">Nov</option>
												<option value="dec">Dec</option>
										</select> <select name="Year">
												<option selected="selected">Year</option>
												<option value="2012">2012</option>
												<option value="2013">2013</option>
												<option value="jan">2014</option>
												<option value="jan">2015</option>
												<option value="jan">2016</option>
												<option value="jan">2017</option>
												<option value="jan">2018</option>
												<option value="jan">2019</option>
												<option value="jan">2020</option>
										</select></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Cvv
												no</label></td>
										<td class="row"><input type="password" name="cvvNo"
											class="short" placeholder="***" required="" maxlength="3"
											size="3" style="width: 50px;" /></td>
									</tr>

									<tr>
										<td class="row"><label for="visitorLastName">Pin
												no</label></td>
										<td class="row"><input type="password" name="pin"
											class="short" placeholder="****" required="" maxlength="4"
											size="4" style="width: 50px;" /></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">amount</label>
										</td>
										<td class="row"><input type="text" name="amount"
											class="short" placeholder="0000.000" required=""
											style="width: 100px;" /></td>
									</tr>
									<tr>
										<td class="row">&nbsp;
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

										<td class="row"><input id="submitBtn" type="submit"
											value="pay" />&nbsp;&nbsp;&nbsp;&nbsp;<input id="submitBtn"
											type="reset" value="Reset" /></td>
								</tbody>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
