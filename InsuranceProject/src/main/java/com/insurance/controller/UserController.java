package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.model.Policy;
import com.insurance.model.User;
import com.insurance.service.ClaimService;
import com.insurance.service.UserService;
//Build the Restful web service to add user with multiple claim details
@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private ClaimService claimService;

	@PostMapping("/saveUserClaim")
	ResponseEntity<User> saveUserClaim(@RequestBody User user) {
		
		User user1 = userService.saveUser(user);
		List<Claim> claim1 = user.getClaimList();
		
		for (Claim claim : claim1) {
			claim.setUserid(user.getId());
			claimService.saveClaim(claim);
		}

		return ResponseEntity.ok().body(user);

	}

}
