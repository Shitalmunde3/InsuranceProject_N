package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Claim;
import com.insurance.repository.ClaimRepository;
@Service
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	private ClaimRepository claimRepository;
	
	@Override
	public Claim saveClaim(Claim claim) {
	
		return claimRepository.save(claim);
	}
	


}
