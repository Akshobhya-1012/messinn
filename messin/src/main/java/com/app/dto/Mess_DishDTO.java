package com.app.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.app.pojos.Dish;
import com.app.pojos.Mess;
import com.app.pojos.Mess_dish;
public class Mess_DishDTO {

	private String description;
	private double price;
	private String image;
	private Long messId;
	private Long dishId;
	public Mess_DishDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mess_DishDTO(String description, double price, String image, Long messId, Long dishId) {
		super();
		this.description = description;
		this.price = price;
		this.image = image;
		this.messId = messId;
		this.dishId = dishId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getMessId() {
		return messId;
	}
	public void setMessId(Long messId) {
		this.messId = messId;
	}
	public Long getDishId() {
		return dishId;
	}
	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}
	
	
	
	
	
}
