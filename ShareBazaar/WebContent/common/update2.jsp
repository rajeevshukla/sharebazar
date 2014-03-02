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

	<jsp:include page="../common/commonHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<!-- content -->
			<section id="content">
			
			
			<div class="marg_top wrapper">
				<article class="col3">
				<h2 class="bigHeading">Petrol price hiked by 60 paise per litre, diesel by 50 p</h2><br>	
				<p>
				Petrol price was today hiked by 60 paise a litre, the second increase this year, and diesel by 50 paise per litre, the 14th hike since January 2013. The hikes, effective from midnight tonight, are excluding local sales tax or VAT and actual increase will be higher and will vary from city to city. Petrol price, which was last hiked by 91 paise on January 4, will cost Rs 73.16 a litre in Delhi from midnight tonight, up 73 paise from Rs 72.43 at present. In Mumbai, the fuel will cost Rs 82.07 a litre as against Rs 81.31 at present.
				</p>
				</article>
			</div>
			
			
			
			<div class="wrapper marg_top2">
				<article class="col1">
				<div class="box2">
					<div class="pad">
						<h2 class="bigHeading">Currency Converter</h2>
						<div class="wrapper pad_bot1" style="width: 300px;">
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
							 To : <select id="currency_to" style="padding-left: 14px; width: 230px;">
								<currency:IterateCurrency>
									<option value="${key}">${value}(${key})</option>
								</currency:IterateCurrency>
							</select></span><br> <input type="button" value="get" onclick="getCurrencyValue();">
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
						<strong>The Art of Business</strong> is a free web template
						created by TemplateMonster.com team. This website template is
						optimized for 1024X768 screen resolution.
					</p>
					<p class="under">
						This website template can be delivered in two packages - with PSD
						source files included and without them. This website template has
						several pages: <a href="Home.html">Home</a>, <a href="About.html">About</a>,
						<a href="Projects.html">Projects</a> (with <a href="Project.html">Project
							Page</a>), <a href="Contacts.html">Contacts</a> (note that contact us
						form - doesn't work), <a href="SiteMap.html">Site Map</a>.
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


</body>
</html>