<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<c:if test="${empty session.name}">
	<c:redirect url="index.jsp"></c:redirect>
</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
</style>


<title>Select company</title>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function changeCompany() {
		var getSelect = document.getElementById("companyName");
		var companyId = document.getElementById("getcompanyid");
		var len = getSelect.selectedIndex;
		var memberShipId = companyId.options[len].value;
		document.getElementById("companyId").value=memberShipId;
		
		/* alert(memberShipId);
		 */
		// companyinfo gives the details of selected comapny by forwording it to action class and attacing all the info in dispatcher. resp. objecct
	}
	function CheckCompany()
		{
	
		var value=document.getElementById("companyId").value;
		
		if(value.length<=0)
		{
		
		alert("Please select the company First");
		return false;
		
		}
		
		}
</script>
</head>

<body>
	<jsp:include page="../common/headerHome.jsp"></jsp:include>
	<jsp:include page="sideMenuCustomer.jsp"></jsp:include>


	<div class="abc" style="float: left;">
		<div style="margin: 20px; padding: 20px;">


			<h4 class="commentformTitle">Select Company name ...</h4>
			<div style="padding: 20px; font-size: 10px;">

				<form action="contactwithcompanyPost.action" method="post">
					<input type="hidden" name="memberShipId" id="companyId">
					<table style="font-size: 13px;">
						<tbody>

							<tr>
								<td class="row"><label>company Name</label></td>
								<td class="row"><sx:autocompleter id="companyName"
										list="companyList" name="companyName"
										onchange="changeCompany()"></sx:autocompleter> <sx:autocompleter
										list="companyId" cssStyle="display : none;" id="getcompanyid"></sx:autocompleter>
								</td>

							</tr>
							<tr>
								<td class="row" style="vertical-align: top;">Your <br>
									Message
								</td>
								<td class="row"><textarea id="visitorComment"
										name="customerMessageToCompany" rows="6" cols="50" required=""></textarea>
								</td>
						</tbody>
					</table>
					<input id="submitBtn" type="submit" value="Send"
						onclick="return CheckCompany();" /> <span id="submitConfirm"
						style="display: none;"> <img id="submitConfirmImg"
						src="./Html5 File Upload with Progress On Matlus_files/ok.png"
						alt="Your Comment has been submitted"
						style="vertical-align: middle;" /> Your Comment has been
						submitted. Thankyou!
					</span>
				</form>
			</div>

		</div>









	</div>




	<jsp:include page="../common/footerHome.jsp"></jsp:include>
</body>
</html>
