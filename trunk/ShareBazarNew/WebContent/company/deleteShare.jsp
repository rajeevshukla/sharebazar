<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@include file="../common/common.jsp"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<title>Delete Share</title>

<style type="text/css">
.body2 {
	min-height: 400px;
}
</style>

<script type="text/javascript">
 
  function submitDetails(){
      
       if(confirm("Do you really want to delete your share ?\n Once you delete your shares you ll no longer visibile to market untill you add shares. Continue ? ")){
         return true;
       }else 
       
       return false;
    
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
					<form action="deleteShare.action" method="post" class="text" onsubmit="return submitDetails();">
						<h4 class="commentformTitle">Delete Share.......</h4>
						<div style="padding: 20px; font-size: 10px;">
							<table style="font-size: 13px;">
								<tbody>
									<tr>
										<td class="row"><label for="visitorFirstName">
												Share Type</label></td>
										<td class="row"><input type="text" disabled="disabled" value="${shareType}"></td>
									</tr>
									<tr>
										<td class="row"><label for="visitorLastName"> No of shares (available)</label></td>
										<td class="row"><input type="text" style="width: 100px;"
											class="short" disabled="disabled" value="${availableShare }" /></td>

									</tr>
									<tr>
										<td class="row"><label for="visitorLastName">Rate Per Share</label></td>
										<td class="row"><input type="text" class="short" required="" style="width: 100px;" id="ratePerShare"
											 disabled="disabled" value="${ratePerShare}" />Rs.</td>

									</tr>
									<tr>
									<tr>
										<td class="row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
										<td class="row">
										 <c:choose>
										<c:when test="${deleted}">
										 <span style="color : red;">Your account is locked for share related modification ! Contact support to re enable it .  </span>
										</c:when>
										<c:otherwise>
										
										<input type="submit" value="Delete"  style="color: red";
											 />
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
