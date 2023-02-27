package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends BaseEntity {

	@Column(name="Admin",length = 30,unique = true)
	private String aName;
	@Column(name="E_mail",length = 30,unique = true)
	private String aEmail;
	@Column(name="Mobile",length = 30,unique = true)
	private String aMob;
	@Column(name="Password",length = 30,unique = true)
	private String aPassword;
	
	public Admin(String aName, String aEmail, String aMob, String aPassword) {
		super();
		this.aName = aName;
		this.aEmail = aEmail;
		this.aMob = aMob;
		this.aPassword = aPassword;
	}
	
	
	public Admin() {
		super();
		
	}


	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaMob() {
		return aMob;
	}
	public void setaMob(String aMob) {
		this.aMob = aMob;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}


	@Override
	public String toString() {
		return "Admin [aName=" + aName + ", aEmail=" + aEmail + ", aMob=" + aMob + "]";
	}
	
	
	
	
}
