<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="currency" uri="http://www.sharebazar.com/currencyTags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Avoiding Scams</title>

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

	<jsp:include page="customerHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<!-- content -->
			<section id="content">


			<div class="marg_top wrapper">
				<article class="col3">
				<p>
				<h2 class="bigHeading">Avoiding Scams</h2>
				<p>Everyone has at least dreamt of hitting it big on the stock
					market one day. Sadly, many of us are simply too fearful to get
					involved in stock trading. Every so often, however, an opportunity
					comes along that seems so great that it pulls individuals right
					into the world of securities exchange. Unfortunately, these
					opportunities literally are too good to be true. This is exactly
					why it's imperative for you to be able to recognize stock scams
					before getting caught in one. Stock Market Scams to Be Aware Of
					Absolutely anyone can be fooled by a stock market scam. The people
					who engage in these dishonest practices are good at what they do,
					and unless a person knows the potential scams that are out there,
					they may easily fall victim to one. Pump-and-Dump Scams
					Pump-and-dump scams are unique in the fact that they do actually
					result in stocks with increased values. Fraudsters will use several
					techniques to convince people that a low-priced stock is "the next
					big thing." When people believe this, they start purchasing shares
					in these "new opportunities." This actually makes the price of the
					stock go up, and at this point, the fraudsters sell off their own
					shares at the inflated price. Sadly, soon thereafter, those who
					were duped realize that the stock they bought was actually
					worthless. Ponzi Schemes Ponzi schemes are some of the most
					damaging scams that occur in America. These scams involve
					withdrawals of money that are financed by new investors.
					Withdrawals should only be made from profits, and unfortunately,
					this type of scam is what allowed Bernie Madoff to make off with
					about $64.8 billion in investors' money. Boiler Room Scams Boiler
					rooms are basically call centers where a group of people use
					telesales to deceptively promote stocks that are often worthless.
					They usually use high-pressure sales tactics to try to secure a
					purchase over the phone, and they do their best to make low-priced
					stocks seem valuable. This is one way in which the aforementioned
					pump-and-dump schemes are carried out. Avoiding Stock Market Scams
					The numerous types of stock and securities fraud out there may
					leave a potential investor with a bad taste in their mouth. It's
					important to note, though, that as long as proper safety measures
					are taken, the stock market is relatively safe. Be Wary of
					Unsolicited Contact You've likely gotten those emails that offer
					amazing opportunities for a great return on investment. Many people
					immediately assume that these are scams, and in actuality, these
					fraudsters will also contact potential victims via phone, mail and
					even fax. The main point, regardless of the method, is to be
					vigilant when you receive unsolicited offers. Look for the Exchange
					All stocks are traded on a certain exchange. Smaller and less
					legitimate stocks are usually unable to meet the stringent listing
					requirements that exist for the NASDAQ, S&P 500 or other national
					exchanges. These stocks are often listed on what are known as Pink
					Sheets or OTC Bulletin Boards. These stocks are usually the
					riskiest you'll find, and they're often not worth the investment.
					Don't Fall for High-Pressure Sales In the world of securities, a
					stock that actually has promise will not require high-pressure
					sales tactics. This method of selling is often employed by scam
					artists who have to sell a large quantity of their worthless stock
					to inflate its value to a point where it is profitable for them to
					sell. If high-pressure tactics are being used, it's best to simply
					look for other opportunities. The stock market isn't really a
					dangerous place to be; you just have to be smart about your
					investing. In reality, this is true of any asset that you'll ever
					invest in. The 2013 stock market saw record breaking closes, which
					had never been reached in all of history, so plenty of people are
					likely kicking themselves for not investing when the economy's
					bottom fell out. Just because the market has rebounded, however,
					doesn't mean that a person shouldn't invest now. It's simply
					essential to consider the aforementioned safety measures first.
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





	<jsp:include page="customerFooter.jsp"></jsp:include>


</body>
</html>