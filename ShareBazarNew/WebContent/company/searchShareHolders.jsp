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


<style>
.ui-autocomplete-loading {
	background: white url("../images/ui-anim_basic_16x16.gif") right center
		no-repeat;
}
</style>


<script type="text/javascript">
	$(function() {
		function log(message) {
			$("<div>").text(message).prependTo("#log");
			$("#log").scrollTop(0);
		}
		$( "#search" ).autocomplete({
					source : "getShareHolders.action",
					minLength : 2,
					select : function(event, ui) {
						log(ui.item ? "Selected: " + ui.item.value + " aka "
								+ ui.item.id : "Nothing selected, input was "
								+ this.value);
					}
				});
	});
</script>
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
										<td class="row"><label for="visitorFirstName">Shareholder
												Name </label></td>
										<td class="row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
											type="text" id="search" placeholder="Type Share holder name !!" /></td>
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
