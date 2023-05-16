package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Premium;
import com.insurance.service.PremiumService;

@RestController
public class PremiumController {

	@Autowired
	private PremiumService premiumService;

	@PostMapping("/savePremium")
	public ResponseEntity<Premium> savePremiumDetails(@RequestBody Premium premium) {
		
		Premium premiums = premiumService.savePremiumDetails(premium);

		return ResponseEntity.ok().body(premiums);
	}

	@DeleteMapping("/delete/{id}")
	public void deletePremiumDetails(@PathVariable("id")Integer id) {
		premiumService.deletePremiumDetails(id);
	}
}
