package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;

	@PostMapping("/insertData")
	public ResponseEntity<Policy> updatePolicy(@RequestBody Policy policy) {

		Policy policy1 = policyService.updatePolicy(policy);

		return ResponseEntity.ok().body(policy1);

	}

	@PostMapping("/updatePolicy")
	public Policy updatePolicies(@RequestBody Policy policy) {

		Policy policy2 = policyService.updatePolicy(policy);

		return policy2;
	}

}
