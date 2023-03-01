package com.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.dto.Response;
import com.app.pojos.Admin;
import com.app.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/admin")
@Validated
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/signin")
	public ResponseEntity<?> validateAdmin(@RequestBody @Valid CredentialsDTO dto) {
		return ResponseEntity.ok(adminService.authenticateAdmin(dto));

	}
	
	

}
