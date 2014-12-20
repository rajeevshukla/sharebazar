<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check my Buy /Sell Shares?</title>

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
				<h2 class="bigHeading">Check my Buy/Sell Shares?</h2>
				<p>
				Shares are mostly bought and sold on stock exchanges such as the
				NZX. Shares can also be called stocks, equities, or securities. You
				can buy or sell shares through a sharebroker. Some banks offer a
				sharebroking service - check your bank's website for details.
				Another way to buy shares is in a managed fund, which can be bought
				directly from a fund manager. Find out more about managed funds.
				Many KiwiSaver investment funds also have shares as part of their
				investment mix. Shares listed on stock exchanges and managed funds
				are usually easier to buy and sell than unlisted shares. If you own
				shares you may be asked by the company to buy more of its shares
				(for example in a rights issue or some other allotment of new shares
				(opens in a new window), when the company is seeking more capital)
				or you may be asked by the company to sell some of your shares back
				to it (if the company does a share buyback (opens in a new window)).
				You also might be asked to vote about whether other shareholders can
				increase their level of ownership in the company. For almost all
				listed shares and for some unlisted shares, these transactions
				(opens in a new window) may be regulated by the Takeovers Code
				(opens in a new window), which has some protections for
				shareholders.
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