<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
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
					<form action="customerBuyShare.action" method="post" class="text">


						<input type="hidden" name="availableShare" id="noOfShareH" /> <input
							type="hidden" name="ratePerSharePost" id="rateH" /> <input
							type="hidden" name="shareTypePost" id="typeH" /> <input
							type="hidden" name="totalAmount" id="amountH" /> <input
							type="hidden" name="companyId" id="companyH" />

						<h4 class="commentformTitle">Update Share.......</h4>
						<div style="padding: 20px; font-size: 10px;">
							<table style="font-size: 13px;">
								<tbody>

									<tr>
										<td class="row"><label for="visitorFirstName">Select Share</label></td>
										<td class="row"><input type="text" class="sort" readonly="readonly" value="Equity Share"></td>

									</tr>
									<tr>

								

									

										
										<td class="row"><label for="visitorLastName"> No 	of shares (available)</label></td>
										<td class="row"><input type="text" style="width: 100px;"
											class="short" readonly="readonly" value="500" />
											
										</td>

									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Old Rate per Share</label></td>
										<td class="row"><input type="text" class="short" required="" style="width: 100px;"
											id="ratePerShare" readonly="readonly" value="1000"/>Rs.</td>

									</tr>
									<tr>

										<td class="row"><label for="visitorLastName"> New rate per share<font style="font-size: 8px; color: green;">(for	buying)</font>
										</label></td>
										<td class="row"><input type="text" id="buyshare"	name="buySharePost" class="short" required=""
											style="width: 180px;" onkeyup="calculateAmount(this.value)" readonly="readonly" value="1200"/>&nbsp;&nbsp;<font	color="red" size="1">(Becarefull)</font></td>

									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Total amount</label></td>
										<td class="row"><input type="text"		name="tranPasswordPost" id="showamount" class="short"
											required="" style="width: 100px;" readonly="readonly" value="200"/>(this amount will be deducted from your account)</td>
									</tr>

									<tr>
										<td class="row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
										<td class="row"><input type="submit" value="Buy"
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
