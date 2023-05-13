package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyUpdateRepository;
import com.insurance.service.PolicyUpdateService;

@Service
public class PolicyUpdateServiceImpl implements PolicyUpdateService {
	
	@Autowired
	private PolicyUpdateRepository policyUpdateRepository;

	@Override
	public Policy updatePolicy(Policy policy) {
		
		Integer interger = policy.getPolicyId();
		
		Policy policies= policyUpdateRepository.findById(interger).get();
		
		policies.setPolicyNumber(policy.getPolicyNumber());
		
		policies.setPolicyEffectiveDate(policy.getPolicyEffectiveDate());
		
		policies.setPolicyExpiryDate(policy.getPolicyExpiryDate());
		
		policies.setPayment_Option(policy.getPayment_Option());
		
		policies.setTotalAmount(policy.getTotalAmount());
		
		// policies.setStatus(policy.getStatus());
		
		policies.setCreatedDate(policy.getCreatedDate());
		
		policies.setAdditionalInfo(policy.getAdditionalInfo());

		Policy policy1 = policyUpdateRepository.save(policies);

		return policy1;

	}


}
