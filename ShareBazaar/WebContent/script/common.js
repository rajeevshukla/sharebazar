function getCurrencyValue(){
	var from=$("#currency_from").val();
	var to=$("#currency_to").val();
	alert("calling");
	$.get("getCurrencyDetails.action",{from:from, to: to},function(data){
		
		alert(data);
		
	});
	
}