package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="owner")
public class Owner extends BaseEntity {

	@Column(name="owner_name",length = 30,unique = true)
	private String oName;
	@Column(name="E_mail",length = 30,unique = true)
	private String oEmail;
	@Column(name="Mobile",length = 30,unique = true)
	private String oMob;
	@Column(name="Password",length = 30,unique = true)
	private String oPassword;
	
	@OneToMany(mappedBy = "myOwner", cascade = CascadeType.ALL,orphanRemoval=true)
	private java.util.List<Mess> mess_list=new ArrayList<>();

	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(String oName, String oEmail, String oMob, String oPassword, List<Mess> mess_list) {
		super();
		this.oName = oName;
		this.oEmail = oEmail;
		this.oMob = oMob;
		this.oPassword = oPassword;
		this.mess_list = mess_list;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public String getoEmail() {
		return oEmail;
	}

	public void setoEmail(String oEmail) {
		this.oEmail = oEmail;
	}

	public String getoMob() {
		return oMob;
	}

	public void setoMob(String oMob) {
		this.oMob = oMob;
	}

	public String getoPassword() {
		return oPassword;
	}

	public void setoPassword(String oPassword) {
		this.oPassword = oPassword;
	}

	public java.util.List<Mess> getMess_list() {
		return mess_list;
	}

	public void setMess_list(java.util.List<Mess> mess_list) {
		this.mess_list = mess_list;
	}
	
	
}
