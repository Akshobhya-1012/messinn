package com.app.service;

import java.util.List;

import com.app.dto.CredentialsDTO;
import com.app.dto.OwnerDTO;
import com.app.pojos.Admin;
import com.app.pojos.Owner;

public interface OwnerService {

	OwnerDTO authenticateOwner(CredentialsDTO dto);
	
	Owner fetchOwnerDetails(Long ownerId);
	
	Owner addOwner(Owner owner);
	
	String deleteOwner(Long ownerId);

	Boolean findByEmail(String email);

	//Owner updateOwnerDetails(Owner detachedOwner);

	List<Owner> getAllOwnerDetails();

	Owner updateOwnerDetails(OwnerDTO detachedOwner);

	Long noOfOwners();
}
