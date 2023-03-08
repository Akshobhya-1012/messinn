package com.app.dto;

public class CustomerDTO {

	
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	private String email;
	private String password;
	private String mob;
	private String name;
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDTO(String name, String email,String mob,String password ) {
		super();
		this.email = email;
		this.password = password;
		this.mob = mob;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
