package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mess_dish")
public class Mess_dish extends BaseEntity {

	@Column(name="Description",length = 30)
	private String description;
	@Column(name="Price", nullable = false)
	private double price;
	@Column(name="Image",length = 30)
	private String image;
	
	@ManyToOne
	@JoinColumn(name="mess_fid")
	@JsonIgnore
	private Mess myMess;
	
	@ManyToOne
	@JoinColumn(name="dish_fid")
	@JsonIgnore
	private Dish myDish;
	
	@ManyToOne
	@JoinColumn(name="customer_fid")
	@JsonIgnore
	private Customer myCustomer;

	public Mess_dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mess_dish(String dDescription, double dPrice, String mdImage, Mess myMess, Dish myDish,
			Customer myCustomer) {
		super();
		this.description = dDescription;
		this.price = dPrice;
		this.image = mdImage;
		this.myMess = myMess;
		this.myDish = myDish;
		this.myCustomer = myCustomer;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String dDescription) {
		this.description = dDescription;
	}

	public double getdPrice() {
		return price;
	}

	public void setprice(double dPrice) {
		this.price = dPrice;
	}

	public String getMdImage() {
		return image;
	}

	public void setimage(String mdImage) {
		this.image = mdImage;
	}

	public Mess getMyMess() {
		return myMess;
	}

	public void setMyMess(Mess myMess) {
		this.myMess = myMess;
	}

	public Dish getMyDish() {
		return myDish;
	}

	public void setMyDish(Dish myDish) {
		this.myDish = myDish;
	}

	public Customer getMyCustomer() {
		return myCustomer;
	}

	public void setMyCustomer(Customer myCustomer) {
		this.myCustomer = myCustomer;
	}
	
	
}
