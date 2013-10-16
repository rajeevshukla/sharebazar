<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Contact us</title>
<link href="../style/header.css" rel="stylesheet" type="text/css" />

</head>

<body>

	<jsp:include page="../common/header.jsp"></jsp:include>

	<jsp:include page="../common/leftpan.jsp"></jsp:include>

	<div class="rightPan">

		<div style="width: 80%; margin-left: 30px; margin-top: 60px;">
			<form id="contact_us.action" method="post">
				<table>
					<tbody>
						<tr>
							<td colspan="2"><h4 class="commentformTitle">Contact Us</h4>
								<input type="hidden" id="postId" name="postId" value="11" /></td>
						</tr>
						<tr>
							<td class="row"><label for="visitorFirstName">First
									Name</label></td>
							<td class="row"><input type="text" id="visitorFirstName"
								name="visitorFirstName" class="short" placeholder="John"
								required="" /></td>
						</tr>
						<tr>
							<td class="row"><label for="visitorLastName">Last
									Name</label></td>
							<td class="row"><input type="text" id="visitorLastName"
								name="visitorLastName" class="short" placeholder="Smith"
								required="" /></td>
						</tr>
						<tr>
							<td class="row"><label for="visitorEmail">Email</label></td>
							<td class="row"><input type="email" id="visitorEmail"
								name="visitorEmail" placeholder="jsmith@yahoo.com" required="" />
								&nbsp; <!--<input type="button" id="verifyVisitorBtn"
						name="verifyVisitorBtn" value="Verify" onclick="verifyVisitor();"
						style="font-size: 10pt;"> <img id="verifyVisitorImg"
						src="./Html5 File Upload with Progress On Matlus_files/ok.png"
						alt="Visitor Verified"
						style="display: none; vertical-align: middle;"> <input
						type="hidden" id="visitorIsVerified" name="visitorIsVerified"
						value="false">  --></td>
						</tr>


						<tr>
							<td class="row" style="vertical-align: top;"><label
								for="visitorComment">Your<br>Comment </label></td>
							<td class="row"><textarea id="visitorComment"
									name="visitorComment" rows="6" cols="50" required=""></textarea></td>
						</tr>
					</tbody>
				</table>
				<input id="submitBtn" type="submit" value="Submit" /> <span
					id="submitConfirm" style="display: none;"> <img
					id="submitConfirmImg"
					src="./Html5 File Upload with Progress On Matlus_files/ok.png"
					alt="Your Comment has been submitted"
					style="vertical-align: middle;" /> Your Comment has been submitted.
					Thankyou!
				</span>
			</form>
		</div>
	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
