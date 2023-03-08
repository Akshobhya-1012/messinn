package com.app.dto;

import org.springframework.beans.BeanUtils;

import com.app.pojos.Mess;

public class MessDTO {

	private String mName;
	private String mMob;
	private String mAddress;

	public MessDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessDTO(String mName, String mMob, String mAddress) {
		super();
		this.mName = mName;
		this.mMob = mMob;
		this.mAddress = mAddress;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmMob() {
		return mMob;
	}

	public void setmMob(String mMob) {
		this.mMob = mMob;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public static MessDTO fromEntity(Mess bus) {
		MessDTO dto = new MessDTO();
		BeanUtils.copyProperties(bus, dto);
		return dto;
	}

}
