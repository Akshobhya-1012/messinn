package com.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CredentialsDTO;
import com.app.service.CustomerService;
@RestController
@CrossOrigin
@RequestMapping("/customer")
@Validated
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/signin")
	public ResponseEntity<?> validateCustomer(@RequestBody @Valid CredentialsDTO dto) {
		return ResponseEntity.ok(customerService.authenticateCustomer(dto));
	}
	
}
