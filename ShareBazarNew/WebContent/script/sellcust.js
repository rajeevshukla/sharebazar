function fill() {

	var getSelect = document.getElementById("company");
	var noofshare = document.getElementById("shareno");
	var sharetype = document.getElementById("sharetype");
	var companyId = document.getElementById("getcompanyid");
	var rate = document.getElementById("rateget");
	var share=document.getElementById("noOfShareForSell").value;
	var len = getSelect.selectedIndex; // finding the index of any one list

	// getting values from the list which comes from the action class
	var val = noofshare.options[len].value;
	var val2 = sharetype.options[len].value;
	var val3 = rate.options[len].value;
	var val4 = companyId.options[len].value;

	// setting values to the text boxes which are hidden
	document.getElementById("noOfShare").value = val;
	document.getElementById("shareType").value = val2 + "  Shares";
	document.getElementById("ratePerShare").value = val3;
	/* alert(" in fill"); */

	// setting values to the hidden fields for carry out seleced information

	document.getElementById("noOfShareH").value = val;
	
	document.getElementById("rateH").value = val3;
	
	document.getElementById("typeH").value = val2;
	
	document.getElementById("companyH").value = val4;
	
	calculate(share);
	}


function calculate(share) {
	
	var ratePerShare=document.getElementById("ratePerShare").value;
	var noOfShare=document.getElementById("noOfShare").value;
   if(ratePerShare!=0)
	{
	   
	   var amount=share*ratePerShare;
	  
	   document.getElementById("sellAmt").value=amount;
	   document.getElementById("amountH").value=amount;
	}
   else 
	   {
	 alert(" Please select another company");
	 return false;
	   }
}