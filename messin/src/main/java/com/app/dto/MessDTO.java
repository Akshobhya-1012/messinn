package com.app.dto;

import org.springframework.beans.BeanUtils;

import com.app.pojos.Mess;

public class MessDTO {

	private String name;
	private String mob;
	private String address;

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
