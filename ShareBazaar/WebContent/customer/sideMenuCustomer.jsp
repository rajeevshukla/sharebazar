<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'sideMenu.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="style/header.css">

</head>

<body>
	<div class="header1" style="height: 500px; width: 240px; float: left;">
		<ul>
			<li style="list-style-image: url('../images/menu.png');"><a
				href="./customer/crHome.jsp">Home</a></li>
			<li><a href="buyShareGet.action"> Buy Share</a></li>
			<li><a href="sellShareGet.action"> Sell Share</a></li>
			<li><a href="getFund.action">Funds</a>
			<li><a href="transactionHistory.action">Transcation History</a></li>
			<li><a href="companyDetailGet.action">Company Detail</a>
			<li><a href="contactwithcompanyGet.action"> Contact
					companies</a></li>
			<li><a href="editCustomerProfile.action">Edit Profile</a></li>
			<li><a href="./customer/customerAccountSetting.jsp"> Account Setting</a></li>
			<li><a href="commentGet.action">Post comment</a></li>
		</ul>
	</div>

</body>
</html>
