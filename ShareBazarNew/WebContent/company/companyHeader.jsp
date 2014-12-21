<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty session.name}">
	<c:redirect url="../common/index.jsp"></c:redirect>
</c:if>

<style>
nav ul ul {
	display: none;
	clear: both;
}

nav ul li:hover>ul {
	display: block;
	width: 200px;
}

/* nav ul li {
	float: left;
} */
nav ul li:hover {
	background: #4b545f;
	background: linear-gradient(top, #4f5964 0%, #5f6975 40%);
	background: -moz-linear-gradient(top, #4f5964 0%, #5f6975 40%);
	background: -webkit-linear-gradient(top, #4f5964 0%, #5f6975 40%);
}

nav ul li:hover a {
	color: white;
}

nav ul li a {
	display: block;
	color: white;
	text-decoration: none;
}

nav ul ul {
	background: #ffff;
	border-radius: 0px;
	padding: 0;
	position: absolute;
	top: 100%;
	z-index: 999;
	background-color: #EEEEEE;
}

nav ul ul li {
	float: none;
	margin-left: 5px;
	border-top: 1px solid #6b727c;
	border-bottom: 1px solid #575f6a;
	position: relative;
}

nav ul ul li a {
	color: white;
}

nav ul ul li a:hover {
	background: #fffff;
}

nav ul ul ul {
	position: absolute;
	left: 100%;
	top: 0;
}

#logout_box {
	float: left;
	width: 19%;
	padding-right:
}

#sharebazar_box {
	float: left;
	width: 80%;
}

#welcome_name {
	margin-top: -18px;
	overflow: hidden;
	padding: 71px 51px 9px;
	position: absolute;
	color: white width:  100%;
	z-index: 2;
}
</style>


<body id="page5">
	<!-- <div class="body3"></div> -->
	<div class="body1">
		<div class="main">
			<!-- header -->
			<header>
				<div id="logo_box">
					<div id="sharebazar_box">
						<h1 style="font-size: 30px; line-height: 40px; padding-left: 47px">
							<a href="../company/cyHome.jsp" id="logo">ShareBazar.com <span>Clients
									Choose Us!</span></a>
						</h1>
					</div>
					<div id="logout_box" align="right">
						<a href="../common/logout.jsp">Logout</a>
					</div>
					<div id="logout_box" align="right">
						<a href="../company/changePassword.jsp" style="color: white;">Change Password</a>
					</div>
				</div>
				<div id="welcome_name"><h3> <span style="color: InactiveCaptionText;">Welcome</span>   <a href="../company/editProfile.action" style="color: white;"> ${name}</a></h3></div>
				<nav>
					<ul id="menu">
						<li><a href="../company/welcome.action">Home</a></li>
						<li><a href="#">Manage Share</a>
							<ul>
								<li><a href="../company/updateShare.action">Update Share</a></li>
								<li><a href="../company/sellShare.action">Sell Share</a></li>
								<li><a href="../company/deleteShare.action">Delete Share</a></li>
							</ul></li>
						<li><a href="#">Manage Transaction</a>

							<ul>
								<li><a href="../company/manageFund.action">Manage funds</a></li>
								<li><a href="../company/viewTransaction.action">Transaction
										History</a></li>
							</ul></li>
						<li><a href="#">Contact company</a>
							<ul>
								<li><a href="../company/viewShareHolders.action">Share Holders</a></li>
								<li><a href="../company/searchShareHolders.action">Search Share Holders</a></li>
							</ul></li>
						<li><a href="#">Feedbacks</a>
							<ul>
								<li><a href="../company/contactRequest.action">Contact Request(${totalUnreadMsg})</a></li>
								<li><a href="../company/commentForum.action">Comments Forum</a></li>
							</ul></li>
					</ul>
				</nav>
				<div class="wrapper" style="height: 123px;">
					<!-- <div class="text1">Your Business Needs Fresh Ideas?</div>
					<div class="text2">We work for your Profit</div>
					<ul id="icons">
						<li><a href="#"><img src="../images/icon1.jpg" alt=""></a></li>
						<li><a href="#"><img src="../images/icon2.jpg" alt=""></a></li>
						<li><a href="#"><img src="../images/icon3.jpg" alt=""></a></li>
					</ul> -->
				</div>
				<!-- <div class="ic">More Website Templates at TemplateMonster.com!</div> -->
			</header>
			<!-- / header -->
		</div>
	</div>