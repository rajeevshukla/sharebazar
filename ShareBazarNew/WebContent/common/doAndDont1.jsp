<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Do's & Don't</title>

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
				<h2 class="bigHeading">Do's & Don't</h2>
				<p>	<p>
				We offer some advice for those taking the plunge and deciding to
				deal online. Many of these tips apply to share dealing in general.<br>
			</p>
			<ul>
				<li>Do shop around to get the best online stockbroker. The
					amount of commission they charge varies enormously.</li>
				<li>Don't be tempted to rush into a transaction. People say
					trading online can feel unreal, so don't hurry into spending
					hard-earned cash.</li>
				<li>Do be careful when offered the chance, by brokers, to
					borrow money to buy shares. You could end up losing money you do
					not have.</li>
				<li>Don't spend a pound more than you can afford to lose.
					Decide on an amount you're prepared to invest and stick to it. If
					you've made good money, take out half as profit.</li>
				<li>Do plenty of research and read the city news on This is
					Money to get good-quality and up-to-date information.</li>
				<li>Don't check your share prices every ten minutes. If you
					give in to the temptation to do this, your phone bill will be
					larger than any profits you make on the markets. Check your
					portfolio at the end of each day. Remember you are investing for
					the long term.</li>
				<li>Do watch out for false information posted on internet
					bulletin boards. In the past, unscrupulous investors have given out
					misinformation to push up shares they own, only to dump their
					holdings once private investors have bought in.</li>
			</ul>

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