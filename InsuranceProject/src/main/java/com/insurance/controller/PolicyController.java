package com.insurance.controller;
//Design restful web services to add policy details into database
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;


@RestController
public class PolicyController {
	@Autowired
	private PolicyService policyService;

	@PostMapping("/savePolicy")
	public ResponseEntity<Policy> savePolicy(@RequestBody Policy policy) {
		
		Policy policy1=policyService.savePolicyDetails(policy);
		
		return ResponseEntity.ok().body(policy1);
		
	}
	
}
