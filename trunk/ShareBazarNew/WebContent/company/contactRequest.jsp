<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<title>ShareHolders</title>

<style type="text/css">
.body2 {
	min-height: 400px;
}

.norm{

 }
 .new {
   background-color: silver;
   }
</style>

</head>

<body>
	<jsp:include page="../company/companyHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">
				<form action="#" class="text">
 <h3 style="font-size: 18px;"> Contact Request.. </h3>
					<table class="bordered">
						<thead>
							<tr>
								<th>Customer Name </th>
								<th>Date </th>
								<th>Message</th>
							</tr>
						</thead>
						<tbody>
				
				 <c:forEach var="contactDetails" items="${contactRequestList}">
						  
						   <c:choose>
						     <c:when test="${!contactDetails.notRead}">
						   <c:set var="className" value="new"></c:set>   
						     </c:when>
						     <c:otherwise>
						     <c:set value="className" var="norm"></c:set>
						      </c:otherwise>
						    </c:choose>
						 
						  	<tr class="${className}">
								<td><a href="#">${contactDetails.customerUserName}</a></td>
								<td>${contactDetails.date}</td>
								<td>${contactDetails.customerMessage}</td>
							</tr>
							</c:forEach>


						</tbody>
					</table>

			</form>

			</div>
		</div>
	</div>
	<jsp:include page="../company/companyFooter.jsp"></jsp:include>
</body>
</html>
