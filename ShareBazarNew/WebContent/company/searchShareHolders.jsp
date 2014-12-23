<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<title>Search Shareholders</title>

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
				<div>
					<s:fielderror></s:fielderror>
					<form action="#" method="post" class="text">
						<h4 class="commentformTitle">Search Shareholders</h4>
						<div style="padding: 20px; font-size: 10px;">
							<table style="font-size: 13px;">
								<tbody>
									<tr>
										<td class="row"><label for="visitorFirstName">Shareholder Name  </label></td>
										<td class="row"><input type="text" style="width: 100px;"
											         /></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName"> No
												of shares (available)</label></td>
										<td class="row"><input type="text" style="width: 100px;"
											class="short" disabled="disabled" value="${availableShare}" /></td>
									</tr>
								</tbody>
							</table>
						</div>
					</form>
				</div>

			</div>
		</div>
	</div>
	<jsp:include page="../company/companyFooter.jsp"></jsp:include>
</body>
</html>
