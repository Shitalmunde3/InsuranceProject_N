package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicyDetails(Policy policy) {

		return policyRepository.save(policy);
	}

}
 