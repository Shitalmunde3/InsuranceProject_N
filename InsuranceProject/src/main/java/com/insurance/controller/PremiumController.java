package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Premium;
import com.insurance.service.PremiumService;
//Design API to get all the premium details from database
//Design API to get user with multiple premium details from database
@RestController
@RequestMapping
public class PremiumController {
	@Autowired
	private PremiumService premiumService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Premium> getPremiumById(@PathVariable("id") Integer id) {

		Premium premium = premiumService.getPremiumById(id);
		return ResponseEntity.ok().body(premium);

	}

}
