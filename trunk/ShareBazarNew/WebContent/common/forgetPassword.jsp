<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Forget Password</title>
<script type="text/javascript">
  
  
   function sendForgetPasswordMail(){
    
     var emailId=$("#emailId").val();
     var userType=$("#userType").val();
     
      if(userType=="-1"){
       alert("Please select User Type");
       return false;
      }
      
      if(emailId.trim()==""){
      
      alert("Please Enter valid emailId");
      
      return false;
      }
   
    
    
    $.get("sendForgetPasswordMail.action",{emailId : emailId,userType :userType},function (data){
     
     
         $("#result").empty().html(data.result);
   
    },'json')
   }
 
 
</script>

</head>

<body>

	<jsp:include page="../common/commonHeader.jsp"></jsp:include>

	<div class="body2">
		<div class="main">
			<div class="marg_top wrapper">

				<table>

					<tr>
						<td>User Type :</td>
						<td><select id="userType">
								<option value="-1">Select User Type</option>
								<option value="Customer">Customer</option>
								<option value="Company">Company</option>
						</select></td>
					</tr>
					<tr>
						<td>Registered Email Id :</td>
						<td><input type="text" name="emailId" id="emailId"></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="button" value="Send"
							onclick="sendForgetPasswordMail();"></td>
					</tr>
				</table>
				<span id="result"> </span>


			</div>
		</div>
	</div>




	<jsp:include page="../common/commonFooter.jsp"></jsp:include>
</body>
</html>