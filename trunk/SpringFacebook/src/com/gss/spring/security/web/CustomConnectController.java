package com.gss.spring.security.web;

import javax.inject.Inject;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.web.ConnectController;
import org.springframework.stereotype.Controller;

@Controller
public class CustomConnectController extends ConnectController {

	@Inject
	public CustomConnectController(
			ConnectionFactoryLocator connectionFactoryLocator,
			ConnectionRepository connectionRepository) {
		super(connectionFactoryLocator, connectionRepository);
	}

	@Override
	protected String connectedView(String providerId) {
		System.out.println("Authenticated name : "+SecurityContextHolder.getContext().getAuthentication().getName());
		return "redirect:/welcome.htm";
	}

}
