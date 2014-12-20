<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>How do I place orders?</title>

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
				<h2 class="bigHeading">How do I place orders?</h2>
				<p>
				You must first have available funds or margin in your account
					to place an order. You can place an order from anywhere you see a
					"blue link" on the trading platform. A full description of how to
					place an order in these areas can be accessed from the help section
					of the Trading Tool. Trading Stock Stock orders can be executed
					from any of the following locations: the Stock Ticker, the Options
					Chain, the Account Positions Screen, the Orders Screen, the
					Watchlist or Hotlist, the Stock Screener, and the Order Ticket
					(located on the left-hand side of the bottom toolbar). Trading
					Options Option orders can be executed from any of the following
					locations: the Options Chain, the Account Positions Screen, the
					Watchlist, and the Order Ticket. Trading Spreads You can trade
					spreads by selecting from a drop-down menu of pre-selected spreads
					from the options chain. The selection includes vertical spreads,
					calendar spreads, iron condors and more. You can also build your
					own spread trade - leg by leg - from the standard option chain. To
					build a spread, trigger the action menu in the Option Chain by
					clicking on the blue text, bid or ask price. Bid price if you wish
					to sell that leg, ask price if you wish to buy. Select buy or sell
					and repeat with your next option bid or ask price. You can add up
					to 4 option legs on one spread. Select the Price Type, Market, Net
					Debit Net Credit or Net $0.00 and the Duration you wish the order
					to be active. Please note: spread orders can have a duration of a
					Day or Good-Til-Cancelled (GTC). The Advanced Order Ticket The
					basic order ticket allows for triggers and trailing stops. The
					advanced order ticket (accessible from the action menu or the
					drop-down of the basic order ticket) allows the following complex
					order types: OCO (order cancels order), OTO (order triggers order),
					OTOCO (order triggers OCO), OTT (order triggers two orders). These
					order types allow you to set up a number of scenarios to fire off
					orders that rely on the status of other orders. For example, you
					can place an order that triggers two separate orders when it fills.
				
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
							</select></span><br>
							<br> <input type="button" value="get"
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