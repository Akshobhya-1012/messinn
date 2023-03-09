package com.app.dto;

import org.springframework.beans.BeanUtils;

import com.app.pojos.Mess;
import com.app.pojos.Owner;

public class MessDTO {

	
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	private String name;
	private String mob;
	private String address;
	private Long ownerid;
	
	//private Owner myOwner;
//	public Owner getMyOwner() {
//		return myOwner;
//	}
//
//	public void setMyOwner(Owner myOwner) {
//		this.myOwner = myOwner;
//	}

	public Long getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(Long ownerid) {
		this.ownerid = ownerid;
	}

	public MessDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessDTO(String mName, String mMob, String mAddress) {
		super();
		this.name = mName;
		this.mob = mMob;
		this.address = mAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String mName) {
		this.name = mName;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mMob) {
		this.mob = mMob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String mAddress) {
		this.address = mAddress;
	}

	public static MessDTO fromEntity(Mess bus) {
		MessDTO dto = new MessDTO();
		BeanUtils.copyProperties(bus, dto);
		return dto;
	}

}
