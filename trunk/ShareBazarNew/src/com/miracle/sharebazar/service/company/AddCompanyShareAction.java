package com.miracle.sharebazar.service.company;

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
       		
		return  ActionSupport.SUCCESS;
	}

	public int getShareToAdd() {
		return shareToAdd;
	}

	public void setShareToAdd(int shareToAdd) {
		this.shareToAdd = shareToAdd;
	}

}
