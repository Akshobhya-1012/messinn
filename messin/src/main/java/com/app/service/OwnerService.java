package com.app.service;

import com.app.dto.CredentialsDTO;
import com.app.dto.OwnerDTO;

public interface OwnerService {

	OwnerDTO authenticateOwner(CredentialsDTO dto);
}
