package com.app.pojos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "logins")
public class Login implements Serializable{
	@Id @Column(length = 20, unique = true, updatable = false, nullable = false)
	private String username;

	@Column(nullable = false)
	@JsonIgnore
	private String password;
	
	@Column(length = 20,nullable = false)
	private String role;

	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonIgnore
	private Admin admin;

	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonIgnore
	private Customer customer;
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonIgnore
	private Owner Owner;
	
	
	

	public Login(String username, String password,String role) {
		super();
		this.username = username;
		this.password = password;
		this.role=role;
	}

	public Login() {
		super();
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Owner Owner() {
		return Owner;
	}

	public void setManager(Owner Owner) {
		this.Owner = Owner;
	}

	

	@Override
	public String toString() {
		return "Login [username=" + username + "]";
	}	
}