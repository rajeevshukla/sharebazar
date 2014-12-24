<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<script type="text/javascript">
 $(document).ready(function(){
 
      alert("working"); 
 
 });
</script>


<body id="page5">
	<div class="body3"></div>
	<div class="body1">
		<div class="main">
			<!-- header -->
			<header>
				<div id="logo_box">
					<h1 style="font-size: 30px;	line-height: 40px;	padding-left: 47px">
						<a href="../common/index.jsp" id="logo">ShareBazar.com <span>Clients
								Choose Us!</span></a>
					</h1>
				</div>
				<nav>
					<ul id="menu">
						<li><a href="../common/index.jsp">Home</a></li>
						<li><a href="../common/about.jsp">About</a></li>
						<li><a href="../common/market_news.jsp">Market News</a></li>
						<li  id="menu_active"><a href="../common/contact_us.jsp">Contacts</a></li>
						<li class="bg_none"><a href="#memberLogin" id="memberLogin" onclick="openLoginDialog();">Member
								area</a></li>
					</ul>
				</nav>
				<div class="wrapper">
					<div class="text1">Your Business Needs Fresh Ideas?</div>
					<div class="text2">We work for your Profit</div>
					<ul id="icons">
						<li><a href="http://www.facebook.com/mail2rajeevshukla" target="_blank"><img src="../images/icon1.jpg" alt=""></a></li>
						<li><a href="http://in.linkedin.com/in/rajeevshukladoeacc/" target="_blank"><img src="../images/icon2.jpg" alt=""></a></li>
						<li><a href="https://twitter.com/rajeevshukla_" target="_blank"><img src="../images/icon3.jpg" alt=""></a></li>
					</ul>
				</div>
				<div class="ic">More Website Templates at TemplateMonster.com!</div>
			</header>
			<!-- / header -->
		</div>
	</div>
	<div style="top: 160px;">
		<div id="dialog" title="Login Pannel" style="width: 430px;">
				<form action="commonLogin.action" method="post">
					<table class="loginTable"  >
						<tbody>
							<tr >
								<td colspan="2"><h4 >Enter your login details....</h4> <input type="hidden" id="postId" name="postId"
									value="11" /></td>

							</tr>
							<tr>
								<td><label for="visitorFirstName">Login
										Name</label></td>
								<td ><input type="text" id="loginName"
									name="loginName" class="short" placeholder="rajeev123"
									required="" /></td>
							</tr>
							<tr>
								<td ><label for="visitorLastName">MemberShip
										Id</label></td>
								<td ><input type="text" id="memberShipId"
									name="memberShipId" class="short" placeholder="CY000028"
									required="" /></td>
							</tr>
							<tr>
								<td ><label for="visitorLastName">Password</label></td>
								<td ><input type="password" id="password"
									name="password" class="short" placeholder="***********"
									required="" /></td>
							</tr>



						</tbody>
					</table>
					<input type="submit" value="Login">
					<input type="button"  value="Cancel" onclick="$('#dialog').dialog('close')">

<a href="../common/forgetPassword.jsp" >Forget Password ?</a> 
<br>
<a href="../company/companysignup.jsp" >Register as company</a><br>
 <a href="../customer/customersignup.jsp" >Register as customer</a>
				</form>

			
		</div>
	</div>