<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<title>ShareHolders</title>

<style type="text/css">
.body2 {
	min-height: 400px;
}
</style>

</head>

<body>
	<jsp:include page="../company/companyHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">
				<form action="#" class="text">
 <h3 style="font-size: 18px;"> ShareHolders List ...</h3>
					<table class="bordered">
						<thead>
							<tr>
								<th>Customer Name</th>
								<th>Shares</th>
								<th>Rate</th>
								<th>Total </th>
								<th>Date Of Share PurChased</th>
							</tr>
						</thead>
						<tbody>

                        <c:forEach var="shareHolderDetails"  items="${shareHoldersListForms}">
							<tr>
								<td><a href="#">${shareHolderDetails.customerLoginId}</a></td>
								<td> ${shareHolderDetails.noOfShares}</td>
								<td> ${shareHolderDetails.ratePerShare}</td>
								<td> ${shareHolderDetails.totalCostOfShares}</td>
								<td> <fmt:formatDate value="${shareHolderDetails.date}" pattern="dd-MMM-yyyy hh:mm a"/> </td>
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
