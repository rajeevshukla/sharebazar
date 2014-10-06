<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="../common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>MemberShipId</title>


</head>

<body>

	<%-- <jsp:include page="../common/header.jsp"></jsp:include>
	<jsp:include page="../common/leftpan.jsp"></jsp:include> --%>
	<jsp:include page="../common/commonHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">

				<div class="text">
				
				  <div class="pad">
				   <h2 class="bigHeading">Congratulation !!</h2>
				  
				  
				  </div>
				
				
					your memberShipid is <b><u><s:property
								value="#session['memberId']" /> </u></b>
								In order login as member pleas <a href="#memberLogin" id="memberLogin" onclick="openLoginDialog();">Click Here</a>
				</div>
			</div>
		</div>
	</div>



	<jsp:include page="../common/commonFooter.jsp"></jsp:include>


</body>
</html>
