package com.gss.spring.security.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.UserIdSource;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

	@Autowired
	UserIdSource userId;
	@Autowired
	ConnectionFactoryLocator connectionFactoryLocator;
	@Autowired
	ConnectionRepository connectionRepo;
	
	@RequestMapping("login")
	public ModelAndView getLoginPage(){
		
		ModelAndView mav=new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping("welcome")
	public ModelAndView checked(Principal currentUser){
		 ModelAndView mav=new ModelAndView("welcome");
	 System.out.println(connectionRepo.findAllConnections().size());
		 
		  Connection<Facebook> connection=  connectionRepo.findPrimaryConnection(Facebook.class);
		 
		   if(null!=connection){
			    Facebook facebook=connection.getApi();
			    System.out.println(facebook.isAuthorized());
			     System.out.println(facebook.userOperations().getUserProfile().getEmail());
			    
			    
			   System.out.println(connection.getDisplayName());
		   }else {
			   System.out.println("not found !!!!");
		   }
		  
         System.out.println(connectionFactoryLocator.getConnectionFactory(Facebook.class));
		System.out.println(userId.getUserId());
	return mav;
	}
	
}
