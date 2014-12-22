package com.miracle.sharebazar.decorator;

import org.displaytag.decorator.TableDecorator;

import com.miracle.sharebazar.customer.model.BuySellShareHistoryForm;

public class CustomTableDecorator extends TableDecorator {

	
	 public String getCompanyDetails(){
		 BuySellShareHistoryForm buyShareForm=(BuySellShareHistoryForm)getCurrentRowObject();
         		 
		 String link="";
		 
		 return link;
		 
		 
		 
	 }
}
