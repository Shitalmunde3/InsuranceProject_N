package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Claim;
import com.insurance.repository.ClaimRepository;
import com.insurance.repository.UpdateClaimRepository;

@Service
public class UpdateClaimServiceImpl implements UpdateClaimService{
    @Autowired
	private UpdateClaimRepository updateClaimRepository;
	
	@Override
	public Claim updateClaim(Claim claim) {
		Integer id=claim.getId();
		Claim claim2=updateClaimRepository.findById(id).get();
		claim2.setPolicyId(claim.getPolicyId());
		claim2.setClaimId(claim.getClaimId());
		claim2.setClaimStatus(claim.getClaimStatus());
		claim2.setClaimAmount(claim.getClaimAmount());
		Claim claimm=updateClaimRepository.save(claim2);
		
		return claimm;
	}
	
	

}

