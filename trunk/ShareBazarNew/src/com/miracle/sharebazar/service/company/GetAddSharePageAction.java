package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.service.common.CommonServiceProvider;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.ActionSupport;

public class GetAddSharePageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8137664890040540799L;

	private int availableShare;
	private String shareType;
	private double ratePerShare;
    private boolean deleted;
	private CommonServiceProvider serviceProvider = new CommonServiceProvider();

	@Override
	public String execute() throws Exception {
		
		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT RATE_PER_SHARE,AVAILABLE_SHARE,SHARE_TYPE ,IS_DELETED FROM COMPANY_SHARE_MASTER   WHERE MEMBERSHIP_ID=?");
			statement.setString(1, ApplicationUtilities.getCurrentMemberIdFromSession());
			ResultSet  rs=  statement.executeQuery();
			if(rs.next()){
				
				ratePerShare=rs.getDouble(1);
				availableShare=rs.getInt(2);
				shareType=rs.getString(3);
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
		
		
		
		return ActionSupport.SUCCESS;

	}

	public int getAvailableShare() {
		return availableShare;
	}

	public void setAvailableShare(int availableShare) {
		this.availableShare = availableShare;
	}

	public String getShareType() {
		return shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public double getRatePerShare() {
		return ratePerShare;
	}

	public void setRatePerShare(double ratePerShare) {
		this.ratePerShare = ratePerShare;
	}

	public CommonServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(CommonServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
}
