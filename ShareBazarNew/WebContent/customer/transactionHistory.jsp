<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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


<title>Transaction History</title>

<link rel="stylesheet" href="style/accord.css" type="text/css" />
<script type="text/javascript" src="script/accord.js"></script>
</head>

<body onload="backDisable();">
	<%-- 	<jsp:include page="../common/headerHome.jsp"></jsp:include> --%>
	<jsp:include page="../customer/customerHeader.jsp"></jsp:include>


	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">




				<h4 class="commentformTitle" style="padding: 20px;">Transaction
					history</h4>


				<div id="accordion">
					<dl class="accordion" id="slider">
						<dt>Credit</dt>
						<dd>
							<span> Credit History................ </span>
						</dd>
						<dt>Buy</dt>
						<dd>
							<span> Credit history.........s </span>
						</dd>
						<dt>Sell</dt>
						<dd>
							<span> Sell history,,,,,,,,,,,,,,,,,, </span>
						</dd>
					</dl>
				</div>


				<script type="text/javascript">
					var slider1 = new accordion.slider("slider1");
					slider1.init("slider");
				</script>

			</div>

		</div>
	</div>


	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
