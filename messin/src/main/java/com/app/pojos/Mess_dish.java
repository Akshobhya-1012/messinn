package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="mess_dish")
public class Mess_dish extends BaseEntity {

	@Column(name="Description",length = 30)
	private String dDescription;
	@Column(name="Price", nullable = false)
	private double dPrice;
	@Column(name="Image",length = 30)
	private String mdImage;
	
	@ManyToOne
	@JoinColumn(name="mess_fid")
	private Mess myMess;
	
	@ManyToOne
	@JoinColumn(name="dish_fid")
	private Dish myDish;
	
	@ManyToOne
	@JoinColumn(name="customer_fid")
	private Customer myCustomer;

	public Mess_dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mess_dish(String dDescription, double dPrice, String mdImage, Mess myMess, Dish myDish,
			Customer myCustomer) {
		super();
		this.dDescription = dDescription;
		this.dPrice = dPrice;
		this.mdImage = mdImage;
		this.myMess = myMess;
		this.myDish = myDish;
		this.myCustomer = myCustomer;
	}

	public String getdDescription() {
		return dDescription;
	}

	public void setdDescription(String dDescription) {
		this.dDescription = dDescription;
	}

	public double getdPrice() {
		return dPrice;
	}

	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}

	public String getMdImage() {
		return mdImage;
	}

	public void setMdImage(String mdImage) {
		this.mdImage = mdImage;
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
