<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@include file="../common/common.jsp"%>
<%-- <%@taglib prefix="display" uri="http://displaytag.sf.net"%> --%>
<c:if test="${empty session.name}">
	<c:redirect url="index.jsp"></c:redirect>
</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>
<script type="text/javascript">
	$(function() {
		var icons = {
			header : "ui-icon-circle-arrow-e",
			activeHeader : "ui-icon-circle-arrow-s"
		};
		$("#accordion").accordion({
			icons : icons,
			heightStyle: "content"
		});
		$("#toggle").button().click(function() {
			if ($("#accordion").accordion("option", "icons")) {
				$("#accordion").accordion("option", "icons", null);
			} else {
				$("#accordion").accordion("option", "icons", icons);
			}
		});
	});

</script>
<style type="text/css">
 .pagebanner{
  margin-left: 20%;
 }
</style>
<title>Transaction History</title>

<link rel="stylesheet" href="style/accord.css" type="text/css" />
<script type="text/javascript" src="script/accord.js"></script>
</head>
<body>
 <jsp:include page="../company/companyHeader.jsp"></jsp:include>
	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">

				<h4 class="commentformTitle" style="padding: 20px;">Transaction
					history</h4>

				<div id="accordion">
					<h3>Credit history</h3>
					<div>
				 
				    <display:table style="width : 500px;" list="${creditHistory}" requestURI="transactionHistory.action" pagesize="10">
 				     <display:column property="transactionDoneByUserName" title="Name"></display:column>
 				     <display:column property="transactionType" title="Remark"></display:column>
				     <display:column property="transactionAmount" title="Amount"></display:column>
				     <display:column property="transactionDate" title="Date" format="{0,date,dd-MMM-yyyy hh:mm a}"></display:column>
				    </display:table>
					</div>
					<h3>Brought Transaction History</h3>
					<div>
				    <display:table style="width : 500px;" list="${buyHistory}" requestURI="transactionHistory.action" pagesize="10">
 				     <display:column property="transactionType" title="Tranaction For "></display:column>
				     <display:column property="transactionAmount" title="Amount"></display:column>
				     <display:column property="transactionDate" title="Date" format="{0,date,dd-MMM-yyyy hh:mm a}"></display:column>
				    </display:table>
						
				</div>
					<h3>Sold Transaction History</h3>
					<div>
				    <display:table style="width : 500px;" list="${sellHistory}" requestURI="transactionHistory.action" pagesize="10">
 				     <display:column property="transactionType" title="Tranaction For "></display:column>
				     <display:column property="transactionAmount" title="Amount"></display:column>
				     <display:column property="transactionDate" title="Date" format="{0,date,dd-MMM-yyyy hh:mm a}"></display:column>
				    </display:table>
					</div>
				</div>

			</div>

		</div>
	</div>


	<jsp:include page="../company/companyFooter.jsp"></jsp:include>
</body>
</html>
