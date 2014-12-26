package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.concurrent.ExecutionException;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.service.common.CommonServiceProvider;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.ActionSupport;

public class AddCompanyShareAction  extends  ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3646542294359793414L;

	private int shareToAdd;
	CommonServiceProvider commonServiceProvider=new CommonServiceProvider();

	@Override
	public String execute() throws Exception {


		String membershipId=ApplicationUtilities.getCurrentMemberIdFromSession();
		int existingShares= commonServiceProvider.getCompanyShareForMembershipId(membershipId);
		commonServiceProvider.updateCompanyShareForMembershipId(membershipId, existingShares+getShareToAdd());

		DatabaseUtils db = new DatabaseUtils();
		Connection connection = db.getConnectionDb();
		try {
			PreparedStatement statement = connection.prepareStatement("UPDATE COMPANY_SHARE_MASTER SET IS_DELETED=?  WHERE MEMBERSHIP_ID=?");
			statement.setBoolean(1, false);
			statement.setString(2,ApplicationUtilities.getCurrentMemberIdFromSession());
			statement.executeUpdate();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return  ActionSupport.SUCCESS;
	}

	public int getShareToAdd() {
		return shareToAdd;
	}

	public void setShareToAdd(int shareToAdd) {
		this.shareToAdd = shareToAdd;
	}

}
