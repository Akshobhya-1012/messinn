package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="dish")
public class Dish extends BaseEntity {

	@Column(name="Dish_name",length = 30,unique = true)
	private String name;
	@Column(name="Description",length = 30,unique = true)
	private String description;
	private double price;
	@OneToMany(mappedBy = "myDish", cascade = CascadeType.ALL,orphanRemoval=true, fetch=FetchType.EAGER)
	
	private java.util.List<Mess_dish> dish_mess_list=new ArrayList<>();
	public Dish(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		//this.dish_mess_list = dish_mess_list;
	}
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
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
	public java.util.List<Mess_dish> getDish_mess_list() {
		return dish_mess_list;
	}
	public void setDish_mess_list(java.util.List<Mess_dish> dish_mess_list) {
		this.dish_mess_list = dish_mess_list;
	}

	
	
	
	
	}
	
	
	
 
