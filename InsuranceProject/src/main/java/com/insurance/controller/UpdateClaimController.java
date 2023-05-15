package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.service.ClaimService;
import com.insurance.service.UpdateClaimService;

@RestController
@RequestMapping("/update")
public class UpdateClaimController {
	@Autowired
	private UpdateClaimService updateClaimService;

	@PutMapping("/updateClaim")
	public Claim updateClaim(@RequestBody Claim claim) {

		Claim claim2 = updateClaimService.updateClaim(claim);
		return claim2;

	}

}
