package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Premium;
import com.insurance.repository.PremiumRepository;

@Service
public class PremiumServiceImpl implements PremiumService {
	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public Premium getPremiumById(Integer Id) {

		Premium premium = premiumRepository.findById(Id);
		return premium;
	}

}
