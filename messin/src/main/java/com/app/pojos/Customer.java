package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

	@Column(name = "Customer_name", length = 30, unique = true)
	private String name;
	@Column(name = "E_mail", length = 30, unique = true)
	private String email;
	@Column(name = "Mobile", length = 30, unique = true)
	private String mob;
	@Column(name = "Password", length = 30, unique = true)
	private String password;

	@OneToMany(mappedBy = "myCustomer", cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.EAGER)
	@JsonIgnore
	private java.util.List<Mess_dish> customer_dish_list = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "mess_fid")
	private Mess myMess;

	@OneToOne(mappedBy = "myCustomer", cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.EAGER)
	@JsonIgnore
	private Cart myCart;

	public Customer(){
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String email, String mob, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.util.List<Mess_dish> getCustomer_dish_list() {
		return customer_dish_list;
	}

	public void setCustomer_dish_list(java.util.List<Mess_dish> customer_dish_list) {
		this.customer_dish_list = customer_dish_list;
	}

	public Mess getMyMess() {
		return myMess;
	}

	public void setMyMess(Mess myMess) {
		this.myMess = myMess;
	}

	public Cart getMyCart() {
		return myCart;
	}

	public void setMyCart(Cart myCart) {
		this.myCart = myCart;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}

	@OneToOne
	@JoinColumn(name = "username", referencedColumnName = "username")
	private Login login;
	
}
