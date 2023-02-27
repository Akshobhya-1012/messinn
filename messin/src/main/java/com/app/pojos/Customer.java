package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer extends BaseEntity {

	@Column(name="Customer",length = 30,unique = true)
	private String cName;
	@Column(name="E_mail",length = 30,unique = true)
	private String cEmail;
	@Column(name="Mobile",length = 30,unique = true)
	private String cMob;
	@Column(name="Password",length = 30,unique = true)
	private String cPassword;
	
	@OneToMany(mappedBy = "myCustomer", cascade = CascadeType.ALL,orphanRemoval=true)
	private java.util.List<Mess_dish> customer_dish_list=new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="mess_fid")
	private Mess myMess;
	
	@OneToOne(mappedBy="myCustomer", cascade=CascadeType.ALL, orphanRemoval = true)
	private Cart myCart;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String cName, String cEmail, String cMob, String cPassword, List<Mess_dish> customer_dish_list,
			Mess myMess, Cart myCart) {
		super();
		this.cName = cName;
		this.cEmail = cEmail;
		this.cMob = cMob;
		this.cPassword = cPassword;
		this.customer_dish_list = customer_dish_list;
		this.myMess = myMess;
		this.myCart = myCart;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcMob() {
		return cMob;
	}

	public void setcMob(String cMob) {
		this.cMob = cMob;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
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
	
	

	
}









