<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make payment</title>
</head>
<body>
	c<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="leftpan.jsp"></jsp:include>
	<div class="rightPan">

		<div class="text">
			Dear Customer, In order to become an active member of our application
			and gain access to the services provided, you need to pay an amount
			of Rs 1000/-.


			<form action="companyPayment.action" method="post"
				style="width: 400px;">
				<table>
					<tbody>
						<tr>
							<td colspan="2"><h4 class="commentformTitle">Please
									fill the payment Details....</h4> <input type="hidden" id="postId"
								name="postId" value="11" /></td>

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
							<td class="row"><input type="text" name="cardNumber"
								class="short" placeholder="7897797878799" required="" size="16" />
							</td>
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
							</select> <select name="year">
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
							<td class="row"><label for="visitorLastName">Cvv no</label>
							</td>
							<td class="row"><input type="password" name="cvvNo"
								class="short" placeholder="***" required="" size="3"
								style="width: 50px;" /></td>
						</tr>

						<tr>
							<td class="row"><label for="visitorLastName">Pin no</label>
							</td>
							<td class="row"><input type="password" name="pin"
								class="short" placeholder="****" required="" size="4"
								style="width: 50px;" /></td>
						</tr>
						<tr>
							<td class="row">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

							<td class="row"><input id="submitBtn" type="submit"
								value="pay" />&nbsp;&nbsp;&nbsp;&nbsp;<input id="submitBtn"
								type="reset" value="Reset" /></td>
					</tbody>
				</table>

			</form>

		</div>


	</div>
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>