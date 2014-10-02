package com.miracle.sharebazar.payment;

public class PaymentBean {
private String cardHolderName;
private String cardNumber;
private String cardType;
private String year;
private String month;
private int pin;
private int ccvNo;
public String getCardHolderName() {
	return cardHolderName;
}
public void setCardHolderName(String cardHolderName) {
	this.cardHolderName = cardHolderName;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public int getCcvNo() {
	return ccvNo;
}
public void setCcvNo(int ccvNo) {
	this.ccvNo = ccvNo;
}

}
