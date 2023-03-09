package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="mess")
public class Mess extends BaseEntity {
	
	//private int mid;
	@Column(length = 30,unique = true)
	private String name;
	@Column(length = 30,unique = true)
	private String address;
	@Column(length = 30,unique = true)
	private String mob;
	
	@ManyToOne
	@JoinColumn(name="owner_fid")
	private Owner myOwner;

	@OneToMany(mappedBy = "myMess", cascade = CascadeType.ALL,orphanRemoval=true)
	private java.util.List<Mess_dish> mess_dish_list=new ArrayList<>();
	
	@OneToMany(mappedBy = "myMess", cascade = CascadeType.ALL,orphanRemoval=true)
	private java.util.List<Customer> customer=new ArrayList<>();

	public Mess() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mess(String mname, String maddress, String mmob, Owner myOwner, List<Mess_dish> mess_dish_list,
			List<Customer> customer) {
		super();
		this.name = mname;
		this.address = maddress;
		this.mob = mmob;
		this.myOwner = myOwner;
		this.mess_dish_list = mess_dish_list;
		this.customer = customer;
	}

	public String getMname() {
		return name;
	}

	public void setMname(String mname) {
		this.name = mname;
	}

	public String getMaddress() {
		return address;
	}

	public void setMaddress(String maddress) {
		this.address = maddress;
	}

	public String getMmob() {
		return mob;
	}

	public void setMmob(String mmob) {
		this.mob = mmob;
	}

	public Owner getMyOwner() {
		return myOwner;
	}

	public void setMyOwner(Owner myOwner) {
		this.myOwner = myOwner;
	}

	public java.util.List<Mess_dish> getMess_dish_list() {
		return mess_dish_list;
	}

	public void setMess_dish_list(java.util.List<Mess_dish> mess_dish_list) {
		this.mess_dish_list = mess_dish_list;
	}

	public java.util.List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(java.util.List<Customer> customer) {
		this.customer = customer;
	}
	
	
}
