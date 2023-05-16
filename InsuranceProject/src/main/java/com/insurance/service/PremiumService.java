package com.insurance.service;

import com.insurance.model.Premium;

public interface PremiumService {

	public Premium savePremiumDetails(Premium premium);

	public void deletePremiumDetails(Integer id);
}
