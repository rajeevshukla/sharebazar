$(document).ready(function() {

	$("#dialog").dialog({
		autoOpen:false,
		model : true,
		height: 300,
		width : 480,
		resizable :false,

		/* buttons: [ { text: "Ok", click: function() { $( this ).dialog( "close" ); } } ] */

	});

	$("#dialog").parent("div").css("top","160px;");

	$(function() {
		$("#tabs").tabs();
	});



});



function getCurrencyValue(){
	var from=$("#currency_from").val();
	var to=$("#currency_to").val();

	/*$.get("../common/getCurrencyDetails.action",{from:from, to: to},function(data){

		alert(data);

	});*/

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