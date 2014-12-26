<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<title>Update Share</title>

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
					<form action="addMoreShare.action" method="post" class="text">
						<h4 class="commentformTitle">Add More Share.......</h4>
						<div style="padding: 20px; font-size: 10px;">
							<c:if test="${deleted}">
								<span style="color: red;">Your share is deleted please add share to enable your visibility in market.
								</span>
							</c:if>

							<table style="font-size: 13px;">
								<tbody>
									<tr>
										<td class="row"><label for="visitorFirstName">Share
												Type </label></td>
										<td class="row"><input type="text" style="width: 100px;"
											class="short" disabled="disabled" value="${shareType}" /></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName"> No
												of shares (available)</label></td>
										<td class="row"><input type="text" style="width: 100px;"
											class="short" disabled="disabled" value="${availableShare}" /></td>
									</tr>
									<tr>

										<td class="row"><label for="visitorLastName"> Add
												More shares<font style="font-size: 8px; color: green;"></font>
										</label></td>
										<td class="row"><input type="text" id="buyshare"
											name="shareToAdd" class="short" required=""
											style="width: 180px;" />&nbsp;&nbsp;</td>
									</tr>
									<tr>
										<td class="row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
										<td class="row"><input type="submit" value="Add"
											onclick="return buy();" /> <input type="reset" value="Reset" />

										</td>
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
