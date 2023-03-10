package com.app.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.app.pojos.Admin;

public class DishDTO {

	
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	private String name;
	private String description;
	private double price;
	public DishDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DishDTO(Long id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	

	
	
}
