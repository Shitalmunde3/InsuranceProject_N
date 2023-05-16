package com.insurance.service;

import com.insurance.model.Policy;

public interface PolicyService {

	public Policy savePolicyDetails(Policy policy);
	
	public Policy savePolicy(Policy policy);
}
