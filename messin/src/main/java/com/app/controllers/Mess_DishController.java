package com.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.CredentialsDTO;
import com.app.dto.DishDTO;
import com.app.dto.Mess_DishDTO;
import com.app.dto.OwnerDTO;
import com.app.pojos.Admin;
import com.app.pojos.Dish;
import com.app.pojos.Owner;
import com.app.pojos.Mess_dish;
import com.app.service.AdminService;
import com.app.service.CustomerService;
import com.app.service.Mess_dishService;
import com.app.service.OwnerService;

@RestController
@CrossOrigin
@RequestMapping("/mess_dish")
@Validated
public class Mess_DishController {

	@Autowired
	private Mess_dishService mess_DishService;
	
	@PostMapping("/signup")
	public Mess_dish registerDish(@RequestBody Mess_DishDTO transientDish){

		return mess_DishService.addDishToMess(transientDish);
		
	}
	
	
	
}//class
