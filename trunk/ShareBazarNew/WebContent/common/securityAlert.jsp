<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Security Alert</title>

<script type="text/javascript">
	$(document).ready(function() {

		$("#dialog").dialog({
			autoOpen : false,
			model : true,
			height : 300,
			width : 400,
			resizable : false,

		/* buttons: [ { text: "Ok", click: function() { $( this ).dialog( "close" ); } } ] */

		});

		$("#dialog").parent("div").css("top", "160px;");

		$(function() {
			$("#tabs").tabs();
		});

	});
</script>
</head>
<body>

	<jsp:include page="../common/commonHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<!-- content -->
			<section id="content">


			<div class="marg_top wrapper">
				<article class="col3">
				<p>
				<h2 class="bigHeading">Security Alert</h2>
				<p>Get insightful stock recommendations on expected price
					movements of top scrip's for the day, through the day, via SMS. Our
					equity research analysts monitor the markets constantly to give you
					real-time stock calls. We give you advice not after it happens, but
					when it happens. Types of services Fundamental Calls For investors
					who want to stay up to date on the stock market Consists of Stock
					Recommendations based on fundamental research and insight Get the
					target price of stock along with investment horizon
					Technical/Intraday/Derivative Calls For traders who want stock
					recommendations based on technical trends and patterns Get
					recommendations along with support and resistance levels for the
					stock Account Transaction Alerts Get alerted on all critical
					activities in your account We will remind you for all due MF SIPs
					and Autoinvest Trade Confirmation SMS Get confirmation for every
					trade executed Only fully traded orders are communicated Partial
					orders are communicated at the end of the day To activate /
					de-activate the service or update mobile number for the SMS Alert
					service, you can follow any of the process mentioned below: Login
					to your trading account on www.kotaksecurities.com - Click on My
					Account - Click on SMS & E-mail Subscriptions OR Login to your
					trading account on www.kotaksecurities.com - Click on Customer
					Service -Click on SMS & E-mail Subscriptions OR We can accept the
					your request for activation/deactivation of SMS facility through
					our customer service, through Q form/ E-mail from the registered
					E-mail Id and accept a mail request from branch. No hard copies
					required. Activation of your request will be done within 5 working
					days if your request is not rejected. Incase of the request for
					deactivation it will be done with in 2 working day.
				<p>
					<br> <br>


				</p>
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
							<span> From :<select id="currency_from"
								style="width: 215px;">
									<currency:IterateCurrency>
										<option value="${key}">${value}(${key})</option>
									</currency:IterateCurrency>
							</select>
							</span> <br> <span style="margin-top: 10px;"> To : <select
								id="currency_to" style="padding-left: 14px; width: 216px;">
									<currency:IterateCurrency>
										<option value="${key}">${value}(${key})</option>
									</currency:IterateCurrency>
							</select></span><br> <br> <input type="button" value="get"
								onclick="getCurrencyValue();">
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
					<h4 class="bigHeading">Purpose</h4>
					<h3 style="color: blue;">Committed to improve the financial
						well-being of people.</h3>

					<h4>
						<b> Vision</b>
					</h4>
					<br>
					<ul style="list-style: inside;">
						<li>To continue to be a leader.</li>
						<li>establish global presence.</li>
						<li>facilitate the financial well being of people.</li>
					</ul>
					<h4>
						<b>Values</b>
					</h4>
					<br> <b><font color="blue">ShareBazar is committed
							to the following core values :</font></b>
					<ul style="list-style: inside;">
						<li>Integrity</li>
						<li>Customer focused culture</li>
						<li>Trust, respect and care for the individual</li>
						<li>Passion for excellence</li>
						<li>Teamwork</li>
					</ul>


					</p>
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