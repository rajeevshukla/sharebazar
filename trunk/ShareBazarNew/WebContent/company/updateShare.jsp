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

<script type="text/javascript">
	$(document).ready(function() {

		var value = '<c:out value="${shareType}"></c:out>';
		$("#newShareType").val(value);

	});

	function validate() {

		var newShareType = $("#newShareType").val();
		var newShareRate=$("#newShareRate").val();
		if (newShareType == -1) {
			alert("Please select valid share type");
			return false;
		}
 
      if(newShareRate<0 ){
           alert("Please select valid share rate " );
           return false;
      }


     return true;

	}
</script>

</head>

<body>
	<jsp:include page="../company/companyHeader.jsp"></jsp:include>
	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">
				<div>
					<s:fielderror></s:fielderror>
					<form action="updateShare.action" method="post" class="text"
						onsubmit="return validate();">
						<h4 class="commentformTitle">Update Share.......</h4>
						<div style="padding: 20px; font-size: 10px;">
							<table style="font-size: 13px;">
								<tbody>
									<tr>
										<td class="row"><label for="visitorFirstName">
												Share Type</label></td>
										<td class="row"><select name="newShareType"
											id="newShareType">
												<option value="-1" selected="selected">Select Share
													Type</option>
												<option value="ordinary">Ordinary</option>
												<option value="equity">Equity</option>
												<option value="preferential">Preferential</option>
										</select></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName"> No
												of shares (available)</label></td>
										<td class="row"><input type="text" style="width: 100px;"
											class="short" disabled="disabled" value="${availableShare }" /></td>

									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Old
												Rate per Share</label></td>
										<td class="row"><input type="text" class="short"
											required="" style="width: 100px;" id="ratePerShare"
											disabled="disabled" value="${ratePerShare}" />Rs.</td>

									</tr>
									<tr>

										<td class="row"><label for="visitorLastName"> New
												rate per share<font style="font-size: 8px; color: green;">(for
													buying)</font>
										</label></td>
										<td class="row"><input type="text" id="newShareRate"
											name="newShareRate" class="short" required=""
											style="width: 180px;" />&nbsp;&nbsp;</td>
									</tr>
									<tr>
										<td class="row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
										<td class="row">
										<c:choose>
										<c:when test="${deleted}">
										 <span style="color : red;">Your share has been deleted. You  are not visible to market Please add share to do so. </span>
										</c:when>
										<c:otherwise>
										
										<input type="submit" value="Update" />
											<input type="reset" value="Reset" />
                                         </c:otherwise>
                                         </c:choose>
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
