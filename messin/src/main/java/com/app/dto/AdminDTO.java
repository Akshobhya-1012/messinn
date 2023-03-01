package com.app.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.app.pojos.Admin;




public class AdminDTO {
	
	private String name;
	private String email;
	private String password;
	private String mob;
	
	public AdminDTO() {
		// TODO Auto-generated constructor stub
	}

	

	

	public AdminDTO(String name, String email, String password, String mob) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mob = mob;
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

	@Override
	public String toString() {
		return "AdminDTO [name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}
	
//	public static AdminDTO fromEntity(Admin entity) {
//		AdminDTO dto = new AdminDTO();
//		BeanUtils.copyProperties(entity, dto);
//		return dto;
//	}
//
//	public static Admin toEntity(AdminDTO dto) {
//		Admin entity = new Admin();
//		BeanUtils.copyProperties(dto, entity);
//		return entity;
//	}
}

