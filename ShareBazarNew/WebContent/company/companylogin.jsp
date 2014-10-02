<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Login</title>
<script type="text/javascript">

	function backDisable() {
		window.history.forward(1);
 
	}
	 setTimeout("backDisable()", 0);
	 
</script>
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<jsp:include page="../common/leftpan.jsp"></jsp:include>
	<div class="rightPan">

		<div class="text">
			<form id="contact_us.action" method="post" style="width: 400px;">
				<table>
					<tbody>
						<tr>
							<td colspan="2"><h4 class="commentformTitle">Login As
									Company....</h4> <input type="hidden" id="postId" name="postId"
								value="11" /></td>

						</tr>
						<tr>
							<td class="row"><label for="visitorFirstName">Login
									Name</label></td>
							<td class="row"><input type="text" id="loginName"
								name="loginName" class="short" placeholder="miracle123"
								required="" /></td>
						</tr>
						<tr>
							<td class="row"><label for="visitorLastName">MemberShip
									Id</label></td>
							<td class="row"><input type="text" id="memberShipId"
								name="memberShipId" class="short" placeholder="C000028"
								required="" /></td>
						</tr>
						<tr>
							<td class="row"><label for="visitorLastName">Password</label></td>
							<td class="row"><input type="text" id="password"
								name="password" class="short" placeholder="***********"
								required="" /></td>
						</tr>



					</tbody>
				</table>
				<input id="submitBtn" type="submit" value="Submit" />

			</form>

		</div>


	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>