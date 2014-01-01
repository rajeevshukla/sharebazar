package com.miracle.sharebazar.service.common;

import net.webservicex.currencyconvertor.Currency;
import net.webservicex.currencyconvertor.CurrencyConvertor;
import net.webservicex.currencyconvertor.CurrencyConvertorSoap;

import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.ActionSupport;

public class CurrencyCoverterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String from;
	private String to;
    private double  result;
    private String fromCountryName;
    private  String toCountryName;
	public String getFromCountryName() {
		return fromCountryName;
	}

	public void setFromCountryName(String fromCountryName) {
		this.fromCountryName = fromCountryName;
	}

	public String getToCountryName() {
		return toCountryName;
	}

	public void setToCountryName(String toCountryName) {
		this.toCountryName = toCountryName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public String execute() throws Exception {
		
	
		 setFromCountryName(ApplicationUtilities.getCountryNameFromCurrencyId(getFrom()));
		 setToCountryName(ApplicationUtilities.getCountryNameFromCurrencyId(getTo()));
		CurrencyConvertor convertor=new CurrencyConvertor();
		CurrencyConvertorSoap convertorSoap= convertor.getCurrencyConvertorSoap();
	    double response=  convertorSoap.conversionRate(Currency.fromValue(getFrom()), Currency.fromValue(getTo()));
	    setResult(response);
		return SUCCESS;
	}

}
