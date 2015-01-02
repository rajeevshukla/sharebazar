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
				<h2 class="bigHeading">Abu Dhabi's TAQA to acquire 2 Jaypee Power plants</h2><br>	
				<p>
				Abu Dhabi National Energy Co (TAQA)-led consortium is planning to acquire Jaiprakash Power Venture's two hydropower units in Himachal Pradesh, sources, privy to the development, told CNBC-TV18, adding that the deal will be announced shortly. The enterprise value of the hydro units, which have a combined capacity of 1400 MW, is pegged at Rs 10,500 crore, including Rs 6,500-crore debt. Jaypee Power is expected to get around Rs 4,000 crore cash from the deal, sources said. Post deal, TAQA will own 51 percent, Canada's PSP will own 39 percent and IDFC will hold 10 percent in the hydropower units. TAQA will operate both units. Ernst & Young is the M&A advisor to Jaypee Power for the deal and Vaish&Assoc&Bansi S Mehta are its legal advisors. Trilegal is the advisor to TAQA. CNBC-TV18 on December 12, 2013, had reported that TAQA is looking at an investment of USD 700 million in Himachal Pradesh in the electricity sector.
				</p>
				</article>
			</div>
			
			
			</section>
			<!-- / content -->
		</div>
	</div>





	<jsp:include page="../common/commonFooter.jsp"></jsp:include>


</body>
</html>