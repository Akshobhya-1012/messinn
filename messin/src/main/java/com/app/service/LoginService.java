package com.app.service;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.*;
import com.app.dao.AdminDao;
import com.app.dao.CustomerDao;
import com.app.dao.LoginDao;
import com.app.dao.OwnerDao;
import com.app.dto.LoginAndSignUpSuccessDto;
import com.app.pojos.Admin;
import com.app.pojos.Customer;
import com.app.pojos.Login;
import com.app.pojos.Owner;
import com.app.pojos.Owner;
import com.app.dao.AdminDao;
import com.app.dao.CustomerDao;
import com.app.dao.LoginDao;
import com.app.dao.OwnerDao;

@Service
@Transactional
public class LoginService {
	
	@Autowired
	private LoginDao loginRepo;
	
	@Autowired
	private AdminDao adminRepo;
	
	@Autowired
	private CustomerDao custrepo;
	
	@Autowired
	private OwnerDao managerRepo;
	
	
	
	
	
	public LoginAndSignUpSuccessDto getById(String userName) {
		Login foundObj = loginRepo.findById(userName).orElseThrow();
		System.out.println(foundObj);
		if(foundObj.getRole().equals("ROLE_ADMIN")) {
			 Admin admin = adminRepo.findByLoginUsername(foundObj.getUsername());
			return new LoginAndSignUpSuccessDto(admin.getId(),admin.getName(), admin.getEmail(),admin.getMob(), foundObj.getUsername(),foundObj.getRole());
		}
		else if(foundObj.getRole().equals("ROLE_CUSTOMER")) {
			Customer cust = custrepo.findByLoginUsername(foundObj.getUsername());
			return new LoginAndSignUpSuccessDto(cust.getId(),cust.getName(), cust.getEmail(),cust.getMob(), foundObj.getUsername(),foundObj.getRole());
		}
		else if(foundObj.getRole().equals("ROLE_MANAGER")){
		    Owner manager = managerRepo.findByLoginUsername(foundObj.getUsername());
		    return new LoginAndSignUpSuccessDto(manager.getId(),manager.getName(), manager.getEmail(),manager.getMob(), foundObj.getUsername(),foundObj.getRole());
	    }
				
		throw new com.app.custom_exception.ResourceNotFoundException("login failed");
	}
   
}
