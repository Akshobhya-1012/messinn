package com.app.service;

import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.pojos.Admin;

public interface AdminService {

	AdminDTO authenticateAdmin(CredentialsDTO dto);

	Admin findAdminByEmail(String email);

	Admin updatePassword(String email, String password);

	Admin save(Admin admin);

	Admin findAdminById(Long id);

}
