package com.app.dto;

import org.springframework.beans.BeanUtils;

import com.app.pojos.Owner;



public class OwnerDTO {
	
	
	private  String oName;
	private String oEmail;
	private String oMob;
	private String oPassword;
	
	public OwnerDTO() {
		super();
		
	}

	public OwnerDTO(String oName, String oEmail, String oMob, String oPassword) {
		super();
		this.oName = oName;
		this.oEmail = oEmail;
		this.oMob = oMob;
		this.oPassword = oPassword;
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

	@Override
	public String toString() {
		return "OwnerDTO [oName=" + oName + ", oEmail=" + oEmail + ", oMob=" + oMob + "]";
	}
	public static OwnerDTO fromEntity(Owner entity) {
		OwnerDTO dto = new OwnerDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	public static Owner toEntity(OwnerDTO dto) {
		Owner entity = new Owner();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
	
	
}
