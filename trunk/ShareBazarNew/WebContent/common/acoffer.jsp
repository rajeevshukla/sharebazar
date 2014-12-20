<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Different A/c offered</title>

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
				<h2 class="bigHeading">Different types of accounts offered</h2>
				<h3>Savings Accounts</h3>
				<p>These are intended to provide an incentive for you to save
					money. You can make deposits and withdrawals, but usually cant
					write checks. They usually pay an interest rate thats higher than a
					checking account, but lower than a money market account or CD. Some
					savings accounts have a passbook, in which transactions are logged
					in a small booklet that you keep, while others have a monthly or
					quarterly statement detailing the transactions. Some savings
					accounts charge a fee if your balance falls below a specified
					minimum.
				<h3>Basic Checking Accounts</h3>
				<p>Sometimes also called "no frills" accounts, these offer a
					limited set of services at a low cost. You'll be able to perform
					basic functions, such as check writing, but they lack some of the
					bells and whistles of more comprehensive accounts. They usually do
					not pay interest, and they may restrict or impose additional fees
					for excessive activity, such as writing more than a certain number
					of checks per month.
				<h3>Interest-Bearing Checking Accounts</h3>
				<p>In contrast to "no frills" accounts, these offer a more
					comprehensive set of services, but usually at a higher cost . Also,
					unlike a basic checking account, you are usually able to write an
					unlimited number of checks. Checking accounts which pay interest
					are sometimes referred to as negotiable order of withdrawal (NOW)
					accounts. The interest rate often depends on how large the balance
					in the account is, and most charge a monthly service fee if your
					balance falls below a preset level.
				<h3>Money Market Deposit Accounts (MMDAs)</h3>
				<p>These accounts invest your balance in short-term debt such as
					commercial paper, Treasury Bills, or CDs. The rates they offer tend
					to be slightly higher than those on interest-bearing checking
					accounts, but they usually require a higher minimum balance to
					start earning interest. These accounts provide only limited check
					writing privileges (three transfers by check, and six total
					transfers, per month), and often impose a service fee if your
					balance falls below a certain level.
				<h3>Certificates of Deposit (CDs)</h3>
				<p>These are also known as "time deposits", because the account
					holder has agreed to keep the money in the account for a specified
					amount of time, anywhere from three months to six years. Because
					the money will be inaccessible, the account holder is rewarded with
					a higher interest rate, with the rate increasing as the duration
					increases. There is a substantial penalty for early withdrawal, so
					don't select this option if you think you might need the money
					before the time period is over (the "maturity date").
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