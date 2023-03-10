package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.app.dto.CredentialsDTO;
import com.app.dto.DishDTO;
//import com.app.dto.DishDto;
import com.app.pojos.Dish;
import com.app.pojos.Dish;

public interface DishService {

	
	//Dish updateDishDetails(Dish detachedDish);

	String deleteDish(Long dishId);

	Dish addDish(Dish newDish);

	Boolean findByName(String name);

	List<Dish> getAllDishDetails();

	Dish updateDishDetails(DishDTO detachedDish);

	Long noOfDish();

	Dish getDishById(Long Id);
}
