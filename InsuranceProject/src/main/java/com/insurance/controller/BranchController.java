package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Branch;
import com.insurance.model.Policy;
import com.insurance.service.BranchService;
import com.insurance.service.PolicyService;

@RestController
public class BranchController {

	@Autowired
	private BranchService branchService;

	@PostMapping("/saveBranch")
	public ResponseEntity<Branch> saveBranch(@RequestBody Branch branch) {

		Branch branch1 = branchService.saveBranch(branch);

		return ResponseEntity.ok().body(branch1);

	}

}
