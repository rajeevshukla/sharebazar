package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.miracle.sharebazar.company.model.ViewShareHoldersListForm;
import com.miracle.sharebazar.connection.DatabaseUtils;
import com.opensymphony.xwork2.ActionSupport;

public class ViewShareHoldersAction extends ActionSupport {


	private List<ViewShareHoldersListForm> shareHoldersListForms=new ArrayList<ViewShareHoldersListForm>();

	private static final long serialVersionUID = -4552364490552329648L;

	@Override
	public String execute() throws Exception {



		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();
		HttpSession  session=ServletActionContext.getRequest().getSession();
		session.setAttribute("shareHolderInfoBackURL", "viewShareHolders.action");
		String companyMembershipId=(String)session.getAttribute("memberId");
		PreparedStatement ps= connection.prepareStatement("SELECT BM.BUYER_MEMBERSHIP_ID ,CL.LOGIN_ID,SUM(BM.NO_OF_SHARE), SUM(BM.RATE_PER_SHARE*BM.NO_OF_SHARE) AS TOTAL_AMOUNT, BM.DATE FROM BUYER_SELLER_MASTER BM , CUSTOMER_LOGIN CL WHERE CL.MEMBERSHIP_ID=BM.BUYER_MEMBERSHIP_ID AND  BM.SELLER_MEMBERSHIP_ID=? GROUP BY BM.SELLER_MEMBERSHIP_ID");

		ps.setString(1, companyMembershipId);
		ResultSet rs=  ps.executeQuery();
		while (rs.next()) {
			ViewShareHoldersListForm shareHoldersListForm=new ViewShareHoldersListForm();
			shareHoldersListForm.setCustomerLoginId(rs.getString(2));
			shareHoldersListForm.setCustomerMembershipId(rs.getString(1));
			shareHoldersListForm.setNoOfShares(rs.getInt(3));
			shareHoldersListForm.setTotalCostOfShares(rs.getDouble(4));
			shareHoldersListForm.setDate(rs.getTimestamp(5));
			getShareHoldersListForms().add(shareHoldersListForm);

		}
		return SUCCESS;
	}

	public List<ViewShareHoldersListForm> getShareHoldersListForms() {
		return shareHoldersListForms;
	}

	public void setShareHoldersListForms(
			List<ViewShareHoldersListForm> shareHoldersListForms) {
		this.shareHoldersListForms = shareHoldersListForms;
	}




}
