package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Customer;
import com.app.pojos.Dish;
import com.app.pojos.Owner;

public interface DishDao extends JpaRepository<Dish, Long>{
	
	Boolean findByName(String name);
	Dish getById(Long Id);
}
