<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="../style/header.css">
</head>
<body>

	<jsp:include page="../common/header.jsp"></jsp:include>

	<!-- Side bar here  -->
	<jsp:include page="../common/leftpan.jsp"></jsp:include> --%>
<jsp:include page="../common/commonHeader.jsp"></jsp:include>
<!-- 	<div class="rightPan">
		<div style="float: left;">
			<div>
				<a href="../customer/customerlogin.jsp"><img alt="customermenu.png"
					src="../images/customermenu.png" height="30px"
					style="margin-left: 200px; margin-top: 100px;" /> </a>
			</div>
			<div>
				<a href="../company/companylogin.jsp"><img alt="customermenu.png"
					src="../images/companymenu.png" height="30px"
					style="margin-left: 200px; margin-top: 20px;" /> </a>
			</div>
			<div>
				<a href="../common/signup.jsp"><img alt="customermenu.png"
					src="../images/register.png" height="30px"
					style="margin-left: 200px; margin-top: 20px;" /> </a>
			</div>
		</div>
	</div>
 -->
<div class="body2">
	<div class="main">
		<!-- content -->
		<section id="content">
			<div class="marg_top wrapper">
				<article class="col1">
					<div class="box1_out">
						<div class="box1">
							<h2>Effective Solutions</h2>
							<p class="pad_bot1">
								At vero eos et accusamus<br>et iusto odio dignissimos<br>ducimus
								qui.
							</p>
							<a href="#" class="button"><span><span>Read
										More</span></span></a> <img src="../images/img1.png" class="img" alt="">
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
							<h2>Fresh Ideas</h2>
							<p class="pad_bot1">
								Praesentium voluptatum<br>deleniti atque corrupti<br>quos
								dolores.
							</p>
							<a href="#" class="button"><span><span>Read
										More</span></span></a> <img src="../images/img2.png" class="img" alt="">
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
							<h2>Business Planning</h2>
							<p class="pad_bot1">
								Quas molestias excepturi<br>sint occaecati cupidiate<br>non
								provident.
							</p>
							<a href="#" class="button"><span><span>Read
										More</span></span></a> <img src="../images/img3.png" class="img" alt="">
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
						<div class="pad">
							<h2>Currency Converter</h2>
							<div class="wrapper pad_bot1">
								<!-- <figure><img src="../images/page1_img1.jpg" alt="" class="left marg_right1"></figure>
								<span class="color1">Michael Donovan</span><br>
								Sit amet, ectetuer adgipi scing elit.<a href="#">More</a> -->
								From <select id="currency_from">
									<option>AFA</option>
									<option>ALL</option>
									<option>DZD</option>
									<option>ARS</option>
									<option>AWG</option>
									<option>AUD</option>
									<option>BSD</option>
									<option>BHD</option>
									<option>BDT</option>
									<option>BBD</option>
									<option>BZD</option>
									<option>BMD</option>
									<option>BTN</option>
									<option>BOB</option>
									<option>BWP</option>
									<option>BRL</option>
									<option>GBP</option>
									<option>BND</option>
									<option>BIF</option>
									<option>XOF</option>
									<option>XAF</option>
									<option>KHR</option>
									<option>CAD</option>
									<option>CVE</option>
									<option>KYD</option>
									<option>CLP</option>
									<option>CNY</option>
									<option>COP</option>
									<option>KMF</option>
									<option>CRC</option>
									<option>HRK</option>
									<option>CUP</option>
									<option>CYP</option>
									<option>CZK</option>
									<option>DKK</option>
									<option>DJF</option>
									<option>DOP</option>
									<option>XCD</option>
									<option>EGP</option>
									<option>SVC</option>
									<option>EEK</option>
									<option>ETB</option>
									<option>EUR</option>
									<option>FKP</option>
									<option>GMD</option>
									<option>GHC</option>
									<option>GIP</option>
									<option>XAU</option>
									<option>GTQ</option>
									<option>GNF</option>
									<option>GYD</option>
									<option>HTG</option>
									<option>HNL</option>
									<option>HKD</option>
									<option>HUF</option>
									<option>ISK</option>
									<option>INR</option>
									<option>IDR</option>
									<option>IQD</option>
									<option>ILS</option>
									<option>JMD</option>
									<option>JPY</option>
									<option>JOD</option>
									<option>KZT</option>
									<option>KES</option>
									<option>KRW</option>
									<option>KWD</option>
									<option>LAK</option>
									<option>LVL</option>
									<option>LBP</option>
									<option>LSL</option>
									<option>LRD</option>
									<option>LYD</option>
									<option>LTL</option>
									<option>MOP</option>
									<option>MKD</option>
									<option>MGF</option>
									<option>MWK</option>
									<option>MYR</option>
									<option>MVR</option>
									<option>MTL</option>
									<option>MRO</option>
									<option>MUR</option>
									<option>MXN</option>
									<option>MDL</option>
									<option>MNT</option>
									<option>MAD</option>
									<option>MZM</option>
									<option>MMK</option>
									<option>NAD</option>
									<option>NPR</option>
									<option>ANG</option>
									<option>NZD</option>
									<option>NIO</option>
									<option>NGN</option>
									<option>KPW</option>
									<option>NOK</option>
									<option>OMR</option>
									<option>XPF</option>
									<option>PKR</option>
									<option>XPD</option>
									<option>PAB</option>
									<option>PGK</option>
									<option>PYG</option>
									<option>PEN</option>
									<option>PHP</option>
									<option>XPT</option>
									<option>PLN</option>
									<option>QAR</option>
									<option>ROL</option>
									<option>RUB</option>
									<option>WST</option>
									<option>STD</option>
									<option>SAR</option>
									<option>SCR</option>
									<option>SLL</option>
									<option>XAG</option>
									<option>SGD</option>
									<option>SKK</option>
									<option>SIT</option>
									<option>SBD</option>
									<option>SOS</option>
									<option>ZAR</option>
									<option>LKR</option>
									<option>SHP</option>
									<option>SDD</option>
									<option>SRG</option>
									<option>SZL</option>
									<option>SEK</option>
									<option>CHF</option>
									<option>SYP</option>
									<option>TWD</option>
									<option>TZS</option>
									<option>THB</option>
									<option>TOP</option>
									<option>TTD</option>
									<option>TND</option>
									<option>TRL</option>
									<option>USD</option>
									<option>AED</option>
									<option>UGX</option>
									<option>UAH</option>
									<option>UYU</option>
									<option>VUV</option>
									<option>VEB</option>
									<option>VND</option>
									<option>YER</option>
									<option>YUM</option>
									<option>ZMK</option>
									<option>ZWD</option>
									<option>TRY</option>
								</select> To <select id="currency_to">
									<option>AFA</option>
									<option>ALL</option>
									<option>DZD</option>
									<option>ARS</option>
									<option>AWG</option>
									<option>AUD</option>
									<option>BSD</option>
									<option>BHD</option>
									<option>BDT</option>
									<option>BBD</option>
									<option>BZD</option>
									<option>BMD</option>
									<option>BTN</option>
									<option>BOB</option>
									<option>BWP</option>
									<option>BRL</option>
									<option>GBP</option>
									<option>BND</option>
									<option>BIF</option>
									<option>XOF</option>
									<option>XAF</option>
									<option>KHR</option>
									<option>CAD</option>
									<option>CVE</option>
									<option>KYD</option>
									<option>CLP</option>
									<option>CNY</option>
									<option>COP</option>
									<option>KMF</option>
									<option>CRC</option>
									<option>HRK</option>
									<option>CUP</option>
									<option>CYP</option>
									<option>CZK</option>
									<option>DKK</option>
									<option>DJF</option>
									<option>DOP</option>
									<option>XCD</option>
									<option>EGP</option>
									<option>SVC</option>
									<option>EEK</option>
									<option>ETB</option>
									<option>EUR</option>
									<option>FKP</option>
									<option>GMD</option>
									<option>GHC</option>
									<option>GIP</option>
									<option>XAU</option>
									<option>GTQ</option>
									<option>GNF</option>
									<option>GYD</option>
									<option>HTG</option>
									<option>HNL</option>
									<option>HKD</option>
									<option>HUF</option>
									<option>ISK</option>
									<option>INR</option>
									<option>IDR</option>
									<option>IQD</option>
									<option>ILS</option>
									<option>JMD</option>
									<option>JPY</option>
									<option>JOD</option>
									<option>KZT</option>
									<option>KES</option>
									<option>KRW</option>
									<option>KWD</option>
									<option>LAK</option>
									<option>LVL</option>
									<option>LBP</option>
									<option>LSL</option>
									<option>LRD</option>
									<option>LYD</option>
									<option>LTL</option>
									<option>MOP</option>
									<option>MKD</option>
									<option>MGF</option>
									<option>MWK</option>
									<option>MYR</option>
									<option>MVR</option>
									<option>MTL</option>
									<option>MRO</option>
									<option>MUR</option>
									<option>MXN</option>
									<option>MDL</option>
									<option>MNT</option>
									<option>MAD</option>
									<option>MZM</option>
									<option>MMK</option>
									<option>NAD</option>
									<option>NPR</option>
									<option>ANG</option>
									<option>NZD</option>
									<option>NIO</option>
									<option>NGN</option>
									<option>KPW</option>
									<option>NOK</option>
									<option>OMR</option>
									<option>XPF</option>
									<option>PKR</option>
									<option>XPD</option>
									<option>PAB</option>
									<option>PGK</option>
									<option>PYG</option>
									<option>PEN</option>
									<option>PHP</option>
									<option>XPT</option>
									<option>PLN</option>
									<option>QAR</option>
									<option>ROL</option>
									<option>RUB</option>
									<option>WST</option>
									<option>STD</option>
									<option>SAR</option>
									<option>SCR</option>
									<option>SLL</option>
									<option>XAG</option>
									<option>SGD</option>
									<option>SKK</option>
									<option>SIT</option>
									<option>SBD</option>
									<option>SOS</option>
									<option>ZAR</option>
									<option>LKR</option>
									<option>SHP</option>
									<option>SDD</option>
									<option>SRG</option>
									<option>SZL</option>
									<option>SEK</option>
									<option>CHF</option>
									<option>SYP</option>
									<option>TWD</option>
									<option>TZS</option>
									<option>THB</option>
									<option>TOP</option>
									<option>TTD</option>
									<option>TND</option>
									<option>TRL</option>
									<option>USD</option>
									<option>AED</option>
									<option>UGX</option>
									<option>UAH</option>
									<option>UYU</option>
									<option>VUV</option>
									<option>VEB</option>
									<option>VND</option>
									<option>YER</option>
									<option>YUM</option>
									<option>ZMK</option>
									<option>ZWD</option>
									<option>TRY</option>
								</select> 
    <input type="button" value="get" onclick="getCurrencyValue();">
							</div>
							<div class="wrapper pad_bot1">
								<figure>
									<img src="../images/page1_img2.jpg" alt=""
										class="left marg_right1">
								</figure>
								<span class="color1">Jane White</span><br> Neque porro
								quisquahm est, qui dolorem. <a href="#">More</a>
							</div>
							<div class="wrapper pad_bot1">
								<figure>
									<img src="../images/page1_img3.jpg" alt=""
										class="left marg_right1">
								</figure>
								<span class="color1">James Doe</span><br> Quis autem vel
								eum iure reprehenderit. <a href="#">More</a>
							</div>
						</div>
					</div>
				</article>
				<article class="col2 pad_left1">
					<div class="pad">
						<h2>Solutions That You Need!</h2>
						<p>
							<strong>The Art of Business</strong> is a free web template
							created by TemplateMonster.com team. This website template is
							optimized for 1024X768 screen resolution.
						</p>
						<p class="under">
							This website template can be delivered in two packages - with PSD
							source files included and without them. This website template has
							several pages: <a href="Home.html">Home</a>, <a href="About.html">About</a>,
							<a href="Projects.html">Projects</a> (with <a href="Project.html">Project
								Page</a>), <a href="Contacts.html">Contacts</a> (note that contact
							us form – doesn’t work), <a href="SiteMap.html">Site Map</a>.
						</p>
						<div class="wrapper">
							<ul class="list1 cols">
								<li><a href="#">At vero eos etaccusamus iusto</a></li>
								<li><a href="#">Odio dignissmos ducimus blanditiis</a></li>
								<li><a href="#">Praesentum voluptum deleniti</a></li>
							</ul>
							<ul class="list1 cols pad_left1">
								<li><a href="#">Molestias exceutpturi sint occaecati</a></li>
								<li><a href="#">Cupiditate nogn proghvident, similique</a></li>
								<li><a href="#">Sunt in culpa qui offiutrucia deserunt</a></li>
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

<%-- <jsp:include page="../common/footer.jsp"></jsp:include> --%>
</body>
</html>