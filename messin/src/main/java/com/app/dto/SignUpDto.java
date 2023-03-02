package com.app.dto;

public class SignUpDto {
	
	private String email;
	private String password;
	private String mob;
	private String name;
	public SignUpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SignUpDto(String email, String password, String mob, String name) {
		super();
		this.email = email;
		this.password = password;
		this.mob = mob;
		this.name = name;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "SignUpDto [email=" + email + ", mob=" + mob + ", name=" + name + "]";
	}
	
}
