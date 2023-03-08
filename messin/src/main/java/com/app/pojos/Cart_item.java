package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_item")
public class Cart_item extends BaseEntity {

	
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Total_Price")
	private double totalPrice;
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart myCart;
	public Cart_item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart_item(int quantity, double totalPrice, Cart myCart) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.myCart = myCart;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Cart getMyCart() {
		return myCart;
	}
	public void setMyCart(Cart myCart) {
		this.myCart = myCart;
	}
	
	
	
	

}
