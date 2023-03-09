package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Column(length=250)
	private String image;
	
	@ManyToOne
	@JoinColumn(name="owner_fid")
	@JsonIgnore
	private Owner myOwner;

	@OneToMany(mappedBy = "myMess", cascade = CascadeType.ALL,orphanRemoval=true )
	@JsonIgnore
	private java.util.List<Mess_dish> mess_dish_list=new ArrayList<>();
	
	@OneToMany(mappedBy = "myMess", cascade = CascadeType.ALL,orphanRemoval=true)
	@JsonIgnore
	private java.util.List<Customer> customer=new ArrayList<>();

	public Mess() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mess(String mname, String maddress, String mmob, Owner myOwner,String image) {
		super();
		this.name = mname;
		this.address = maddress;
		this.mob = mmob;
		this.myOwner = myOwner;
		this.image=image;
		//this.mess_dish_list = mess_dish_list;
		//this.customer = customer;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getname() {
		return name;
	}

	public void setname(String mname) {
		this.name = mname;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String maddress) {
		this.address = maddress;
	}

	public String getmob() {
		return mob;
	}

	public void setmob(String mmob) {
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

	@Override
	public String toString() {
		return "Mess [name=" + name + ", address=" + address + ", mob=" + mob + ", myOwner=" + myOwner + "]";
	}
	
	
}
