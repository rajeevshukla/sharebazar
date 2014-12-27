package com.miracle.sharebazar.decorator;

import org.displaytag.decorator.TableDecorator;

import com.miracle.sharebazar.customer.model.BuySellShareHistoryForm;

public class CustomTableDecorator extends TableDecorator {

	
	 public String getShareHolderDetails(){
		 BuySellShareHistoryForm buyShareForm=(BuySellShareHistoryForm)getCurrentRowObject();
		 String link="<a href='viewShareHolderDetails.action?memberId="+buyShareForm.getMemberShipId()+"'>"+buyShareForm.getLoginName()+"</a>";
		 return link;
	 }
	 
	 public String getCompanyDetails(){
		 BuySellShareHistoryForm buyShareForm=(BuySellShareHistoryForm)getCurrentRowObject();
		 String link="<a href='companyInfo.action?memberShipId="+buyShareForm.getMemberShipId()+"'>"+buyShareForm.getLoginName()+"</a>";
		 return link;
	 }
}
