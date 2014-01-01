package com.miracle.sharebazar.service.common;

import net.webservicex.stock.StockQuote;
import net.webservicex.stock.StockQuoteSoap;

import com.opensymphony.xwork2.Action;

public class StockQuoteAction {

	
	
	public String execute(){
		
		StockQuote stockQuote=new StockQuote();
	StockQuoteSoap stockQuoteSoap=	stockQuote.getStockQuoteSoap();
	
		
		
		return Action.SUCCESS;
	}
}
