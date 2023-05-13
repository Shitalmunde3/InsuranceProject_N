package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;

import com.insurance.model.Claim;

public interface ClaimRepository extends CrudRepository<Claim, Integer>{

}
