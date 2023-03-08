package com.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.CustomerDao;
import com.app.dto.ApiResponse;
import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDTO;
import com.app.dto.SignUpDto;
import com.app.pojos.Customer;
import com.app.pojos.Dish;
import com.app.pojos.Mess;
import com.app.service.CustomerService;
import com.app.service.DishService;

@RestController
@CrossOrigin
@RequestMapping("/mess")
@Validated
public class MessController {

	
	
}
