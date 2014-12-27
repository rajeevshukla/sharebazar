package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.customer.model.BuySellShareHistoryForm;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.ActionSupport;

public class BuySellShareHistoryAction  extends ActionSupport{


	Logger logger=Logger.getLogger(getClass());
	private static final long serialVersionUID = 5197225901196242391L;
	private List<BuySellShareHistoryForm> buyHistory = new ArrayList<BuySellShareHistoryForm>();
	private List<BuySellShareHistoryForm> sellHistory = new ArrayList<BuySellShareHistoryForm>();


	@Override
	public String execute() throws Exception {

		HttpSession session=ServletActionContext.getRequest().getSession();
		 session.setAttribute("companyInfoBackURL", "viewCustomerShare.action");
		   System.out.println("settting company info back url.");
		
		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();

		PreparedStatement buyHistoryStatement= connection.prepareStatement("SELECT * FROM  BUYER_SELLER_MASTER  WHERE BUYER_MEMBERSHIP_ID=? ORDER BY DATE DESC");
		buyHistoryStatement.setString(1, ApplicationUtilities.getCurrentMemberIdFromSession());

		PreparedStatement sellHistoryStatement= connection.prepareStatement("SELECT * FROM  BUYER_SELLER_MASTER  WHERE SELLER_MEMBERSHIP_ID=? ORDER BY DATE DESC");
		sellHistoryStatement.setString(1, ApplicationUtilities.getCurrentMemberIdFromSession());

		ResultSet buyerSet  =	buyHistoryStatement.executeQuery();
		ResultSet sellerSet = sellHistoryStatement.executeQuery();
		
		while (buyerSet.next()) {
			BuySellShareHistoryForm buySellShareHistoryForm=new BuySellShareHistoryForm();
 
    		buySellShareHistoryForm.setMemberShipId(buyerSet.getString("SELLER_MEMBERSHIP_ID"));
    		buySellShareHistoryForm.setLoginName(buyerSet.getString("SELLER_LOGIN_ID"));
    		buySellShareHistoryForm.setShareType(buyerSet.getString("SHARE_TYPE"));
			buySellShareHistoryForm.setNoOfShares(buyerSet.getInt("NO_OF_SHARE"));
			buySellShareHistoryForm.setRatePerShare(buyerSet.getDouble("RATE_PER_SHARE"));
			buySellShareHistoryForm.setTransactionDate(buyerSet.getTimestamp("DATE"));
  			buySellShareHistoryForm.setTotalAmount(buySellShareHistoryForm.getRatePerShare()*buySellShareHistoryForm.getNoOfShares());			    
  			 getBuyHistory().add(buySellShareHistoryForm);

		}
		while (sellerSet.next()) {
             System.out.println("inside sell history...");
			BuySellShareHistoryForm buySellShareHistoryForm=new BuySellShareHistoryForm();
    		buySellShareHistoryForm.setMemberShipId(sellerSet.getString("BUYER_MEMBERSHIP_ID"));
    		buySellShareHistoryForm.setLoginName(sellerSet.getString("BUYER_LOGIN_ID"));
    		buySellShareHistoryForm.setShareType(sellerSet.getString("SHARE_TYPE"));
			buySellShareHistoryForm.setNoOfShares(sellerSet.getInt("NO_OF_SHARE"));
			buySellShareHistoryForm.setRatePerShare(sellerSet.getDouble("RATE_PER_SHARE"));
			buySellShareHistoryForm.setTransactionDate(sellerSet.getTimestamp("DATE"));
  			buySellShareHistoryForm.setTotalAmount(buySellShareHistoryForm.getRatePerShare()*buySellShareHistoryForm.getNoOfShares());			    
  			 getSellHistory().add(buySellShareHistoryForm);
		}
		 connection.close();
		return ActionSupport.SUCCESS;
	}


	public List<BuySellShareHistoryForm> getBuyHistory() {
		return buyHistory;
	}


	public List<BuySellShareHistoryForm> getSellHistory() {
		return sellHistory;
	}


	public void setBuyHistory(List<BuySellShareHistoryForm> buyHistory) {
		this.buyHistory = buyHistory;
	}


	public void setSellHistory(List<BuySellShareHistoryForm> sellHistory) {
		this.sellHistory = sellHistory;
	}



}
