<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@include file="../common/common.jsp" %>
<c:if test="${empty session.name}">
	<c:redirect url="index.jsp"></c:redirect>


</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>


<title>Sell Share</title>
<script type="text/javascript" src="script/sellcust.js">
	
</script>


</head>

<body>
	<%-- <br><jsp:include page="../common/headerHome.jsp"></jsp:include> --%>
	<jsp:include page="../customer/customerHeader.jsp"></jsp:include>


	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">
	

		<div>

			<form action="customerSellShare.action" method="post" class="text">


				<input type="hidden" name="availableShare" id="noOfShareH" /> <input
					type="hidden" name="availableShare" id="noOfShareH" /> <input
					type="hidden" name="ratePerSharePost" id="rateH" /> <input
					type="hidden" name="shareTypePost" id="typeH" /> <input
					type="hidden" name="totalAmount" id="amountH" /> <input
					type="hidden" name="companyId" id="companyH" />


				<h4 class="commentformTitle">Sell Share.......</h4>
				<div style="padding: 20px; font-size: 10px;">


					<table style="font-size: 13px;">
						<tbody>

							<tr>
								<td class="row"><label for="visitorFirstName">company
										Name</label></td>
								<td class="row"><sx:autocompleter list="companyList"
										name="companyName" id="company" autoComplete="true"
										onchange="fill();"></sx:autocompleter></td>

							</tr>
							<tr>

								<sx:autocompleter list="noOfShare" cssStyle="display : none;"
									id="shareno"></sx:autocompleter>

								<sx:autocompleter list="shareType" cssStyle="display : none;"
									id="sharetype"></sx:autocompleter>

								<sx:autocompleter cssStyle="display : none;" list="ratePerShare"
									id="rateget"></sx:autocompleter>

								<sx:autocompleter list="companyId" cssStyle="display : none;"
									id="getcompanyid"></sx:autocompleter>

								<td class="row"><label for="visitorLastName"> No of
										shares (available)</label></td>
								<td class="row"><input type="text" name="noOfShare"
									style="width: 100px;" class="short" required=""
									disabled="disabled" id="noOfShare" /> <input type="text"
									name="noOfShare" style="width: 180px;" class="short"
									required="" disabled="disabled" id="shareType" /></td>

							</tr>
							<tr>
								<td class="row"><label for="visitorLastName">Rate
										per Share</label></td>
								<td class="row"><input type="text" name="ratePerShare"
									class="short" required="" style="width: 100px;"
									disabled="disabled" id="ratePerShare" />Rs.</td>

							</tr>
							<tr>
								<td class="row"><label for="visitorLastName">You
										have </label></td>
								<td class="row"><input type="text" name="customerShare"
									class="short" required="" style="width: 100px;"
									disabled="disabled" id="customerShare" value="${share}" />Shares
									<input type="hidden" name="customerShare" value="${share}">

								</td>

							</tr>
							<tr>
								<td class="row"><label for="visitorLastName"> No of
										shares <font style="font-size: 8px; color: green;">(for
											sell)</font>
								</label></td>
								<td class="row"><input type="text" id="noOfShareForSell"
									name="noOfShareForSell" class="short" required=""
									style="width: 180px;" onkeyup="return calculate(this.value)" />&nbsp;&nbsp;<font
									color="red" size="1">(Becarefull)</font></td>

							</tr>
							<tr>
								<td class="row"><label for="visitorLastName">Sell
										Amount</label></td>
								<td class="row"><input type="text" name="totalAmount"
									class="short" style="width: 100px;" disabled="disabled"
									id="sellAmt" />Rs.</td>
							</tr>

							<tr>

								<td class="row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td class="row"><input type="submit" value="Buy" /> <input
									type="reset" value="Reset" /></td>

							</tr>
						</tbody>
					</table>


				</div>



			</form>
		</div>

	</div>


</div>
</div>



	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
