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
			
			</section>
			<!-- / content -->
		</div>
	</div>





	<jsp:include page="../common/commonFooter.jsp"></jsp:include>


</body>
</html>