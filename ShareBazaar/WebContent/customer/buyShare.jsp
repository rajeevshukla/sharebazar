<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@include file="../common/common.jsp"%>

<c:if test="${empty session.name}">
	<c:redirect url="index.jsp"></c:redirect>


</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>



<title>Buy Share</title>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript" src="script/buy.js">
	
</script>


</head>

<body>

	<jsp:include page="../customer/customerHeader.jsp"></jsp:include>


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

						<h4 class="commentformTitle">Buy Share.......</h4>
						<div style="padding: 20px; font-size: 10px;">


							<table style="font-size: 13px;">
								<tbody>

									<tr>
										<td class="row"><label for="visitorFirstName">company
												Name</label></td>
										<td class="row"><sx:autocompleter list="companyList"
												name="companyNamePost" id="company" autoComplete="true"
												showDownArrow="" onchange="fill();"></sx:autocompleter></td>

									</tr>
									<tr>

										<sx:autocompleter list="noOfShare" cssStyle="display : none;"
											id="shareno"></sx:autocompleter>

										<sx:autocompleter list="shareType" cssStyle="display : none;"
											id="sharetype"></sx:autocompleter>

										<sx:autocompleter cssStyle="display : none;"
											list="ratePerShare" id="rateget"></sx:autocompleter>
										<sx:autocompleter list="companyId" cssStyle="display : none;"
											id="getcompanyid"></sx:autocompleter>

										<td class="row"><label for="visitorLastName"> No
												of shares (available)</label></td>
										<td class="row"><input type="text" style="width: 100px;"
											class="short" required="" disabled="disabled" id="noOfShare" />
											<input type="text" name="shareType" style="width: 180px;"
											class="short" required="" disabled="disabled" id="shareType" />
										</td>

									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Rate
												per Share</label></td>
										<td class="row"><input type="text" class="short"
											required="" style="width: 100px;" disabled="disabled"
											id="ratePerShare" />Rs.</td>

									</tr>
									<tr>

										<td class="row"><label for="visitorLastName"> No
												of shares <font style="font-size: 8px; color: green;">(for
													buying)</font>
										</label></td>
										<td class="row"><input type="text" id="buyshare"
											name="buySharePost" class="short" required=""
											style="width: 180px;" onkeyup="calculateAmount(this.value)" />&nbsp;&nbsp;<font
											color="red" size="1">(Becarefull)</font></td>

									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Total
												amount</label></td>
										<td class="row"><input type="text"
											name="tranPasswordPost" id="showamount" class="short"
											required="" style="width: 100px;" disabled="disabled" />(this
											amount will be deducted from your account)</td>

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

	<jsp:include page="../customer/customerFooter.jsp"></jsp:include>
</body>
</html>
