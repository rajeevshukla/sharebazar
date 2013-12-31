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
	
	$.get("../common/getCurrencyDetails.action",{from:from, to: to},function(data){
		
		alert(data);
		
	});
	
}


function openLoginDialog(){
	
	
	$("#dialog").dialog("open");
}