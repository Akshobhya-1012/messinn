package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.dto.SignUpDto;
import com.app.pojos.Admin;

@SpringBootTest
class TestUserService {

	@Autowired
	private AdminServiceImpl Service;
	
	@Autowired
	private CustomerServiceImpl cust;

	@Test
	void test() {
		assertNotNull(Service);
	}

	@Test
	public void testAddAdminDetails() {
		SignUpDto obj = new SignUpDto("akshobhya@gmail.com", "ak@123", "1234567890", "akshobhya", "aksho@22", "ROLE_ADMIN");
		Admin entity = Service.signUp(obj);
		assertEquals(1, entity.getId());
	}
	
	

//	@Test
//	public void testAddCustomerrDetails() {
//		SignupDto obj = new SignupDto("abhishek", "shewale", "abhi@gmail.com", "abhi@123", "9011007190", "abhi@27", "ROLE_CUSTOMER");
//		LoginAndSignUpSuccessDto entity = cust.addCustomerDetails(obj);
//		assertEquals(2, entity.getId());
//
//	}

}
