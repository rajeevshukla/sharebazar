$(document).ready(function() {

	$("#dialog").dialog({
		autoOpen:false,
		model : true,
		height: 300,
		width : 480,
		resizable :false,
	});

	$("#dialog").parent("div").css("top","160px;");

});

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
  
		$.ajax({
			type: "GET",
			url: "../common/sendForgetPasswordMail.action",
			data: 'emailId='+emailId+'&userType='+userType,
			async: false,
			datatype:'json',
			beforeSend:function(){
				var image=new Image();
				image.src="../images/loading.gif";
				$("#forgetPasswordResult").empty().append(image);
			},
			error: function(xhr, statusText) { $("#forgetPasswordResult").empty().html("<span style='color:red;'>Error:Check your internet connection.</span>"); },
			success: function(msg){ 
				$("#forgetPasswordResult").empty().html(msg.result);
			}
		}
		);
	

}






function getCurrencyValue(){
	var from=$("#currency_from").val();
	var to=$("#currency_to").val();



	if(from!=to) {
		$.ajax({
			type: "GET",
			url: "../common/getCurrencyDetails.action",
			data: 'from='+from+'&to='+to,
			async: false,
			datatype:'json',
			beforeSend:function(){
				var image=new Image();
				image.src="../images/loading.gif";
				$("#showCurrencyRate").empty().append(image);
			},
			error: function(xhr, statusText) { $("#showCurrencyRate").empty().html("<span style='color:red;'>Error:Check your internet connection.</span>"); },
			success: function(msg){ 
				$("#showCurrencyRate").empty().html("1 "+msg.fromCountryName+ "= <span style='color:green;'>"+msg.result+"</span> "+msg.toCountryName);
			}
		}
		);
	}else {
		alert("Both currency should not be same");
	}

}


function openLoginDialog(){


	$("#dialog").dialog("open");
}