package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.service.ClaimService;

@RestController
@RequestMapping("/claim")
public class ClaimController {
	@Autowired
	private ClaimService claimService;

	@PostMapping("/save")
	public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim) {

		Claim claim1 = claimService.saveClaim(claim);
		return ResponseEntity.ok().body(claim1);

	}

}
