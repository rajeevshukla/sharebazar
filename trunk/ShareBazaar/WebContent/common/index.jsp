<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="../style/header.css">
</head>
<body>

	<jsp:include page="../common/header.jsp"></jsp:include>

	<!-- Side bar here  -->
	<jsp:include page="../common/leftpan.jsp"></jsp:include>
	<div class="rightPan">
		<div style="float: left;">
			<div>
				<a href="../customer/customerlogin.jsp"><img alt="customermenu.png"
					src="../images/customermenu.png" height="30px"
					style="margin-left: 200px; margin-top: 100px;" /> </a>
			</div>
			<div>
				<a href="../company/companylogin.jsp"><img alt="customermenu.png"
					src="../images/companymenu.png" height="30px"
					style="margin-left: 200px; margin-top: 20px;" /> </a>
			</div>
			<div>
				<a href="../common/signup.jsp"><img alt="customermenu.png"
					src="../images/register.png" height="30px"
					style="margin-left: 200px; margin-top: 20px;" /> </a>
			</div>
		</div>


		<!-- Advertisements are here  -->


		<div align="right">
			<img alt="add.jif" src="../images/gif.gif"
				style="padding-right: 10px; padding-top: 10px;" /> <img
				alt="add.jif" src="../images/gif.gif" style="padding-right: 10px;" "/>
		</div>




	</div>






	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>