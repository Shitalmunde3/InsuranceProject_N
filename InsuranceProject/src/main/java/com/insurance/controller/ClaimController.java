package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.service.ClaimService;

@RestController
public class ClaimController {

	@Autowired
	private ClaimService claimService;

	@PostMapping("/insertClaim")
	public ResponseEntity<Claim> insertinClaim(@RequestBody Claim claim) {

		Claim claim2 = claimService.insertClaim(claim);

		return ResponseEntity.ok().body(claim2);
	}

}
