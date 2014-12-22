function setBuyShareProperties() {
	var getSelect = document.getElementById("company");
	var noofshare = document.getElementById("shareno");
	var sharetype = document.getElementById("sharetype");
	var companyId = document.getElementById("getcompanyid");
	var rate = document.getElementById("rateget");

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
}

function buy() {

	// checking for the validation purpose
	var noOfShare = parseInt(document.getElementById("noOfShare").value) ;
	var buyshare = parseInt(document.getElementById("buyshare").value);
	if (buyshare < 1) {
		alert("shares should be more than zero");
		return false;
	}
	if (noOfShare>0) {
		if ((noOfShare >= buyshare) && (noOfShare-buyshare)>=0) {
			return true;
		} else {
			alert("Enter no share less than or equall to selected company");
			return false;
		}
	} else {
		alert("selected company dont have enough share to buy");
		return false;

	}
	/*alert("hi" + noOfShare);*/

}
// calculating the amount for selected no of shares
function calculateAmount(share) {
	var rate = parseFloat(document.getElementById("ratePerShare").value);
	document.getElementById("showamount").value = rate * parseInt(share);
	document.getElementById("amountH").value = rate * parseInt(share);
}