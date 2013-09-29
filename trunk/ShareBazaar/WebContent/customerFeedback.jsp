<%@page
	import="com.sun.org.apache.xerces.internal.impl.dtd.models.CMAny"%>
<%@page import="com.miracle.sharebazar.service.comment.CommentBean"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${empty session.name }">
	<c:redirect url="index.jsp"></c:redirect>


</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>


<title>Post Comment</title>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.commentHeader {
	color: #FFFFFF;
	font-size: 14px;
	font-weight: bold;
	line-height: 28px;
	margin-bottom: 10px;
	margin-left: 0;
	margin-right: 0;
	margin-top: 18px;
	padding-bottom: 0;
	padding-left: 12px;
	padding-right: 12px;
	padding-top: 0;
	border-radius: 10px;
	background-color: maroon;
}

.commentBox {
	width: 700px;
	height: auto;
	border-radius: 10px;
	background-color: white;
	color: navy;
	padding: 10px;
	height: auto;
}

.commentBox:HOVER {
	background-color: silver;
}
</style>

</head>

<body>
	<jsp:include page="headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include>

	<div class="rightpan">
		<!-- class=rightpan added here -->

		<div style="width: 80%; margin-left: 30px; margin-top: 60px;">

			<!-- Now comments are being displayed according to the condition -->


			<c:choose>


				<c:when test="${size<=0}">

					<div>
						<div class="commentHeader">(0) Comments</div>
						<div class="commentBox">Please give your feedback</div>

					</div>
				</c:when>



				<c:otherwise>

					<c:forEach items="${list}" var="bean2">

						<div class="commentHeader" style="background-color: navy;">${bean2.userName
							} says on : ${bean2.date }</div>
						<div class="commentBox">${bean2.comment }</div>





					</c:forEach>
					<div class="commentHeader">Total (${size }) Comments</div>
				</c:otherwise>
			</c:choose>








			<form action="commentPost.action" method="post">



				<table>
					<tbody>
						<tr>
							<td colspan="2"><div class="commentHeader" style="">Leave
									a comment</div></td>
						<tr>
							<td class="row" style="vertical-align: top;">Your <br>Comment
							</td>
							<td class="row"><textarea id="visitorComment" name="comment"
									rows="6" cols="50" required=""></textarea></td>
						</tr>
						<tr>
							<td><input id="submitBtn" type="submit" value="Post" /></td>

						</tr>
					</tbody>
				</table>

			</form>
		</div>
	</div>



	<!-- <jsp:include page="footerHome.jsp"></jsp:include>  -->
</body>
</html>
