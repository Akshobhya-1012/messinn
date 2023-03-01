package com.app.dto;

import org.springframework.beans.BeanUtils;

import com.app.pojos.Owner;

public class OwnerDTO {

	private String name;
	private String email;
	private String mob;
	private String password;

	public OwnerDTO() {
		super();

	}

	public OwnerDTO(String name, String email, String mob, String password) {
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
		return "OwnerDTO [name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}

}
