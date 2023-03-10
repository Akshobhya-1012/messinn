package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "owner")
public class Owner extends BaseEntity {

	@Column(name = "owner_name", length = 30, unique = true)
	private String name;
	@Column(name = "E_mail", length = 30, unique = true)
	private String email;
	@Column(name = "Mobile", length = 30, unique = true)
	private String mob;
	@Column(name = "Password", length = 30)
	private String password;

	@OneToMany(mappedBy = "myOwner", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.LAZY)
	@JsonIgnore
	private java.util.List<Mess> mess_list = new ArrayList<>();

	public Owner() {
		super();
		
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Owner(String name, String email, String mob, String password) {
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

	public java.util.List<Mess> getMess_list() {
		return mess_list;
	}

	public void setMess_list(java.util.List<Mess> mess_list) {
		this.mess_list = mess_list;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}
	
	@OneToOne
	@JoinColumn(name = "username", referencedColumnName = "username")
	private Login login;

}
