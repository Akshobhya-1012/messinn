package com.app.service;

import com.app.dto.CredentialsDTO;
import com.app.dto.OwnerDTO;
import com.app.pojos.Admin;
import com.app.pojos.Owner;

public interface OwnerService {

	OwnerDTO authenticateOwner(CredentialsDTO dto);
	
	Owner fetchOwnerDetails(Long ownerId);
	
	Owner addOwner(Owner owner);
	
	String deleteOwner(Long ownerId);
}
