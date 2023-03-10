package com.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.CredentialsDTO;
import com.app.dto.OwnerDTO;
import com.app.dto.SignUpDto;
import com.app.pojos.Customer;
import com.app.pojos.Owner;
import com.app.service.CustomerService;
import com.app.service.OwnerService;

@RestController
@CrossOrigin
@RequestMapping("/owner")
@Validated
public class OwnerController {

	@Autowired
	private OwnerService ownerService;
	
	@PostMapping("/signin")
	public ResponseEntity<?> validateOwner(@RequestBody @Valid CredentialsDTO dto) {
		return ResponseEntity.ok(ownerService.authenticateOwner(dto));
	}
	@PostMapping("/signup")
	public Owner registerOwner(@RequestBody SignUpDto transientOwner){
//		Boolean exist=ownerService.findByEmail(transientOwner.getEmail());
//		if(!exist)
		{
			
//			Owner own=new Owner(transientOwner.getName(),transientOwner.getEmail(), transientOwner.getMob(), transientOwner.getPassword());
//			ownerService.addOwner(transientOwner);
			return ownerService.addOwner(transientOwner);
			
		}
//		else
//			throw new ResourceNotFoundException("Email already exists!");

		
	} 
	
	@PostMapping("/update")
	public Owner updateOwnerDetails(@RequestBody OwnerDTO detachedOwner) {
		//System.out.println("in update emp " + detachedCustomer.getId());// not null
		return ownerService.updateOwnerDetails(detachedOwner);
	}
	
	@GetMapping("/count")
	public Long noOfOwners()
	{
		return ownerService.noOfOwners();
	}
	
}
