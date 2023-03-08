package com.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
import com.app.dto.DishDTO;
import com.app.dto.SignUpDto;
import com.app.pojos.Customer;
import com.app.pojos.Dish;
import com.app.service.CustomerService;
import com.app.service.DishService;

@RestController
@CrossOrigin
@RequestMapping("/dish")
@Validated
public class DishController {

	
	@Autowired
	private DishService dishService;
	
	@PutMapping
	public Dish updateDishDetails(@RequestBody DishDTO detachedDish) {
		//System.out.println("in update emp " + detachedCustomer.getId());// not null
		//Dish newDish=new Dish(detachedDish.getName(),detachedDish.getDescription());
		//newDish.setName(detachedDish.getName());
		//newDish.setDescription(detachedDish.getDescription());
		return dishService.updateDishDetails(detachedDish);
	}
	
	
	@DeleteMapping("/{dishId}")
	public ApiResponse deleteOwnerDetails(@PathVariable Long dishId) {

		return new ApiResponse(dishService.deleteDish(dishId));
	}
	
	@PostMapping("/signup")
    public ResponseEntity<?> registerDish(@RequestBody DishDTO transientDish){
//	Boolean exist=dishService.findByName(transientDish.getName());
//	if(!exist)
	{
		Dish newDish=new Dish(transientDish.getName(),transientDish.getDescription());
		//newDish.setName(transientDish.getName());
		//newDish.setDescription(transientDish.getDescription());
		
		dishService.addDish(newDish);
		return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
		
	}
//	else
//		throw new ResourceNotFoundException("Email already exists!");

	
}
	
	
	@GetMapping
	public List<Dish> getAllDish() {
		return dishService.getAllDishDetails();
	}
}
