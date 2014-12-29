package com.miracle.sharebazar.service.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.json.JSONObject;

import com.miracle.sharebazar.connection.DatabaseUtils;
import com.miracle.sharebazar.utils.ApplicationUtilities;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class GetShareHolderListAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6607901235759060449L;


	List<String> resultList=new ArrayList<String>();
 
	


	@Override
	public String execute() throws Exception {

		 HttpServletRequest request=ServletActionContext.getRequest();
		 String term=request.getParameter("term");
		  
		DatabaseUtils databaseUtils = new DatabaseUtils();
		Connection connection = databaseUtils.getConnectionDb();
		HttpSession  session=ServletActionContext.getRequest().getSession();
		session.setAttribute("shareHolderInfoBackURL", "getShareHistory.action");
		
		try {
			
			PreparedStatement ps= connection.prepareStatement("SELECT CM.FIRST_NAME,CM.LAST_NAME,CM.MEMBERSHIP_ID FROM  BUYER_SELLER_MASTER BSM, CUSTOMER_MASTER CM   WHERE BSM.BUYER_MEMBERSHIP_ID=CM.MEMBERSHIP_ID AND  SELLER_MEMBERSHIP_ID=?  AND CM.FIRST_NAME LIKE ?");
			ps.setString(1, ApplicationUtilities.getCurrentMemberIdFromSession());
			ps.setString(2, "%"+term+"%");
			System.out.println("Get term :"+term);
			ResultSet rs=  ps.executeQuery();
			if(rs.next()){
				JSONObject jsonObject=new JSONObject();
				jsonObject.put("shareHolderName", rs.getString(1)+" "+rs.getString(2));
				jsonObject.put("memberId", rs.getString(3));
				getResultList().add(jsonObject.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();

		}
		return Action.SUCCESS;
	}

	public List<String> getResultList() {
		return resultList;
	}

	public void setResultList(List<String> resultList) {
		this.resultList = resultList;
	}

}
