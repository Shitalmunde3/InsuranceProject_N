package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		Policy policy2 = policyRepository.save(policy);
		return policy2;
	}
	@Override
	public Policy updatePolicy(Policy policy) {
		
		Integer interger = policy.getPolicyId();
		
		Policy policies= policyRepository.findById(interger).get();
		
		policies.setPolicyNumber(policy.getPolicyNumber());
		
		policies.setPolicyEffectiveDate(policy.getPolicyEffectiveDate());
		
		policies.setPolicyExpiryDate(policy.getPolicyExpiryDate());
		
		policies.setPayment_Option(policy.getPayment_Option());
		
		policies.setTotalAmount(policy.getTotalAmount());
		
		// policies.setStatus(policy.getStatus());
		
		policies.setCreatedDate(policy.getCreatedDate());
		
		policies.setAdditionalInfo(policy.getAdditionalInfo());

		Policy policy1 = policyRepository.save(policies);

		return policy1;

	}

}
