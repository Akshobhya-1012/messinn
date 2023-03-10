package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Cart_item;
import com.app.pojos.Dish;

@Repository
public interface Cart_itemDao extends JpaRepository<Cart_item, Long>{

	
}