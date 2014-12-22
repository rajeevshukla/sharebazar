package com.miracle.sharebazar.service.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.company.model.TransactionHistoryDetailsForm;
import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class TransactionHistory extends ActionSupport {

	private static final long serialVersionUID = 5197225901196242391L;
	private List<TransactionHistoryDetailsForm> creditHistory = new ArrayList<TransactionHistoryDetailsForm>();
	private List<TransactionHistoryDetailsForm> debitHistory = new ArrayList<TransactionHistoryDetailsForm>();
	private List<TransactionHistoryDetailsForm> sellHistory = new ArrayList<TransactionHistoryDetailsForm>();

	
	@Override
	public String execute() throws Exception {

		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();

		HttpSession session = ServletActionContext.getRequest().getSession();
		String memberId = (String) session.getAttribute("memberId");
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM CUSTOMER_TRANSACTION WHERE MEMBERSHIP_ID=?");
		ps.setString(1, memberId);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			if(rs.getString("REMARK").equalsIgnoreCase("credit")){
				TransactionHistoryDetailsForm transactionHistoryForm = new TransactionHistoryDetailsForm();
				transactionHistoryForm.setTransactionAmount(rs.getFloat("AMOUNT"));
				transactionHistoryForm.setTransactionDoneByUserName(rs.getString("CARD_HOLDER_NAME"));
				transactionHistoryForm.setTransactionDate(rs.getTimestamp("DATE"));
				creditHistory.add(transactionHistoryForm);
			}
			
			else if(rs.getString("REMARK").equalsIgnoreCase("debit")){
				TransactionHistoryDetailsForm transactionHistoryForm = new TransactionHistoryDetailsForm();
				transactionHistoryForm.setTransactionAmount(rs.getFloat("AMOUNT"));
				transactionHistoryForm.setTransactionDoneByUserName(rs
						.getString("CARD_HOLDER_NAME"));
				transactionHistoryForm.setTransactionDate(rs.getTimestamp("DATE"));
				debitHistory.add(transactionHistoryForm);
			}	
	}
		return SUCCESS;
	}

	public List<TransactionHistoryDetailsForm> getCreditHistory() {
		return creditHistory;
	}

	public void setCreditHistory(List<TransactionHistoryDetailsForm> creditHistory) {
		this.creditHistory = creditHistory;
	}

	public List<TransactionHistoryDetailsForm> getDebitHistory() {
		return debitHistory;
	}

	public void setDebitHistory(List<TransactionHistoryDetailsForm> debitHistory) {
		this.debitHistory = debitHistory;
	}

	public List<TransactionHistoryDetailsForm> getSellHistory() {
		return sellHistory;
	}

	public void setSellHistory(List<TransactionHistoryDetailsForm> sellHistory) {
		this.sellHistory = sellHistory;
	}

}
