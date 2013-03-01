<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>MemberShipId</title>


</head>

<body>
	<br>&nbsp;
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="leftpan.jsp"></jsp:include>
	<div class="rightPan">

		<div class="text">
			your memberShipid is <b><u><s:property
						value="#session['memberId']" /> </u></b>
		</div>



	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
