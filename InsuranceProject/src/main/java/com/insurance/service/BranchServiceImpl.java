package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Branch;
import com.insurance.model.Policy;
import com.insurance.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchRepository branchRepository;

	@Override
	public Branch saveBranch(Branch branch) {

		return branchRepository.save(branch);
	}

}
