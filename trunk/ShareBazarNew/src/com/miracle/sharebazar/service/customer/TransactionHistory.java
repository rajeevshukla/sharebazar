package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.company.model.TransactionHistoryForm;
import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class TransactionHistory extends ActionSupport {

	private List<TransactionHistoryForm> creditHistory = new ArrayList<TransactionHistoryForm>();
	private List<TransactionHistoryForm> debitHistory = new ArrayList<TransactionHistoryForm>();
	private List<TransactionHistoryForm> sellHistory = new ArrayList<TransactionHistoryForm>();

	@Override
	public String execute() throws Exception {

		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();

		HttpSession session = ServletActionContext.getRequest().getSession();
		String memberId = (String) session.getAttribute("memberId");
		PreparedStatement ps = connection
				.prepareStatement("SELECT * FROM CUSTOMER_TRANSACTION WHERE MEMBERSHIP_ID=?");
		ps.setString(1, memberId);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			
			 if(rs.getString("REMARK").equalsIgnoreCase("credit")){
			TransactionHistoryForm transactionHistoryForm = new TransactionHistoryForm();
			transactionHistoryForm.setAmount(rs.getFloat("AMOUNT"));
			transactionHistoryForm.setCardHolderName(rs
					.getString("CARD_HOLDER_NAME"));
			transactionHistoryForm.setTransactionDate(rs.getTimestamp("DATE"));
			creditHistory.add(transactionHistoryForm);
			}
			 else if(rs.getString("REMARK").equalsIgnoreCase("debit")){
					TransactionHistoryForm transactionHistoryForm = new TransactionHistoryForm();
					transactionHistoryForm.setAmount(rs.getFloat("AMOUNT"));
					transactionHistoryForm.setCardHolderName(rs
							.getString("CARD_HOLDER_NAME"));
					transactionHistoryForm.setTransactionDate(rs.getTimestamp("DATE"));
					debitHistory.add(transactionHistoryForm);
						 
				 
			 }
		}
		return SUCCESS;
	}

	public List<TransactionHistoryForm> getCreditHistory() {
		return creditHistory;
	}

	public void setCreditHistory(List<TransactionHistoryForm> creditHistory) {
		this.creditHistory = creditHistory;
	}

	public List<TransactionHistoryForm> getDebitHistory() {
		return debitHistory;
	}

	public void setDebitHistory(List<TransactionHistoryForm> debitHistory) {
		this.debitHistory = debitHistory;
	}

	public List<TransactionHistoryForm> getSellHistory() {
		return sellHistory;
	}

	public void setSellHistory(List<TransactionHistoryForm> sellHistory) {
		this.sellHistory = sellHistory;
	}

}
