package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dish")
public class Dish extends BaseEntity {

	@Column(name="Dish",length = 30,unique = true)
	private String dName;
	@Column(name="Description",length = 30,unique = true)
	private String dDescription;
	
	@OneToMany(mappedBy = "myDish", cascade = CascadeType.ALL,orphanRemoval=true)
	private java.util.List<Mess_dish> dish_mess_list=new ArrayList<>();

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dish(String dName, String dDescription, List<Mess_dish> dish_mess_list) {
		super();
		this.dName = dName;
		this.dDescription = dDescription;
		this.dish_mess_list = dish_mess_list;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdDescription() {
		return dDescription;
	}

	public void setdDescription(String dDescription) {
		this.dDescription = dDescription;
	}

	public java.util.List<Mess_dish> getDish_mess_list() {
		return dish_mess_list;
	}

	public void setDish_mess_list(java.util.List<Mess_dish> dish_mess_list) {
		this.dish_mess_list = dish_mess_list;
	}
	
	
	
}
