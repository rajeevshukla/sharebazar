package com.gss.spring.security.service.social;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

/**
 * This class loads the requested user by using a Spring Data JPA repository.
 */
public class RepositoryUserDetailsService implements SocialUserDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryUserDetailsService.class);

    public RepositoryUserDetailsService() {
    	
    	 System.out.println("social details service object is created..");
    	
    }

    /**
     * Loads the user information.
     * @param username  The username of the requested user.
     * @return  The information of the user.
     * @throws UsernameNotFoundException    Thrown if no user is found with the given username.
     */
  
    @Override
    public SocialUserDetails loadUserByUserId(String userId)  throws UsernameNotFoundException, DataAccessException {
               
    	 System.out.println("############################## load by userId method is called ############");
    	
    	
    	   return null;
    	 
    	
    }
}
