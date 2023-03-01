package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends BaseEntity {

	@Column(name = "Admin_name", length = 30, unique = true)
	private String name;
	@Column(name = "E_mail", length = 30, unique = true)
	private String email;
	@Column(name = "Mobile", length = 30, unique = true)
	private String mob;
	@Column(name = "Password", length = 30, unique = true)
	private String password;
	
	public Admin() {
		super();
		
	}

	public Admin(String name, String email, String mob, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
		this.password = password;
	}

	public String getName() {
		return name;
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

	@Override
	public String toString() {
		return "Admin [name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}
	
	
	}
