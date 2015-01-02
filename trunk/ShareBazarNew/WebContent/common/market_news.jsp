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
				<h2 class="bigHeading">Todays Market Update</h2><br>
				<h4><a href="update1.jsp" >Coal India officers serve three-day strike notice</a></h4><br>
				<h4><a href="update2.jsp" >Petrol price hiked by 60 paise per litre, diesel by 50 p</a></h4><br>
				<h4><a href="update3.jsp" >Bank of Maharashtra to sell Rs 520cr worth of NPAs</a></h4><br>
				<h4><a href="update4.jsp" >Abu Dhabi's TAQA to acquire 2 Jaypee Power plants</a></h4><br>
				</article>
			</div>
			
			
			
		  </section>
		  
			<!-- / content -->
		</div>
	</div>





	<jsp:include page="../common/commonFooter.jsp"></jsp:include>


</body>
</html>