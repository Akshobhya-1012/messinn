package com.app.service;

import java.util.List;

import com.app.dto.MessDTO;
import com.app.pojos.Mess;

public interface MessService {

	Mess updateMessDetails(MessDTO detachedMess);

	List<Mess> getAllMessDetails();

	Mess addMess(MessDTO transientMess);

	List<Mess> getMessByOwner(Long Id);

	Long noOfMess();

	Mess getMessByMess(Long Id);

	String deleteMess(Long messId);
}

