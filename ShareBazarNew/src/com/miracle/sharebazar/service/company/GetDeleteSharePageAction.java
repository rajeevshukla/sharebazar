package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.service.common.CommonServiceProvider;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class GetDeleteSharePageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1014166227598256975L;
	private String shareType;
	private int availableShare;
	private double ratePerShare;
	private boolean deleted;
	CommonServiceProvider commonServiceProvider = new CommonServiceProvider();

	@Override
	public String execute() throws Exception {

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT RATE_PER_SHARE,AVAILABLE_SHARE,SHARE_TYPE,IS_DELETED FROM COMPANY_SHARE_MASTER   WHERE MEMBERSHIP_ID=?");
			statement.setString(1,
					ApplicationUtilities.getCurrentMemberIdFromSession());
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				ratePerShare = rs.getDouble(1);
				availableShare = rs.getInt(2);
				shareType = rs.getString(3);
				deleted=rs.getBoolean(4);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Action.SUCCESS;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getShareType() {
		return shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public int getAvailableShare() {
		return availableShare;
	}

	public void setAvailableShare(int availableShare) {
		this.availableShare = availableShare;
	}

	public double getRatePerShare() {
		return ratePerShare;
	}

	public void setRatePerShare(double ratePerShare) {
		this.ratePerShare = ratePerShare;
	}

}
