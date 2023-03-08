package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dish")
public class Dish extends BaseEntity {

	@Column(name="Dish_name",length = 30,unique = true)
	private String name;
	@Column(name="Description",length = 30,unique = true)
	private String description;
	
	@OneToMany(mappedBy = "myDish", cascade = CascadeType.ALL,orphanRemoval=true, fetch=FetchType.EAGER)
	private java.util.List<Mess_dish> dish_mess_list=new ArrayList<>();

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dish(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		//this.dish_mess_list = dish_mess_list;
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

	public java.util.List<Mess_dish> getDish_mess_list() {
		return dish_mess_list;
	}

	public void setDish_mess_list(java.util.List<Mess_dish> dish_mess_list) {
		this.dish_mess_list = dish_mess_list;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", description=" + description + "]";
	}

	
	
	}
	
	
	
 
