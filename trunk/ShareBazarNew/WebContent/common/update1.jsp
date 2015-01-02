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
				<h2 class="bigHeading">Coal India officers serve three-day strike notice</h2><br>	
				<p>
				State-owned Coal India (CIL) today said a group of executives has served a three-day strike notice from March 13 for not finalising their demands for performance related pay and new pension scheme, among others. "Coal Mines officers' Association of India (CMOAI) has served strike notice for 3 days with effect from March 13, 2014 to March 15, 2014 against non-finalisation of PRP (Performance Related Pay), New Pension Scheme and other demands," CIL said in a filing to BSE, adding that efforts are being made to reconcile the same. The CMOAI had earlier said that it may resort a three-day strike if its demands were not met. "Significantly, all the Maharatna PSUs except Coal India Ltd have already been given order for payment of Performance Related Pay (PRP) by their ministries concerned...We are constrained to communicate to you our strike notice w.e.f March 13, 2014 to meet our genuine and justified demands," CMOAI had said in a letter to Coal India CMD.
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