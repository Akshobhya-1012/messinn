package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.LoginDao;
import com.app.pojos.Login;
import com.app.dao.*;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
	// dep : User Repo
	@Autowired
	private LoginDao loginRepo;
//This method will be auto invoked by spring sec : DaoAuthProvider
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// get user details from DB by user name
		 Login loggedObj = loginRepo.findById(userName).orElseThrow();
		//=> email verifed --now simply ret user details lifted form DB to the caller
		return new CustomUserDetails(loggedObj);
	}
}
