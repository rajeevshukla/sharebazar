<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script type="text/javascript">
	$(document).ready(function() {

		$("#dialog").dialog({
			autoOpen:false,
			model : true,
			height: 300,
			width : 400,
			resizable :false,
			
			  /* buttons: [ { text: "Ok", click: function() { $( this ).dialog( "close" ); } } ] */
			
		});
		
		$("#dialog").parent("div").css("top","160px;");
		
		$(function() {
			$("#tabs").tabs();
		});
		
		  
		
	});
</script>
</head>
<body>
 <!-- including header -->
	<jsp:include page="../common/commonHeader.jsp"></jsp:include>
 
	<div class="body2">
		<div class="main">
			<!-- content -->
			<section id="content">
			<div class="marg_top wrapper">
				<article class="col1">
				<div class="box1_out">
					<div class="box1">
						<h2 class="bigHeading">Bonds</h2>
						<p class="pad_bot1">
							Get updated <br>with current market<br>situation
						</p>
						<a href="bond.jsp" class="button"><span><span>Read More</span></span></a>
						<img src="../images/img1.png" class="img" alt="">
					</div>
				</div>
				<div class="box1_bot">
					<div class="box1_bot_left">
						<div class="box1_bot_right"></div>
					</div>
				</div>
				</article>
				<article class="col1 pad_left1">
				<div class="box1_out">
					<div class="box1">
						<h2 class="bigHeading">Top/Bottom Stock</h2>
						<p class="pad_bot1">
							We have found <br>list of Top and Bottom <br>stocks 
							for you.
						</p>
						<a href="topBottom.jsp" class="button"><span><span>Read More</span></span></a>
						<img src="../images/img2.png" class="img" alt="">
					</div>
				</div>
				<div class="box1_bot">
					<div class="box1_bot_left">
						<div class="box1_bot_right"></div>
					</div>
				</div>
				</article>
				<article class="col1 pad_left1">
				<div class="box1_out">
					<div class="box1">
						<h2 class="bigHeading">IPO's</h2>
						<p class="pad_bot1">
							IPO stands for <br>initial public <br>offer<br>
						</p>
						<a href="ipo.jsp" class="button"><span><span>Read More</span></span></a>
						<img src="../images/img3.png" class="img" alt="">
					</div>
				</div>
				<div class="box1_bot">
					<div class="box1_bot_left">
						<div class="box1_bot_right"></div>
					</div>
				</div>
				</article>
			</div>
			<div class="wrapper marg_top2">
				<article class="col1">
				<div class="box2">
					<div class="pad" style="width: 230px">
						<h2 class="bigHeading">Currency Converter</h2>
						<div class="wrapper pad_bot1" style="width: 230px;">
							<!-- <figure><img src="../images/page1_img1.jpg" alt="" class="left marg_right1"></figure>
								<span class="color1">Michael Donovan</span><br>
								Sit amet, ectetuer adgipi scing elit.<a href="#">More</a> -->
							<span>
							From :<select id="currency_from" style="width: 215px;">
								<currency:IterateCurrency>
									<option value="${key}">${value}(${key})</option>
								</currency:IterateCurrency>
							</select>
							</span>
							<br>
							<span style="margin-top: 10px;">
							 To : <select id="currency_to" style="padding-left: 14px; width: 216px;">
								<currency:IterateCurrency>
									<option value="${key}">${value}(${key})</option>
								</currency:IterateCurrency>
							</select></span><br><br> <input type="button" value="get" onclick="getCurrencyValue();">
						</div>
						<div class="wrapper pad_bot1" id="showCurrencyRate"
							style="height: 32px;"></div>
						<!-- <div class="wrapper pad_bot1">
							<figure> <img src="../images/page1_img3.jpg" alt=""
								class="left marg_right1"> </figure>
							<span class="color1">James Doe</span><br> Quis autem vel eum
							iure reprehenderit. <a href="#">More</a>
						</div> -->
					</div>
				</div>
				</article>
				<article class="col2 pad_left1">
				<div class="pad">
					<h2 class="bigHeading">Solutions That You Need!</h2>
					<p>
						<strong>The sharebazar.com </strong> is a  web site
						created by <strong> <span title="Shukla & Sons">SAS</span></strong> web development company. This web site is giving
						you many solutions in Share Bazar.
					</p>
					<p class="under">
						We offer different type of accounts.You can have more than one demat account with us.
						several pages: <a href="index.jsp">Home</a>, <a href="about.jsp">About</a>,
						<a href="Projects.html">Projects</a> (with <a href="#">Project
							Page</a>), <a href="contact_us.jsp">Contacts</a> (for more information contact us
						form our Head Office), <a href="sitemap.jsp">Site Map</a>.
					</p>
					<div class="wrapper">
						<ul class="list1 cols">
							<li><a href="acoffer.jsp">different types of accounts offered</a></li>
							<li><a href="orderStatus.jsp">How do I check order status?</a></li>
							<li><a href="orderPlace.jsp">How do I place orders?</a></li>
						</ul>
						<ul class="list1 cols pad_left1">
							<li><a href="shellBuy.jsp">Check my Buy /Sell Shares?</a></li>
							<li class="bg_none"><a href="#memberLogin" id="memberLogin" onclick="openLoginDialog();">my Login ID and passwords</a></li>
							<li><a href="#">forgot my Passwords. What do I do?</a></li>
						</ul>
					</div>
				</div>
				</article>
			</div>
			</section>
			<!-- / content -->
		</div>
	</div>





	<jsp:include page="../common/commonFooter.jsp"></jsp:include>


</body>
</html>