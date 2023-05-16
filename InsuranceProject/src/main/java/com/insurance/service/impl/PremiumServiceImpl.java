package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Premium;
import com.insurance.repository.PremiumRepository;
import com.insurance.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public Premium savePremiumDetails(Premium premium) {
		Premium premiums = premiumRepository.save(premium);
		return premiums;
	}

	@Override
	public void deletePremiumDetails(Integer id) {
		Premium premium = premiumRepository.findById(id).orElse(null);

	}

}
