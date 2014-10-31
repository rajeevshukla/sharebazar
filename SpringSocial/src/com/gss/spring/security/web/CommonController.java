package com.gss.spring.security.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.UserIdSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

	@Autowired
	UserIdSource userId;
	@RequestMapping("login")
	public ModelAndView getLoginPage(){
		ModelAndView mav=new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping("welcome")
	public ModelAndView checked(){
		
		ModelAndView mav=new ModelAndView("welcome");
		
		System.out.println(userId.getUserId());
		return mav;
	}
	
}
