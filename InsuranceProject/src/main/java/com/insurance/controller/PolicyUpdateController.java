package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.service.PolicyUpdateService;

@RestController
public class PolicyUpdateController {
	
	@Autowired
	private PolicyUpdateService policyUpdateService;

	@PostMapping("/updatePolicy")
	public Policy updatePolicies(@RequestBody Policy policy) {

		Policy policy2 = policyUpdateService.updatePolicy(policy);

		return policy2;
	}

}
